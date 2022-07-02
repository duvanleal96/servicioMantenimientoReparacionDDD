package org.sofkau.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.factura.values.FacturaId;
import org.sofkau.factura.values.Fecha;
import org.sofkau.factura.values.Descripcion;
import org.sofkau.servicio.values.ServicioId;

public class FacturaCreada extends DomainEvent {
    private final FacturaId facturaId;
    private final ServicioId servicioId;
    private final Fecha fecha;
    private final Descripcion descripcion;

    public FacturaCreada(FacturaId facturaId, ServicioId servicioId, Fecha fecha, Descripcion descripcion) {
        super("org.sofkau.FacturaCreada");
        this.facturaId = facturaId;
        this.servicioId = servicioId;
        this.fecha = fecha;

        this.descripcion = descripcion;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public Fecha fecha() {
        return fecha;
    }

    public FacturaId facturaId() {
        return facturaId;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
