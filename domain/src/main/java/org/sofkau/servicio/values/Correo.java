package org.sofkau.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {
    private final String correo;

    public Correo(String correo) {
        this.correo = correo;
    }

    @Override
    public String value() {
        return null;
    }
    public Correo actualizarCorreo(Correo correo){
        return new Correo(Objects.requireNonNull(correo.value()));
    }
}
