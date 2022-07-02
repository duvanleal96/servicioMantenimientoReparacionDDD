package org.sofkau.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class Fecha implements ValueObject<LocalDate> {
    private final LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public LocalDate value() {
        return fecha;
    }

    public LocalDate fecha() {
        return fecha;
    }
}
