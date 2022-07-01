package org.sofkau.prestadorServicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.Calificacion;

public class CalificacionAgregada extends DomainEvent {
    private final Calificacion calificacion;

    public CalificacionAgregada(Calificacion calificacion) {
        super("org.sofkau.CalificacionAgregada");

        this.calificacion = calificacion;
    }

    public Calificacion calificacion() {
        return calificacion;
    }
}
