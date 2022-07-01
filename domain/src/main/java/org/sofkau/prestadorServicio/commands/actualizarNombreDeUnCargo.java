package org.sofkau.prestadorServicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.prestadorServicio.PrestadorServicioId;
import org.sofkau.prestadorServicio.values.CargoId;
import org.sofkau.prestadorServicio.values.Nombre;

public class actualizarNombreDeUnCargo extends Command {
    private final PrestadorServicioId prestadorServicioId;
    private final Nombre nombre;
    private final CargoId cargoId;

    public actualizarNombreDeUnCargo(PrestadorServicioId prestadorServicioId, Nombre nombre, CargoId cargoId) {
        this.prestadorServicioId = prestadorServicioId;
        this.nombre = nombre;
        this.cargoId = cargoId;
    }

    public CargoId cargoId() {
        return cargoId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public PrestadorServicioId prestadorServicioId() {
        return prestadorServicioId;
    }
}
