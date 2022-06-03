package com.crud.demo.modelo;

import com.crud.demo.dto.actualizarRegistroDto;
import com.crud.demo.dto.eliminarRegistroDto;
import java.time.ZonedDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telefono;
    private String apellido;
    private String estado;
    private Date fechaModificacion;
    private Date fechaCreacion;

    public Persona() {

    }

    public Persona(int id) {
        this.id = id;
    }

    public Persona(int id, String name, String telefono, String apellido, String estado, Date fechaModificacion, Date fechaCreacion) {
        super();
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.apellido = apellido;
        this.estado = estado;
        this.fechaModificacion = fechaModificacion;
        this.fechaCreacion = fechaCreacion;
    }
    
    public Persona(actualizarRegistroDto dto){
        this.apellido= dto.getApellido();
        this.name = dto.getName();
        this.fechaModificacion=dto.getFechaModificacion();
        this.id = dto.getId();
        this.telefono = dto.getTelefono();
    }
    
    public Persona(eliminarRegistroDto dto){
        this.estado=dto.getEstado();
        this.fechaModificacion = dto.getFechaModificacion();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
