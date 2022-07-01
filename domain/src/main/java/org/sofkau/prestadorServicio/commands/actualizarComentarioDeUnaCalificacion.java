package org.sofkau.prestadorServicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.prestadorServicio.PrestadorServicioId;
import org.sofkau.prestadorServicio.values.CalificacionId;
import org.sofkau.prestadorServicio.values.Comentario;

public class actualizarComentarioDeUnaCalificacion extends Command {
    private final PrestadorServicioId prestadorServicioId;
    private final Comentario comentario;
    private final CalificacionId calificacionId;

    public actualizarComentarioDeUnaCalificacion(PrestadorServicioId prestadorServicioId,Comentario comentario, CalificacionId calificacionId){
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
