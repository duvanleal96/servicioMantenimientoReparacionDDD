package org.sofkau.prestadorServicio;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.values.CargoId;
import org.sofkau.prestadorServicio.values.Nombre;

public class NombreDeUnCargoActualizado extends DomainEvent {
    private final Nombre nombre;
    private final CargoId cargoId;

    public NombreDeUnCargoActualizado(Nombre nombre, CargoId cargoId) {
        super("org.sofkau.NombreDeUnCargoActualizado");

        this.nombre = nombre;
        this.cargoId = cargoId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public CargoId getCargoId() {
        return cargoId;
    }
}
