package org.sofkau.servicio;

import co.com.sofka.domain.generic.Entity;
import org.sofkau.prestadorServicio.values.Nombre;
import org.sofkau.servicio.values.*;

public class Cliente extends Entity<ClienteId> {
    protected   Documento documento;
    protected   Correo correo;
    protected   Nombre nombre;
    protected   Direccion direccion;
    protected   Telefono telefono;
    protected   NumeroEquipos numeroEquipos;

    public Cliente(ClienteId clienteId, Documento documento, Correo correo, Nombre nombre, Direccion direccion, Telefono telefono, NumeroEquipos numeroEquipos) {
        super(clienteId);
        this.documento = documento;
        this.correo = correo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroEquipos = numeroEquipos;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Correo correo() {
        return correo;
    }

    public Direccion direccion() {
        return direccion;
    }

    public Documento documento() {
        return documento;
    }

    public NumeroEquipos numeroEquipos() {
        return numeroEquipos;
    }

    public Telefono telefono() {
        return telefono;
    }

    public void actualizarCorreo(Correo correo){
        this.correo=correo.actualizarCorreo(correo);
    }
}
