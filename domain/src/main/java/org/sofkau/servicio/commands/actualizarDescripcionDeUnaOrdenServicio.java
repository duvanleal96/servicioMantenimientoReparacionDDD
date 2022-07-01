package org.sofkau.servicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.servicio.values.Descripcion;
import org.sofkau.servicio.values.OrdenServicioId;
import org.sofkau.servicio.values.ServicioId;

public class actualizarDescripcionDeUnaOrdenServicio extends Command {
    private final OrdenServicioId ordenServicioId;
    private final Descripcion descripcion;
    private final ServicioId servicioId;

    public actualizarDescripcionDeUnaOrdenServicio(OrdenServicioId ordenServicioId, Descripcion descripcion, ServicioId servicioId) {
        this.ordenServicioId = ordenServicioId;
        this.descripcion = descripcion;
        this.servicioId = servicioId;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public OrdenServicioId getOrdenServicioId() {
        return ordenServicioId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
