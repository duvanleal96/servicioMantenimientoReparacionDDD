package org.sofkau.servicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.servicio.values.OrdenServicioId;
import org.sofkau.servicio.values.ServicioId;
import org.sofkau.servicio.values.TipoServicio;

public class actualizarTipoServicioDeUnaOrdenServicio extends Command {
    private final ServicioId servicioId;
    private final OrdenServicioId ordenServicioId;
    private final TipoServicio tipoServicio;

    public actualizarTipoServicioDeUnaOrdenServicio(ServicioId servicioId, OrdenServicioId ordenServicioId, TipoServicio tipoServicio) {
        this.servicioId = servicioId;
        this.ordenServicioId = ordenServicioId;
        this.tipoServicio = tipoServicio;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public OrdenServicioId ordenServicioId() {
        return ordenServicioId;
    }

    public TipoServicio tipoServicio() {
        return tipoServicio;
    }
}
