package org.sofkau.prestadorServicio;

import co.com.sofka.domain.generic.EventChange;
import org.sofkau.prestadorServicio.events.CalificacionAgregada;
import org.sofkau.prestadorServicio.events.ComentarioDeUnaCalificacionActualizada;
import org.sofkau.prestadorServicio.events.HorarioAgregado;
import org.sofkau.prestadorServicio.events.PrestadorDeServiciosCreado;

import java.util.HashSet;

public class PrestadorServicioEventChange extends EventChange {
    public PrestadorServicioEventChange(PrestadorServicio prestadorServicio) {
        apply((PrestadorDeServiciosCreado event)->{
            prestadorServicio.cargo=event.Cargo();
            prestadorServicio.calificaciones=new HashSet<>();
            prestadorServicio.horarios=new HashSet<>();
        });
        apply((CalificacionAgregada event)->{
            prestadorServicio.calificaciones.add(event.calificacion());
        });
        apply((HorarioAgregado event)->{
            prestadorServicio.horarios.add(event.horario());
        });
        apply((ComentarioDeUnaCalificacionActualizada event)->{
            Calificacion calificacion = prestadorServicio.getCalificacionPorID(event.calificacionId())
                    .orElseThrow(()->new IllegalArgumentException("calificacion no encontrada"));
            calificacion.actualizarComentario(event.comentario());
        });
    }

}
