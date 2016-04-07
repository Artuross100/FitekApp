/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author andrea
 */
public class NoticiaDTO implements Serializable{
    
    private String fechaNoticia;
    private String descripcion;
    private File archivo;

    public NoticiaDTO(String fechaNoticia, String descripcion) {
        this.fechaNoticia = fechaNoticia;
        this.descripcion = descripcion;
    }

    public NoticiaDTO(String fechaNoticia, String descripcion, File archivo) {
        this.fechaNoticia = fechaNoticia;
        this.descripcion = descripcion;
        this.archivo = archivo;
    }

    public NoticiaDTO() {
    }

    public String getFechaNoticia() {
        return fechaNoticia;
    }

    public void setFechaNoticia(String fechaNoticia) {
        this.fechaNoticia = fechaNoticia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
}
