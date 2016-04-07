/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author andrea
 */
public class EstudioDTO implements Serializable {
    private String nombre;
    private String titulo;
    private Calendar culminacion;

    public EstudioDTO(String nombre, String titulo, Calendar culminacion) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.culminacion = culminacion;
    }

    public EstudioDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getCulminacion() {
        return culminacion;
    }

    public void setCulminacion(Calendar culminacion) {
        this.culminacion = culminacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash += 29 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EstudioDTO other = (EstudioDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
}
