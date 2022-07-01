package org.sofkau.factura;

import co.com.sofka.domain.generic.EventChange;
import org.sofkau.factura.events.FacturaCreada;
import org.sofkau.factura.events.TipoPagoActualizado;
import org.sofkau.factura.events.ValorDeUnPagoActualizado;

public class FacturaEventChange extends EventChange {
    public FacturaEventChange(Factura factura) {
        apply((FacturaCreada event)->{
            factura.servicioId=event.servicioId();
            factura.fecha=event.fecha();
        });
        apply((TipoPagoActualizado event)->{
            factura.tipoPago.actualizarTipoPago(event.tipoPago());
        });
        apply((ValorDeUnPagoActualizado event)->{
            factura.valor.actualizarValor(event.valor());
        });
    }
}
