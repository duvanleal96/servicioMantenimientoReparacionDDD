package org.sofkau.prestadorServicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.Cargo;
import org.sofkau.prestadorServicio.values.CargoId;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;

public class PrestadorDeServiciosCreado extends DomainEvent {
    private final PrestadorServicioId prestadorServicioId;
    private final CargoId cargoId;

    public PrestadorDeServiciosCreado(PrestadorServicioId prestadorServicioId, CargoId cargoId) {
        super("org.sofkau.PrestadorDeServiciosCreado");
        this.prestadorServicioId = prestadorServicioId;
        this.cargoId = cargoId;
    }

    public CargoId CargoId() {
        return cargoId;
    }

    public PrestadorServicioId PrestadorServicioId() {
        return prestadorServicioId;
    }


}
