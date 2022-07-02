package org.sofkau.prestadorServicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.Cargo;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;

public class PrestadorDeServiciosCreado extends DomainEvent {
    private final PrestadorServicioId prestadorServicioId;
    private final Cargo cargo;

    public PrestadorDeServiciosCreado(PrestadorServicioId prestadorServicioId, Cargo cargo) {
        super("org.sofkau.PrestadorDeServiciosCreado");
        this.prestadorServicioId = prestadorServicioId;
        this.cargo = cargo;
    }

    public Cargo Cargo() {
        return cargo;
    }

    public PrestadorServicioId PrestadorServicioId() {
        return prestadorServicioId;
    }
}
