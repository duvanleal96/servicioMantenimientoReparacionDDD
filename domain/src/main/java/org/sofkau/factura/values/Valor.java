package org.sofkau.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Valor implements ValueObject<Integer> {
    private  final Integer valor;

    public Valor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public Integer value() {
        return valor;
    }
    public Valor actualizarValor(Valor valor){
        return new Valor(Objects.requireNonNull(valor.actualizarValor(valor).value()));
    }
}
