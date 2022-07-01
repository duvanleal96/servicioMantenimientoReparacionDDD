package org.sofkau.prestadorServicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.Horario;

public class HorarioAgregado extends DomainEvent {
    private final Horario horario;

    public HorarioAgregado(Horario horario) {
        super("org.sofkau.HorarioAgregado");

        this.horario = horario;
    }

    public Horario horario() {
        return horario;
    }
}
