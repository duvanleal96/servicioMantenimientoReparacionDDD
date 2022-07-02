package org.sofkau.prestadorServicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.prestadorServicio.values.CargoId;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;

public class CrearPrestadorDeServicio extends Command {
    private final PrestadorServicioId prestadorServicioId;
    private final CargoId cargoId;

    public CrearPrestadorDeServicio(PrestadorServicioId prestadorServicioId, CargoId cargoId) {
        this.prestadorServicioId = prestadorServicioId;
        this.cargoId = cargoId;
    }

    public CargoId getCargoId() {
        return cargoId;
    }

    public PrestadorServicioId getPrestadorServicioId() {
        return prestadorServicioId;
    }
}
