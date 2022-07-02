package org.sofkau.factura;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sofkau.factura.commands.CrearFactura;
import org.sofkau.factura.events.FacturaCreada;
import org.sofkau.factura.values.Descripcion;
import org.sofkau.factura.values.FacturaId;
import org.sofkau.factura.values.Fecha;
import org.sofkau.servicio.values.ServicioId;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearFacturaUseCaseTest
{
    @Test
    public void crearNuevaFactura(){

        var idFactura= FacturaId.of("1");
        var idServicio= new ServicioId();
        var fecha= new Fecha(LocalDate.now());
        Descripcion descripcion = new Descripcion("");
        var command = new CrearFactura(idFactura,idServicio,fecha,descripcion);
        var useCase = new CrearFacturaUseCase();

        List<DomainEvent>events= UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        FacturaCreada event = (FacturaCreada) events.get(0);
        Assertions.assertEquals(FacturaId.of("1"),event.facturaId());
    }

}