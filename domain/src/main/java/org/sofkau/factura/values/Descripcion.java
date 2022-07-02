package org.sofkau.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {
    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String value() {
        return descripcion;
    }

    public Descripcion actualizarDescripcion(Descripcion descripcion){
        return new Descripcion(Objects.requireNonNull(descripcion.value()));
    }
}
