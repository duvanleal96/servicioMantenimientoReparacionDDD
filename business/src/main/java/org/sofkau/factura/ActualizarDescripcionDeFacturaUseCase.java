package org.sofkau.factura;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofkau.factura.commands.ActualizarDescripcionDeUnaFactura;

public class ActualizarDescripcionDeFacturaUseCase extends UseCase<RequestCommand<ActualizarDescripcionDeUnaFactura>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarDescripcionDeUnaFactura> actualizarDescripcionDeUnaFacturaRequestCommand) {
        var command = actualizarDescripcionDeUnaFacturaRequestCommand.getCommand();
        var factura = Factura.from(command.getFacturaId(),repository().getEventsBy(command.getFacturaId().value()));
        factura.actualizarDescripcionDeUnaFactura(command.getFacturaId(),command.getDescripcion());
        emit().onResponse(new ResponseEvents(factura.getUncommittedChanges()));
    }
}
