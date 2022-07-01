package org.sofkau.servicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoServicio implements ValueObject<String> {
    private final String tipoServicio;

    public TipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String value() {
        return tipoServicio;
    }
    public TipoServicio actualizarTipoServicio(TipoServicio tipoServicio){
        return new TipoServicio(Objects.requireNonNull(tipoServicio.value()));
    }
}
