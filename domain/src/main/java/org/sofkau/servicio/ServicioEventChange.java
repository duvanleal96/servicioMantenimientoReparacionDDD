package org.sofkau.servicio;

import co.com.sofka.domain.generic.EventChange;
import org.sofkau.servicio.events.CorreoDeUnClienteActualizado;
import org.sofkau.servicio.events.DescripcionOrdenServicioActualizado;
import org.sofkau.servicio.events.ServicioCreado;
import org.sofkau.servicio.events.TipoServicioActualizado;

public class ServicioEventChange extends EventChange {
    public ServicioEventChange(Servicio servicio) {
        apply((ServicioCreado event)->{
            servicio.clienteId=event.clienteId();
            servicio.ordenServicio=null;
        });
        apply((TipoServicioActualizado event)->{
            servicio.tipoServicio.actualizarTipoServicio(event.tipoServicio());
        });
        apply((CorreoDeUnClienteActualizado event)->{
            servicio.correo.actualizarCorreo(event.correo());
        });
        apply((DescripcionOrdenServicioActualizado event)->{
            servicio.descripcion.actualizarDescripcion(event.descripcion());
        });
    }
}
