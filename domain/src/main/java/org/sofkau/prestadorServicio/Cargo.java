package org.sofkau.prestadorServicio;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.prestadorServicio.values.CargoId;
import org.sofkau.prestadorServicio.values.Nombre;
import org.sofkau.prestadorServicio.values.Telefono;

public class Cargo extends Entity<CargoId> {
    protected Nombre nombre;
    protected Telefono telefono;
    public Cargo(CargoId cargoId,Nombre nombre,Telefono telefono) {
        super(cargoId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre.actualizarNombre(nombre);
    }

    public void actualizarTelefono(Telefono telefono){
        this.telefono = telefono.actualizarTelefono(telefono);
    }
}
