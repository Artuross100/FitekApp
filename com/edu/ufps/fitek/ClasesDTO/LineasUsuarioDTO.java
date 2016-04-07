/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class LineasUsuarioDTO implements Serializable{
    
    private UsuarioDTO usuario;
    private ArrayList<LineasInvestigacionDTO> lineas;

    public LineasUsuarioDTO(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public LineasUsuarioDTO() {
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
    
    public boolean insertarLineaInvestigacion(LineasInvestigacionDTO l){
        return this.lineas.add(l);
    }
}
