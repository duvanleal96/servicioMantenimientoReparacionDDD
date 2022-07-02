package org.sofkau.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.factura.values.FacturaId;
import org.sofkau.factura.values.PagoId;
import org.sofkau.factura.values.TipoPago;

public class actualizarTipoPagoDeUnPago extends Command {
    private final FacturaId facturaId;
    private final PagoId pagoid;
    private final TipoPago tipoPago;

    public actualizarTipoPagoDeUnPago(FacturaId facturaId,PagoId pagoid, TipoPago tipoPago){
        this.facturaId = facturaId;
        this.pagoid = pagoid;
        this.tipoPago = tipoPago;
    }

    public TipoPago tipoPago() {
        return tipoPago;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public PagoId pagoid() {
        return pagoid;
    }
}
