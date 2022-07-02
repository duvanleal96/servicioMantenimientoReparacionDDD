package org.sofkau.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.factura.values.FacturaId;
import org.sofkau.factura.values.PagoId;
import org.sofkau.factura.values.Valor;

public class actualizarValorDeUnPago extends Command {
    private final FacturaId facturaId;
    private final PagoId pagoId;
    private final Valor valor;

    public actualizarValorDeUnPago(FacturaId facturaId, PagoId pagoId, Valor valor) {
        this.facturaId = facturaId;
        this.pagoId = pagoId;
        this.valor = valor;
    }

    public PagoId pagoId() {
        return pagoId;
    }

    public Valor valor() {
        return valor;
    }

    public FacturaId facturaId() {
        return facturaId;
    }
}

