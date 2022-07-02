package org.sofkau.prestadorServicio;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sofkau.prestadorServicio.commands.CrearPrestadorDeServicio;
import org.sofkau.prestadorServicio.events.PrestadorDeServiciosCreado;
import org.sofkau.prestadorServicio.values.CargoId;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;
import java.util.List;

class CrearPrestadorServicioUseCaseTest {
    @Test
    public void crearPrestadorServicio(){
        //Arrange
        var idPrestadorServicio= PrestadorServicioId.of("1");
        var idCargo= new CargoId();
        var command = new CrearPrestadorDeServicio(idPrestadorServicio,idCargo);
        var useCase = new CrearPrestadorServicioUseCase();
        //Act
        List<DomainEvent> events= UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //Assert
        PrestadorDeServiciosCreado event = (PrestadorDeServiciosCreado) events.get(0);
        Assertions.assertEquals(PrestadorServicioId.of("1"),event.PrestadorServicioId());
    }
}