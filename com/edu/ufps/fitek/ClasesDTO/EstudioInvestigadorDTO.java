package com.edu.ufps.fitek.ClasesDTO;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrea
 */
public class EstudioInvestigadorDTO implements Serializable{
    
    private InvestigadorDTO investigador;
    private ArrayList<EstudioDTO> estudios;

    public EstudioInvestigadorDTO() {
    }

    public EstudioInvestigadorDTO(InvestigadorDTO investigador) {
        this.investigador = investigador;
    }

    public InvestigadorDTO getInvestigador() {
        return investigador;
    }

    public void setInvestigador(InvestigadorDTO investigador) {
        this.investigador = investigador;
    }
    
    public boolean insertarEstudio(EstudioDTO e){
        return this.estudios.add(e);
    }
}
