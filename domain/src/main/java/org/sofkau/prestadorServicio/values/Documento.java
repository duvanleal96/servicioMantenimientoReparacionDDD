package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.ValueObject;

public class Documento implements ValueObject<String> {
    private final String documento;

    public Documento(String documento) {
        this.documento = documento;
    }

    @Override
    public String value() {
        return documento;
    }
}
