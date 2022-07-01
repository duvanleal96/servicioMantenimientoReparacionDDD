package org.sofkau.servicio.commands;

import co.com.sofka.domain.generic.Command;
import org.sofkau.servicio.values.ClienteId;
import org.sofkau.servicio.values.Correo;
import org.sofkau.servicio.values.ServicioId;

public class actualizarCorreoDeUnCliente extends Command {
    private final ClienteId clienteId;
    private final ServicioId servicioId;
    private final Correo correo;

    public actualizarCorreoDeUnCliente(ClienteId clienteId, ServicioId servicioId, Correo correo) {
        this.clienteId = clienteId;
        this.servicioId = servicioId;
        this.correo = correo;
    }

    public Correo correo() {
        return correo;
    }

    public ServicioId servicioId() {
        return servicioId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }
}
