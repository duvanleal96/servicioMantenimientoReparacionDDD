package org.sofkau.factura.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.factura.values.Descripcion;
import org.sofkau.factura.values.FacturaId;

public class ActualizarDescripcionDeUnaFactura extends Command {
    private final FacturaId facturaId;
    private final Descripcion descripcion;

    public ActualizarDescripcionDeUnaFactura(FacturaId facturaId, Descripcion descripcion) {
        this.facturaId = facturaId;
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
