package org.sofkau.servicio;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofkau.servicio.commands.CrearServicio;

public class CrearServicioUseCase extends UseCase<RequestCommand<CrearServicio>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearServicio> crearServicioRequestCommand) {
        var command = crearServicioRequestCommand.getCommand();
        var servicio = new Servicio(command.getServicioId(),command.getClienteId(),command.getPrestadorServicioId());
        emit().onResponse(new ResponseEvents(servicio.getUncommittedChanges()));
    }
}

