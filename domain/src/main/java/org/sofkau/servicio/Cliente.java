package org.sofkau.servicio;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.servicio.values.ClienteId;

public class Cliente extends Entity<ClienteId> {
    public Cliente(ClienteId clienteId) {
        super(clienteId);
    }
}
