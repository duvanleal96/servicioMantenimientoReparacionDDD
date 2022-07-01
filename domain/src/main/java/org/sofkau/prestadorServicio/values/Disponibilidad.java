package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Disponibilidad implements ValueObject<Boolean> {
    private final Boolean disponibilidad;

    public Disponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public Boolean value() {
        return null;
    }

    public Disponibilidad actualizarDisponibilidad(Disponibilidad disponibilidad){
        return new Disponibilidad(Objects.requireNonNull(disponibilidad.value()));
    }
}
