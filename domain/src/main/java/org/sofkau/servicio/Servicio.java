package org.sofkau.servicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofkau.prestadorServicio.PrestadorServicioId;
import org.sofkau.servicio.events.CorreoDeUnClienteActualizado;
import org.sofkau.servicio.events.ServicioCreado;
import org.sofkau.servicio.events.TipoServicioActualizado;
import org.sofkau.servicio.values.ClienteId;
import org.sofkau.servicio.values.Correo;
import org.sofkau.servicio.values.OrdenServicioId;
import org.sofkau.servicio.values.ServicioId;

import java.util.List;

public class Servicio extends AggregateEvent<ServicioId> {
    protected OrdenServicio ordenServicio;
    protected Cliente cliente;
    protected TipoServicio tipoServicio;
    protected Correo correo;

    public Servicio(ServicioId servicioId, Cliente cliente, PrestadorServicioId prestadorServicioId) {
        super(servicioId);
        appendChange(new ServicioCreado(servicioId,cliente,prestadorServicioId)).apply();
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

    public Cliente cliente() {
        return cliente;
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
}
