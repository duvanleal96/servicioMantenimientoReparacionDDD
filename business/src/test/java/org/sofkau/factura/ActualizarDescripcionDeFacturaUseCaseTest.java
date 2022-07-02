package org.sofkau.factura;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofkau.factura.commands.ActualizarDescripcionDeUnaFactura;
import org.sofkau.factura.events.DescripcionDeUnaFacturaActualizada;
import org.sofkau.factura.events.FacturaCreada;
import org.sofkau.factura.values.Descripcion;
import org.sofkau.factura.values.FacturaId;
import org.sofkau.factura.values.Fecha;
import org.sofkau.servicio.values.ServicioId;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarDescripcionDeFacturaUseCaseTest  {
    @InjectMocks
    ActualizarDescripcionDeFacturaUseCase useCase;
    @Mock
    DomainEventRepository repository;
    @Test
    public void actualizarDescripcionFactura(){
        //Arrange
        FacturaId facturaId= FacturaId.of("1");
        Descripcion descripcion= new Descripcion("hola");
        var command = new ActualizarDescripcionDeUnaFactura(facturaId,descripcion);
        when(repository.getEventsBy(facturaId.value())).thenReturn(history());
        useCase.addRepository(repository);
        //Act
        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Assert
        var event = (DescripcionDeUnaFacturaActualizada)events.get(0);
        Assertions.assertEquals("hola",event.descripcion().value());
    }

    private List<DomainEvent> history() {
        FacturaId facturaId= FacturaId.of("1");
        ServicioId servicioId=ServicioId.of("2");
        Descripcion descripcion= new Descripcion("");
        Fecha fecha = new Fecha(LocalDate.now());
        return List.of(
                new FacturaCreada(facturaId,servicioId,fecha,descripcion)
        );
    }
}