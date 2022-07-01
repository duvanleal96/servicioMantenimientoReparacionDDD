package org.sofkau.factura;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Duracion implements ValueObject<String> {
    private final String duracion;

    public Duracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String value() {
        return duracion;
    }

    public Duracion actualizarDuracion(Duracion duracion){
        return new Duracion(Objects.requireNonNull(duracion.actualizarDuracion(duracion).value()));
    }
}
