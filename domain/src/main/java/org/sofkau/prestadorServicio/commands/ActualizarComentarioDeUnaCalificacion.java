package org.sofkau.prestadorServicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;
import org.sofkau.prestadorServicio.values.CalificacionId;
import org.sofkau.prestadorServicio.values.Comentario;

public class ActualizarComentarioDeUnaCalificacion extends Command {
    private final PrestadorServicioId prestadorServicioId;
    private final Comentario comentario;
    private final CalificacionId calificacionId;

    public ActualizarComentarioDeUnaCalificacion(PrestadorServicioId prestadorServicioId, Comentario comentario, CalificacionId calificacionId){
        this.prestadorServicioId = prestadorServicioId;
        this.comentario = comentario;
        this.calificacionId = calificacionId;
    }

    public CalificacionId calificacionId() {
        return calificacionId;
    }

    public Comentario comentario() {
        return comentario;
    }

    public PrestadorServicioId prestadorServicioId() {
        return prestadorServicioId;
    }
}
