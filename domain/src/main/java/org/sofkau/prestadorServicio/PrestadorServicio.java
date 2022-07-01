package org.sofkau.prestadorServicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.events.*;
import org.sofkau.prestadorServicio.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class PrestadorServicio extends AggregateEvent<PrestadorServicioId> {
    protected Cargo cargo;
    protected Set<Calificacion> calificaciones;
    protected Set<Horario> horarios;

    protected Comentario comentario;
    protected Puntaje puntaje;
    protected Disponibilidad disponibilidad;
    protected Nombre nombre;

    public PrestadorServicio(PrestadorServicioId prestadorServicioId, Cargo cargo) {
        super(prestadorServicioId);
        appendChange(new PrestadorDeServiciosCreado(prestadorServicioId,cargo)).apply();
        subscribe(new PrestadorServicioEventChange(this));
    }
    private PrestadorServicio(PrestadorServicioId prestadorServicioId){
        super(prestadorServicioId);
        subscribe(new PrestadorServicioEventChange(this));
    }
    public static PrestadorServicio from(PrestadorServicioId prestadorServicioId, List<DomainEvent> events){
        var prestadorServicio=new PrestadorServicio(prestadorServicioId);
        events.forEach(prestadorServicio::applyEvent);
        return prestadorServicio;
    }
    public void agregarCalificacion(Calificacion calificacion){
        appendChange(new CalificacionAgregada(calificacion)).apply();
    }
    public void agregarHorario(Horario horario){
        appendChange(new HorarioAgregado(horario)).apply();
    }

    public void actualizarComentarioDeUnaCalificacion(Comentario comentario, CalificacionId calificacionId){
        Objects.requireNonNull(comentario);
        Objects.requireNonNull(calificacionId);
        appendChange(new ComentarioDeUnaCalificacionActualizada(comentario,calificacionId)).apply();
    }
    public void actualizarPuntajeDeUnaCalificacion(Puntaje puntaje, CalificacionId calificacionId){
        appendChange(new PuntajeDeUnaCalificacionActualizada(puntaje,calificacionId)).apply();
    }
    public void actualizarDisponibilidadDeUnHorario(Disponibilidad disponibilidad, HorarioId horarioId){
        appendChange(new DisponibilidadDeUnHorarioActualizada(disponibilidad,horarioId)).apply();
    }
    public void actualizarNombreDeUnCargo(Nombre nombre,CargoId cargoId){
        appendChange(new NombreDeUnCargoActualizado(nombre,cargoId)).apply();
    }
    public Optional <Calificacion> getCalificacionPorID(CalificacionId calificacionId){
        return calificaciones().stream().filter(calificacion -> calificacion.identity().equals(calificacionId)).findFirst();
    }
    public Optional <Horario> getHorarioPorID(HorarioId horarioId){
        return horarios().stream().filter(horario -> horario.identity().equals(horarioId)).findFirst();
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

    public Comentario comentario() {
        return comentario;
    }

    public Puntaje puntaje() {
        return puntaje;
    }

    public Disponibilidad disponibilidad() {
        return disponibilidad;
    }

    public Nombre nombre() {
        return nombre;
    }
}
