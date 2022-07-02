package org.sofkau.servicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;
import org.sofkau.servicio.values.ClienteId;
import org.sofkau.servicio.values.ServicioId;

public class CrearServicio extends Command {
    private final ServicioId servicioId;
    private final ClienteId clienteId;
    private final PrestadorServicioId prestadorServicioId;

    public CrearServicio(ServicioId servicioId, ClienteId clienteId, PrestadorServicioId prestadorServicioId) {
        this.servicioId = servicioId;
        this.clienteId = clienteId;
        this.prestadorServicioId = prestadorServicioId;
    }

    public PrestadorServicioId getPrestadorServicioId() {
        return prestadorServicioId;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
