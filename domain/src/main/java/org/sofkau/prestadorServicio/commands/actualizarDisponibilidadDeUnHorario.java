package org.sofkau.prestadorServicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.prestadorServicio.PrestadorServicioId;
import org.sofkau.prestadorServicio.values.Disponibilidad;
import org.sofkau.prestadorServicio.values.HorarioId;

public class actualizarDisponibilidadDeUnHorario extends Command {
    private final PrestadorServicioId prestadorServicioId;
    private final Disponibilidad disponibilidad;
    private final HorarioId horarioId;

    public actualizarDisponibilidadDeUnHorario(PrestadorServicioId prestadorServicioId, Disponibilidad disponibilidad, HorarioId horarioId) {
        this.prestadorServicioId = prestadorServicioId;
        this.disponibilidad = disponibilidad;
        this.horarioId = horarioId;
    }

    public Disponibilidad disponibilidad() {
        return disponibilidad;
    }

    public HorarioId horarioId() {
        return horarioId;
    }

    public PrestadorServicioId prestadorServicioId() {
        return prestadorServicioId;
    }
}
