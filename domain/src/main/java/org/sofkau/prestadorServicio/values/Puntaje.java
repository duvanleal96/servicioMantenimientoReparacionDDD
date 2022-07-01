package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Puntaje implements ValueObject<Integer> {
    private final Integer puntaje;

    public Puntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public Integer value() {
        return puntaje;
    }

    public Puntaje actualizarPuntaje(Puntaje puntaje){
        return new Puntaje(Objects.requireNonNull(puntaje.value()));
    }
}
