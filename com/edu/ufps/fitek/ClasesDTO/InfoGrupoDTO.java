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
public class InfoGrupoDTO implements Serializable{
    
    private String historia;
    private String mision;
    private String vision;

    public InfoGrupoDTO(String historia, String mision, String vision) {
        this.historia = historia;
        this.mision = mision;
        this.vision = vision;
    }

    public InfoGrupoDTO() {
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }
    
    
    
}
