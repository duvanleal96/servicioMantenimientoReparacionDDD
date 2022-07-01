package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.Identity;

public class CalificacionId extends Identity {
    public CalificacionId(String uuid) {
        super(uuid);
    }

    public CalificacionId() {
    }
    public static CalificacionId of(String id){
        return new CalificacionId(id);
    }
}
