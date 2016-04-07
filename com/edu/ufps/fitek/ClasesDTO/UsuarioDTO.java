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
 * @author ANRAD
 */
public class UsuarioDTO implements Serializable {
    
    private String tipoDoc;
    private String numDoc;
    private String password;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private String email;
    private String tipoUsuario;
    private boolean estado;

    public UsuarioDTO(String tipoDoc, String numDoc, String password, String nombre, String apellido, String genero, String direccion, String email, String tipoUsuario) {
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
        this.tipoUsuario=tipoUsuario;
        this.estado=true;
    }

    public UsuarioDTO() {
        this.estado=true;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.tipoDoc);
        hash += 31 * hash + Objects.hashCode(this.numDoc);
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
        final UsuarioDTO other = (UsuarioDTO) obj;
        if (!Objects.equals(this.tipoDoc, other.tipoDoc)) {
            return false;
        }
        if (!Objects.equals(this.numDoc, other.numDoc)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "tipoDoc= " + tipoDoc + ", numDoc= " + numDoc + ", nombre= " 
                + nombre + ", apellido= " + apellido + ", genero= " + genero + ", direccion= " 
                + direccion + ", email= " + email;
    }

    
}
