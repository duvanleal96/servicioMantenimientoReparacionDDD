package org.sofkau.servicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.values.PrestadorServicioId;
import org.sofkau.servicio.events.CorreoDeUnClienteActualizado;
import org.sofkau.servicio.events.DescripcionOrdenServicioActualizado;
import org.sofkau.servicio.events.ServicioCreado;
import org.sofkau.servicio.events.TipoServicioActualizado;
import org.sofkau.servicio.values.*;

import java.util.List;

public class Servicio extends AggregateEvent<ServicioId> {
    protected OrdenServicio ordenServicio;
    protected ClienteId clienteId;
    protected TipoServicio tipoServicio;
    protected Correo correo;
    protected Descripcion descripcion;

    public Servicio(ServicioId servicioId, ClienteId clienteId, PrestadorServicioId prestadorServicioId) {
        super(servicioId);
        appendChange(new ServicioCreado(servicioId,clienteId,prestadorServicioId)).apply();
        subscribe(new ServicioEventChange(this));
    }
    private Servicio(ServicioId servicioId){
        super(servicioId);
        subscribe(new ServicioEventChange(this));
    }
    public static Servicio from(ServicioId servicioId, List<DomainEvent> events){
        var Servicio=new Servicio(servicioId);
        events.forEach(Servicio::applyEvent);
        return Servicio;
    }
    public void actualizarTipoServicioDeUnaOrdenServicio(TipoServicio tipoServicio, OrdenServicioId ordenServicioId){
        appendChange(new TipoServicioActualizado(tipoServicio,ordenServicioId));
    }
    public void actualizarCorreoDeUnCliente(Correo correo, ClienteId clienteId){
        appendChange(new CorreoDeUnClienteActualizado(correo,clienteId));
    }
    public void actualizarDescripcionDeUnaOrdenServicio(Descripcion descripcion,OrdenServicioId ordenServicioId){
        appendChange(new DescripcionOrdenServicioActualizado(descripcion,ordenServicioId));
    }


    public ClienteId clienteId() {
        return clienteId;
    }

    public OrdenServicio ordenServicio() {
        return ordenServicio;
    }

    public TipoServicio tipoServicio() {
        return tipoServicio;
    }

    public Correo correo() {
        return correo;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
