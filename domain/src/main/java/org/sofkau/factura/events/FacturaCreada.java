package org.sofkau.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.factura.FacturaId;
import org.sofkau.servicio.values.Fecha;
import org.sofkau.servicio.values.ServicioId;

public class FacturaCreada extends DomainEvent {
    private final ServicioId servicioId;
    private final Fecha fecha;

    public FacturaCreada(FacturaId facturaId, ServicioId servicioId, Fecha fecha) {
        super("org.sofkau.FacturaCreada");
        this.servicioId = servicioId;
        this.fecha = fecha;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public Fecha fecha() {
        return fecha;
    }

}
