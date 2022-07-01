package org.sofkau.prestadorServicio;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.prestadorServicio.values.HorarioId;
import org.sofkau.prestadorServicio.values.Disponibilidad;
import org.sofkau.prestadorServicio.values.Fecha;

public class Horario extends Entity<HorarioId> {
    protected Fecha fecha;
    protected Disponibilidad disponibilidad;

    public Horario(HorarioId horarioId, Fecha fecha, Disponibilidad disponibilidad) {
        super(horarioId);
        this.fecha = fecha;
        this.disponibilidad = disponibilidad;
    }
    public Fecha fecha(){
        return fecha;
    }

    public Disponibilidad Disponibilidad() {
        return disponibilidad;
    }

    public void actualizarFecha(Fecha fecha){
        this.fecha = fecha.actualizarFecha(fecha);
    }
    public void actualizarDisponibilidad(Disponibilidad disponibilidad){
        this.disponibilidad = disponibilidad.actualizarDisponibilidad(disponibilidad);
    }
}
