package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<String> {
    private final String telefono;

    public Telefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String value() {
        return null;
    }

    public Telefono actualizarTelefono(Telefono telefono){
        return new Telefono(Objects.requireNonNull(telefono.value()));
    }
}
