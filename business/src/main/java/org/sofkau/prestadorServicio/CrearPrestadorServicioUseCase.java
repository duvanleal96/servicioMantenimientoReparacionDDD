package org.sofkau.prestadorServicio;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofkau.prestadorServicio.commands.CrearPrestadorDeServicio;

public class CrearPrestadorServicioUseCase extends UseCase<RequestCommand<CrearPrestadorDeServicio>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPrestadorDeServicio> crearPrestadorDeServicioRequestCommand) {
        var command = crearPrestadorDeServicioRequestCommand.getCommand();
        var prestadorServicio = new PrestadorServicio(command.getPrestadorServicioId(),command.getCargoId());
        emit().onResponse(new ResponseEvents(prestadorServicio.getUncommittedChanges()));
    }
}
