package org.sofkau.servicio;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sofkau.prestadorServicio.CrearPrestadorServicioUseCase;
import org.sofkau.prestadorServicio.commands.CrearPrestadorDeServicio;
import org.sofkau.prestadorServicio.events.PrestadorDeServiciosCreado;
import org.sofkau.prestadorServicio.values.CargoId;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;
import org.sofkau.servicio.commands.CrearServicio;
import org.sofkau.servicio.events.ServicioCreado;
import org.sofkau.servicio.values.ClienteId;
import org.sofkau.servicio.values.ServicioId;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearServicioUseCaseTest {
    @Test
    public void crearServicio(){
        //Arrange
        var idServicio= ServicioId.of("1");
        var idCliente= new ClienteId();
        var idPrestadorServicio= new PrestadorServicioId();
        var command = new CrearServicio(idServicio,idCliente,idPrestadorServicio);
        var useCase = new CrearServicioUseCase();
        //Act
        List<DomainEvent> events= UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Assert
        ServicioCreado event = (ServicioCreado) events.get(0);
        Assertions.assertEquals(ServicioId.of("1"),event.servicioId());
    }
}