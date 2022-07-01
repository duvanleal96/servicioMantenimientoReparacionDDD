package org.sofkau.prestadorServicio;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofkau.prestadorServicio.events.CalificacionAgregada;
import org.sofkau.prestadorServicio.events.ComentarioDeUnaCalificacionActualizada;
import org.sofkau.prestadorServicio.events.HorarioAgregado;
import org.sofkau.prestadorServicio.events.PrestadorDeServiciosCreado;
import org.sofkau.prestadorServicio.values.CalificacionId;
import org.sofkau.prestadorServicio.values.Comentario;
import org.sofkau.prestadorServicio.values.Puntaje;

import java.util.Optional;
import java.util.Set;

public class PrestadorServicio extends AggregateEvent<PrestadorServicioId> {
    protected Cargo cargo;
    protected Set<Calificacion> calificaciones;
    protected Set<Horario> horarios;

    protected Comentario comentario;

    public PrestadorServicio(PrestadorServicioId prestadorServicioId, Cargo cargo) {
        super(prestadorServicioId);
        appendChange(new PrestadorDeServiciosCreado(prestadorServicioId,cargo)).apply();
        subscribe(new PrestadorServicioEventChange(this));
    }
    public void agregarCalificacion(Calificacion calificacion){
        appendChange(new CalificacionAgregada(calificacion)).apply();
    }
    public void agregarHorario(Horario horario){
        appendChange(new HorarioAgregado(horario)).apply();
    }
    public void actualizarComentarioDeUnaCalificacion(Comentario comentario, CalificacionId calificacionId){
        appendChange(new ComentarioDeUnaCalificacionActualizada(comentario,calificacionId)).apply();
    }
    public void actualizarPuntajeDeUnaCalificacion(Puntaje puntaje, CalificacionId calificacionId){
        appendChange(new PuntajeDeUnaCalificacionActualizada(puntaje,calificacionId)).apply();
    }
    public Optional <Calificacion> getCalificacionPorID(CalificacionId calificacionId){
        return calificaciones().stream().filter(calificacion -> calificacion.identity().equals(calificacionId)).findFirst();
    }

    public Cargo cargo() {
        return cargo;
    }

    public Set<Calificacion> calificaciones() {
        return calificaciones;
    }

    public Set<Horario> horarios() {
        return horarios;
    }
}
