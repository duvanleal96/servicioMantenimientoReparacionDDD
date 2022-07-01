package org.sofkau.servicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.servicio.values.ClienteId;
import org.sofkau.servicio.values.Correo;

public class CorreoDeUnClienteActualizado extends DomainEvent {
    private final Correo correo;
    private final ClienteId clienteId;

    public CorreoDeUnClienteActualizado(Correo correo, ClienteId clienteId) {
        super("org.sofkau.CorreoDeUnClienteActualizado");

        this.correo = correo;
        this.clienteId = clienteId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public Correo correo() {
        return correo;
    }
}
