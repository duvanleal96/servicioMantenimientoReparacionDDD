package org.sofkau.prestadorServicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.values.CalificacionId;
import org.sofkau.prestadorServicio.values.Comentario;

public class ComentarioDeUnaCalificacionActualizada extends DomainEvent {
    private final Comentario comentario;
    private final CalificacionId calificacionId;

    public ComentarioDeUnaCalificacionActualizada(Comentario comentario,CalificacionId calificacionId) {
        super("org.sofkau.ComentarioDeUnaCalificacionActualizada");
        this.comentario = comentario;
        this.calificacionId = calificacionId;
    }

    public Comentario comentario() {
        return comentario;
    }

    public CalificacionId calificacionId() {
        return calificacionId;
    }
}
