package org.sofkau.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.factura.events.FacturaCreada;
import org.sofkau.factura.events.TipoPagoActualizado;
import org.sofkau.factura.events.ValorDeUnPagoActualizado;
import org.sofkau.prestadorServicio.PrestadorServicio;
import org.sofkau.prestadorServicio.PrestadorServicioEventChange;
import org.sofkau.prestadorServicio.PrestadorServicioId;
import org.sofkau.servicio.values.Fecha;
import org.sofkau.servicio.values.ServicioId;

import java.util.List;
import java.util.Objects;

public class Factura extends AggregateEvent<FacturaId> {
    protected Garantia garantia;
    protected Pago pago;
    protected ServicioId servicioId;
    protected Fecha fecha;
    protected Valor valor;
    protected TipoPago tipoPago;
    public Factura(FacturaId facturaId, ServicioId servicioId, Fecha fecha) {
        super(facturaId);
        appendChange(new FacturaCreada(facturaId,servicioId,fecha)).apply();
        subscribe(new FacturaEventChange(this));
    }
    private Factura(FacturaId facturaId){
        super(facturaId);
        subscribe(new FacturaEventChange(this));
    }
    public static Factura from(FacturaId facturaId, List<DomainEvent> events){
        var factura=new Factura(facturaId);
        events.forEach(factura::applyEvent);
        return factura;
    }
    public void actualizarTipoPagoDeUnPago(PagoId pagoid,TipoPago tipoPago){
        Objects.requireNonNull(pagoid);
        Objects.requireNonNull(tipoPago);
        appendChange(new TipoPagoActualizado(pagoid,tipoPago)).apply();
    }
    public void actualizarValorDeUnPago(PagoId pagoId,Valor valor){
        Objects.requireNonNull(pagoId);
        Objects.requireNonNull(valor);
        appendChange(new ValorDeUnPagoActualizado(pagoId,valor));
    }

    public Garantia garantia() {
        return garantia;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public Pago pago() {
        return pago;
    }

    public Fecha fecha() {
        return fecha;
    }

    public TipoPago tipoPago(){
        return tipoPago;
    }
    public Valor valor(){
        return valor;
    }
}
