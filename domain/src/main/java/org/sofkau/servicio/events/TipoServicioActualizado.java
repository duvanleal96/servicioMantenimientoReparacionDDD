package org.sofkau.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.servicio.values.OrdenServicioId;
import org.sofkau.servicio.TipoServicio;

public class TipoServicioActualizado extends DomainEvent {
    private final TipoServicio tipoServicio;

    public TipoServicioActualizado(TipoServicio tipoServicio, OrdenServicioId ordenServicioId) {
        super("org.sofkau.TipoServicioActualizado");
        this.tipoServicio = tipoServicio;
    }

    public TipoServicio tipoServicio() {
        return tipoServicio;
    }
}
