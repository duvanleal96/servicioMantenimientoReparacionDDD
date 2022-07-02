package org.sofkau.factura;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.factura.values.Descripcion;
import org.sofkau.factura.values.Duracion;
import org.sofkau.factura.values.GarantiaId;

public class Garantia extends Entity<GarantiaId> {
    protected Duracion duracion;
    protected Descripcion descripcion;
    public Garantia(GarantiaId garantiaId,Duracion duracion,Descripcion descripcion) {

        super(garantiaId);
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Duracion duracion() {
        return duracion;
    }

    public void actualizarDuracion(Duracion duracion){
        this.duracion = duracion.actualizarDuracion(duracion);
    }
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion=descripcion.actualizarDescripcion(descripcion);
    }
}
