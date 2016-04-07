/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.Serializable;

/**
 *
 * @author andrea
 */
public class InvestigadorDTO extends UsuarioDTO implements Serializable{
    
    private String institucion;

    public InvestigadorDTO(String institucion, String tipoDoc, String numDoc, String password, String nombre, String apellido, String genero, String direccion, String email, String tipoUsuario) {
        super(tipoDoc, numDoc, password, nombre, apellido, genero, direccion, email, tipoUsuario);
        this.institucion = institucion;
    }

    public InvestigadorDTO() {
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
}
