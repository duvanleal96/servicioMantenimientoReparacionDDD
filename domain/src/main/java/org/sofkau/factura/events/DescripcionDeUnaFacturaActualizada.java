package org.sofkau.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.factura.values.Descripcion;
import org.sofkau.factura.values.FacturaId;

public class DescripcionDeUnaFacturaActualizada extends DomainEvent {
    private final FacturaId factura;
    private final Descripcion descripcion;

    public DescripcionDeUnaFacturaActualizada(FacturaId factura, Descripcion descripcion) {
        super("org.sofkau.DescripcionDeUnaFacturaActualizada");
        this.factura = factura;
        this.descripcion = descripcion;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public FacturaId factura() {
        return factura;
    }

}
