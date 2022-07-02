package org.sofkau.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.factura.values.PagoId;
import org.sofkau.factura.values.Valor;

public class ValorDeUnPagoActualizado extends DomainEvent {
    private final PagoId pagoId;
    private final Valor valor;

    public ValorDeUnPagoActualizado(PagoId pagoId, Valor valor) {
        super("org.sofkau.ValorDeUnPagoActualizado");
        this.pagoId = pagoId;
        this.valor = valor;
    }

    public PagoId pagoId() {
        return pagoId;
    }

    public Valor valor() {
        return valor;
    }

}
