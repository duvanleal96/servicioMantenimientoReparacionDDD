package org.sofkau.prestadorServicio;


import co.com.sofka.domain.generic.Entity;
import org.sofkau.prestadorServicio.values.CalificacionId;
import org.sofkau.prestadorServicio.values.Comentario;
import org.sofkau.prestadorServicio.values.Puntaje;

public class Calificacion extends Entity<CalificacionId> {
    protected Comentario comentario;
    protected Puntaje puntaje;

    public Calificacion(CalificacionId calificacionId, Comentario comentario, Puntaje puntaje) {
        super(calificacionId);
        this.comentario = comentario;
        this.puntaje = puntaje;
    }

    public Comentario comentario() {
        return comentario;
    }

    public Puntaje puntaje() {
        return puntaje;
    }

    public void actualizarComentario(Comentario comentario){
        this.comentario = comentario.actualizarComentario(comentario);
    }
    public void actualizarPuntaje(Puntaje puntaje){
        this.puntaje = puntaje.actualizarPuntaje(puntaje);
    }
}
