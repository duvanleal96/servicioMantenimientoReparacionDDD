package org.sofkau.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.factura.values.FacturaId;
import org.sofkau.factura.values.Fecha;
import org.sofkau.factura.values.Descripcion;
import org.sofkau.servicio.values.ServicioId;

public class CrearFactura extends Command {
    private final FacturaId facturaId;
    private final ServicioId servicioId;
    private final Fecha fecha;
    private final Descripcion descripcion;

    public CrearFactura(FacturaId facturaId, ServicioId servicioId, Fecha fecha, Descripcion descripcion) {
        this.facturaId = facturaId;
        this.servicioId = servicioId;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
