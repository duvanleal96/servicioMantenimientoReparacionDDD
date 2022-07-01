package org.sofkau.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.servicio.values.Descripcion;
import org.sofkau.servicio.values.OrdenServicioId;

public class DescripcionOrdenServicioActualizado extends DomainEvent {
    private final Descripcion descripcion;
    private final OrdenServicioId ordenServicioId;

    public DescripcionOrdenServicioActualizado(Descripcion descripcion, OrdenServicioId ordenServicioId) {
        super("org.sofkau.OrdenServicioActualizado");

        this.descripcion = descripcion;
        this.ordenServicioId = ordenServicioId;
    }

    public OrdenServicioId ordenServicioId() {
        return ordenServicioId;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
