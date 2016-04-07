/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.Serializable;

/**
 *
 * @author ANRAD
 */
public class AdministradorDTO extends UsuarioDTO implements Serializable {

    public AdministradorDTO() {
    }
    
    public AdministradorDTO(String tipoDoc, String numDoc, String password, String nombre, String apellido, String genero, String direccion, String email, String tipoUsuario) {
        super(tipoDoc, numDoc, password, nombre, apellido, genero, direccion, email, tipoUsuario);
    }

  
    
}
