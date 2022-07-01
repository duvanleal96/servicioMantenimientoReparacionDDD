package org.sofkau.prestadorServicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.values.Disponibilidad;
import org.sofkau.prestadorServicio.values.HorarioId;

public class DisponibilidadDeUnHorarioActualizada extends DomainEvent {
    private final Disponibilidad disponibilidad;
    private final HorarioId horarioId;

    public DisponibilidadDeUnHorarioActualizada(Disponibilidad disponibilidad, HorarioId horarioId) {
        super("org.sofkau.DisponibilidadDeUnHorarioActualizada");
        this.disponibilidad = disponibilidad;
        this.horarioId = horarioId;
    }

    public Disponibilidad disponibilidad() {
        return disponibilidad;
    }
    public HorarioId horarioId() {
        return horarioId;
    }
}
