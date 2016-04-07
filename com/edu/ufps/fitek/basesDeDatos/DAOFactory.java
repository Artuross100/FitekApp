package com.edu.ufps.fitek.basesDeDatos;

import com.edu.ufps.fitek.ClasesMySQLDAO.AdministradorDAO;
import com.edu.ufps.fitek.ClasesMySQLDAO.ArchivoSoporteDAO;
import com.edu.ufps.fitek.basesDeDatosInterfaz.IAdministradorDAO;
import com.edu.ufps.fitek.basesDeDatosInterfaz.IArchivoSoporteDAO;



public class DAOFactory {
    
	public IAdministradorDAO obtenerAdministrador(boolean keepOpenConn){
		return new AdministradorDAO(keepOpenConn);
	}
        
        public IArchivoSoporteDAO obtenerArchivoSoporte(boolean keepOpenConn){
		return new ArchivoSoporteDAO(keepOpenConn);
	}
	
}
