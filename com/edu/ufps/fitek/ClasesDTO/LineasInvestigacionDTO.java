/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andrea
 */
public class LineasInvestigacionDTO implements Serializable{
    
    private String nombre;
    private String descripcion;
    private String areaConocimiento;

    public LineasInvestigacionDTO(String nombre, String descripcion, String areaConocimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.areaConocimiento = areaConocimiento;
    }

    public LineasInvestigacionDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(String areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
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
        final LineasInvestigacionDTO other = (LineasInvestigacionDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "Nombre= " + nombre +"\n"+
                "Descripcion= " + descripcion+"\n" + 
                "Area de Conocimiento= " + areaConocimiento +"\n";
    }
    
    
    
}
