/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.demo.dto;

import java.util.Date;

public class eliminarRegistroDto {
    
    private int id;
    private String estado;
    private Date fechaModificacion;

    public eliminarRegistroDto() {
    }

    public eliminarRegistroDto(int id, String estado, Date fechaModificacion) {
        this.id = id;
        this.estado = estado;
        this.fechaModificacion = fechaModificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
