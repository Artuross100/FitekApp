/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.basesDeDatosInterfaz;

import com.edu.ufps.fitek.ClasesDTO.AdministradorDTO;
import java.util.List;

/**
 *
 * @author andrea
 */
public interface IAdministradorDAO {
    
    public boolean insertar(AdministradorDTO dto) throws Exception;
    
    public boolean eliminar(AdministradorDTO dto) throws Exception;
    
    public List<AdministradorDTO> listar() throws Exception;
    
    public boolean closeConn() throws Exception;
}
