package org.sofkau.servicio;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.servicio.values.*;

public class OrdenServicio extends Entity<OrdenServicioId> {
    protected Fecha fecha;
    protected Descripcion descripcion;
    protected TipoServicio tipoServicio;

    public OrdenServicio(OrdenServicioId ordenServicioId, Fecha fecha, Descripcion descripcion, TipoServicio tipoServicio) {
        super(ordenServicioId);
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Fecha fecha() {
        return fecha;
    }

    public TipoServicio tipoServicio() {
        return tipoServicio;
    }
    public void actualizarTipoServicio(TipoServicio tipoServicio){
        this.tipoServicio = tipoServicio.actualizarTipoServicio(tipoServicio);
    }
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion=descripcion.actualizarDescripcion(descripcion);
    }

}
