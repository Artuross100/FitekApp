/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.File;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author andrea
 */
public class ArchivoSoporteDTO implements Serializable{
    
    private int id;
    private Calendar fechaRegistro;
    private File archivo;

    public ArchivoSoporteDTO(int id, Calendar fechaRegistro, File archivo) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.archivo = archivo;
    }

    public ArchivoSoporteDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
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
        final ArchivoSoporteDTO other = (ArchivoSoporteDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
