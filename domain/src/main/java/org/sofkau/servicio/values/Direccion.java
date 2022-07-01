package org.sofkau.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String value() {
        return direccion;
    }

}
