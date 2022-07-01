package org.sofkau.factura;

import co.com.sofka.domain.generic.Entity;

public class Pago extends Entity<PagoId> {
    protected Valor valor;
    protected TipoPago tipoPago;
    public Pago(PagoId pagoId, Valor valor, TipoPago tipoPago) {
        super(pagoId);
        this.valor = valor;
        this.tipoPago = tipoPago;
    }

    public TipoPago tipoPago() {
        return tipoPago;
    }

    public Valor valor() {
        return valor;
    }
    public void actualizarValor(Valor valor){
        this.valor= valor.actualizarValor(valor);
    }

    public void actualizarTipoPago(TipoPago tipoPago){
        this.tipoPago=tipoPago.actualizarTipoPago(tipoPago);
    }
}
