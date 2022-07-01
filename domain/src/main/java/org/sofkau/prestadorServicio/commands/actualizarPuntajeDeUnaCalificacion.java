package org.sofkau.prestadorServicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.prestadorServicio.PrestadorServicioId;
import org.sofkau.prestadorServicio.values.CalificacionId;
import org.sofkau.prestadorServicio.values.Puntaje;

public class actualizarPuntajeDeUnaCalificacion extends Command {
    private final PrestadorServicioId prestadorServicioId;
    private final Puntaje puntaje;
    private final CalificacionId calificacionId;

    public actualizarPuntajeDeUnaCalificacion(PrestadorServicioId prestadorServicioId, Puntaje puntaje, CalificacionId calificacionId) {
        this.prestadorServicioId = prestadorServicioId;
        this.puntaje = puntaje;
        this.calificacionId = calificacionId;
    }

    public CalificacionId calificacionId() {
        return calificacionId;
    }

    public Puntaje puntaje() {
        return puntaje;
    }

    public PrestadorServicioId prestadorServicioId() {
        return prestadorServicioId;
    }
}
