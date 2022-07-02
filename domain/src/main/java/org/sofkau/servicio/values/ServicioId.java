package org.sofkau.servicio.values;

import co.com.sofka.domain.generic.Identity;
import org.sofkau.factura.values.FacturaId;

public class ServicioId extends Identity {
    public ServicioId() {

    }
    private ServicioId(String id){
        super(id);
    }
    public static ServicioId of(String id){
        return new ServicioId(id);
    }
}
