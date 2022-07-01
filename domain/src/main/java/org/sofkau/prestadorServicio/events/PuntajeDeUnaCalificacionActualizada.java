package org.sofkau.prestadorServicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.values.CalificacionId;
import org.sofkau.prestadorServicio.values.Puntaje;

public class PuntajeDeUnaCalificacionActualizada extends DomainEvent {
    private final Puntaje puntaje;
    private final CalificacionId calificacionId;

    public PuntajeDeUnaCalificacionActualizada(Puntaje puntaje, CalificacionId calificacionId) {
        super("org.sofkau.PuntajeDeUnaCalificacionActualizada");
        this.puntaje = puntaje;
        this.calificacionId = calificacionId;
    }

    public CalificacionId calificacionId() {
        return calificacionId;
    }

    public Puntaje puntaje() {
        return puntaje;
    }
}
