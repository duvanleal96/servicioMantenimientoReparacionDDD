package org.sofkau.prestadorServicio.values;

import co.com.sofka.domain.generic.Identity;
import org.sofkau.factura.values.FacturaId;

public class PrestadorServicioId extends Identity {
    public PrestadorServicioId() {

    }
    private PrestadorServicioId(String id){
        super(id);
    }
    public static PrestadorServicioId of(String id){
        return new PrestadorServicioId(id);
    }
}
