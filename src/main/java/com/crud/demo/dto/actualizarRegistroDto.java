/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.demo.dto;

import java.util.Date;
public class actualizarRegistroDto {
    
    private int id;
    private String name;
    private String apellido;
    private String telefono;
    private Date fechaModificacion;
    
    public actualizarRegistroDto(){
        
    }
    
    public actualizarRegistroDto(int id, String apellido, String name, String telefono, Date fechaModificacion){
        this.id =id;
        this.name = name;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaModificacion = fechaModificacion;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    
    
}
