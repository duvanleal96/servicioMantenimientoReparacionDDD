package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comentario implements ValueObject<String> {
    private final String comentario;

    public Comentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String value() {
        return comentario;
    }
    public Comentario actualizarComentario(Comentario comentario){
        return new Comentario(Objects.requireNonNull(comentario.value()));
    }

}
