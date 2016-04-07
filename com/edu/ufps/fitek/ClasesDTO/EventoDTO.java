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
public class EventoDTO implements Serializable {
    
    private String descripcion;
    private Calendar fecha;
    private Calendar hora;
    private String lugar;
    private File archivo;

    public EventoDTO(String descripcion, Calendar fecha, Calendar hora, String lugar, File archivo) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.archivo = archivo;
    }

    public EventoDTO(String descripcion, Calendar fecha, Calendar hora, String lugar) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public EventoDTO() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return descripcion + "\n"+
                "Fecha= " + fecha + "\n"+
                "Hora=" + hora.getTime().toString() + "\n"+
                "Lugar=" + lugar;
    }
    
    
}
