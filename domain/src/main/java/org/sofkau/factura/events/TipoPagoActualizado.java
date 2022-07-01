package org.sofkau.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.factura.PagoId;
import org.sofkau.factura.TipoPago;

public class TipoPagoActualizado extends DomainEvent {
    private final PagoId pagoid;
    private final TipoPago tipoPago;

    public TipoPagoActualizado(PagoId pagoid, TipoPago tipoPago) {
        super("org.sofkau.TipoPagoActualizado");
        this.pagoid = pagoid;
        this.tipoPago = tipoPago;
    }

    public PagoId pagoid() {
        return pagoid;
    }

    public TipoPago tipoPago() {
        return tipoPago;
    }
}
