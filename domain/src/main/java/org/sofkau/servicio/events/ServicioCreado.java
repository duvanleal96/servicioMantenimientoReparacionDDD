package org.sofkau.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;
import org.sofkau.servicio.Cliente;
import org.sofkau.servicio.values.ServicioId;

public class ServicioCreado extends DomainEvent {
    private final ServicioId servicioId;
    private final Cliente cliente;
    private final PrestadorServicioId prestadorServicioId;

    public ServicioCreado(ServicioId servicioId, Cliente cliente, PrestadorServicioId prestadorServicioId) {
        super("org.sofkau.ServicioCreado");
        this.servicioId = servicioId;
        this.cliente = cliente;
        this.prestadorServicioId = prestadorServicioId;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public Cliente cliente() {
        return cliente;
    }

    public PrestadorServicioId prestadorServicioId() {
        return prestadorServicioId;
    }
}
