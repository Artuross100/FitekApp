/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesDTO;

import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class ProyectoInvestigadorDTO {
    
    private ProyectoDTO proyecto;
    private ArrayList<InvestigadorDTO> investigadores;

    public ProyectoInvestigadorDTO(ProyectoDTO proyecto) {
        this.proyecto = proyecto;
    }

    public ProyectoInvestigadorDTO() {
    }

    public ProyectoDTO getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoDTO proyecto) {
        this.proyecto = proyecto;
    }

    public boolean registrarInvestigador(InvestigadorDTO inv){
        return this.investigadores.add(inv);
    }
}
