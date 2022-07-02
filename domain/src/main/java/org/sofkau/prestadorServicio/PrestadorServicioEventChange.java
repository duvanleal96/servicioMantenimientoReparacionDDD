package org.sofkau.prestadorServicio;

import co.com.sofka.domain.generic.EventChange;
import org.sofkau.prestadorServicio.events.*;
import org.sofkau.prestadorServicio.values.Nombre;

import java.util.HashSet;

public class PrestadorServicioEventChange extends EventChange {
    public PrestadorServicioEventChange(PrestadorServicio prestadorServicio) {
        apply((PrestadorDeServiciosCreado event)->{
            prestadorServicio.cargoId=event.CargoId();
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
        apply((PuntajeDeUnaCalificacionActualizada event)->{
            Calificacion calificacion = prestadorServicio.getCalificacionPorID(event.calificacionId())
                    .orElseThrow(()->new IllegalArgumentException("calificacion no encontrada"));
            calificacion.actualizarPuntaje(event.puntaje());
        });
        apply((DisponibilidadDeUnHorarioActualizada event)->{
            Horario horario = prestadorServicio.getHorarioPorID(event.horarioId())
                    .orElseThrow(()->new IllegalArgumentException("Horario no encontrado"));
            horario.actualizarDisponibilidad(event.disponibilidad());
        });
    }

}
