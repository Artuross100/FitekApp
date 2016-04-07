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
public class PublicacionDTO implements Serializable{
    
    private ArrayList<NoticiaDTO> noticias;
    private ArrayList<EventoDTO> eventos;
    private ArrayList<ProyectoInvestigadorDTO> proyectos;

    public PublicacionDTO() {
        this.eventos=new ArrayList();
        this.noticias=new ArrayList();
        this.proyectos=new ArrayList();
    }
    
    public boolean registrarNoticia(NoticiaDTO noticia){
        return this.noticias.add(noticia);
    }
    
    public boolean registrarEvento(EventoDTO e){
        return this.eventos.add(e);
    }
    
    public boolean registrarProyecto(ProyectoInvestigadorDTO u){
        return this.proyectos.add(u);
    }
}
