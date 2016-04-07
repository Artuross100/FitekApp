/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author andrea
 */
public class ProyectoDTO implements Serializable{
    
    private Calendar fechaRegistro;
    private String titulo;
    private String resumen;
    private String tipoProyecto;
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private boolean estado;
    private ArrayList<ArchivoSoporteDTO> soporte;
    private ArrayList<ProductoDTO> productos;

    public ProyectoDTO(Calendar fechaRegistro, String titulo, String resumen, String tipoProyecto, Calendar fechaInicio, Calendar fechaFin) {
        this.fechaRegistro = fechaRegistro;
        this.titulo = titulo;
        this.resumen = resumen;
        this.tipoProyecto = tipoProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado=true;
    }

    public ProyectoDTO() {
        this.estado=true;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash += 9 * hash + Objects.hashCode(this.titulo);
        hash += 9 * hash + Objects.hashCode(this.tipoProyecto);
        hash += 9 * hash + Objects.hashCode(this.fechaInicio);
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
        final ProyectoDTO other = (ProyectoDTO) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.tipoProyecto, other.tipoProyecto)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        return true;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "FechaRegistro= " + fechaRegistro +"\n"+ 
                "Titulo= " + titulo +"\n"+
                "Resumen= " + resumen +"\n"+
                "Tipo de Proyecto= " + tipoProyecto +"\n" + 
                "Fecha de Inicio=" + fechaInicio +"\n"+
                "Fecha de Fin=" + fechaFin +"\n"+ 
                "Estado= " + this.estado();
    }
    
    private String estado(){
        if(estado){
            return "Activo";
        }
        return "Inactivo";
    }
    
    public boolean insertarSoporte(ArchivoSoporteDTO archivo){
       return this.soporte.add(archivo);
    }
    
    public boolean insertarProducto(ProductoDTO producto){
        return this.productos.add(producto);
    }
    
}
