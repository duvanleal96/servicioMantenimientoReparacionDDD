package org.sofkau.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroEquipos implements ValueObject<Integer> {
    private final Integer numeroEquipos;

    public NumeroEquipos(Integer numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    @Override
    public Integer value() {
        return numeroEquipos;
    }

    public Integer numeroEquipos() {
        return numeroEquipos;
    }
}
