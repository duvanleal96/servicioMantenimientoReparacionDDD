package org.sofkau.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Fecha implements ValueObject<Date> {
    private final Date fecha;

    public Fecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public Date value() {
        return fecha;
    }

    public Date fecha() {
        return fecha;
    }
}
