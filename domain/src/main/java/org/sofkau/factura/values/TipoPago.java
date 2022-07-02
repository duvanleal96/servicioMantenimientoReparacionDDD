package org.sofkau.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;


public class TipoPago implements ValueObject<String> {
    private final String tipoPago;

    public TipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String value() {
        return tipoPago;
    }

    public TipoPago actualizarTipoPago(TipoPago tipoPago){
        return new TipoPago(Objects.requireNonNull(tipoPago.actualizarTipoPago(tipoPago).value()));
    }
}
