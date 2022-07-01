package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    protected final String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String value() {
        return nombre;
    }

    public Nombre actualizarNombre(Nombre nombre){
        return new Nombre(Objects.requireNonNull(nombre.value()));
    }

}
