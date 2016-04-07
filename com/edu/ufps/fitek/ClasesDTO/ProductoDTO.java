/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.File;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author andrea
 */
public class ProductoDTO implements Serializable{
    
    private Calendar fechaRegistro;
    private String tipoProducto;
    private String titulo;
    private File archivo;

    public ProductoDTO(Calendar fechaRegistro, String tipoProducto, String titulo, File archivo) {
        this.fechaRegistro = fechaRegistro;
        this.tipoProducto = tipoProducto;
        this.titulo = titulo;
        this.archivo = archivo;
    }

    public ProductoDTO() {
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash += 11 * hash + Objects.hashCode(this.tipoProducto);
        hash += 11 * hash + Objects.hashCode(this.titulo);
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
        final ProductoDTO other = (ProductoDTO) obj;
        if (!Objects.equals(this.tipoProducto, other.tipoProducto)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    
    
}
