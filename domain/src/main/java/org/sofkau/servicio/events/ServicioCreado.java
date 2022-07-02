package org.sofkau.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;

import org.sofkau.servicio.values.ClienteId;
import org.sofkau.servicio.values.ServicioId;

public class ServicioCreado extends DomainEvent {
    private final ServicioId servicioId;
    private final ClienteId clienteId;
    private final PrestadorServicioId prestadorServicioId;

    public ServicioCreado(ServicioId servicioId, ClienteId clienteId, PrestadorServicioId prestadorServicioId) {
        super("org.sofkau.ServicioCreado");
        this.servicioId = servicioId;
        this.clienteId = clienteId;
        this.prestadorServicioId = prestadorServicioId;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public PrestadorServicioId prestadorServicioId() {
        return prestadorServicioId;
    }
}
