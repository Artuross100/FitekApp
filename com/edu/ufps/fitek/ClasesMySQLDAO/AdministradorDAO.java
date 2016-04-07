package com.edu.ufps.fitek.ClasesMySQLDAO;

import com.edu.ufps.fitek.ClasesDTO.AdministradorDTO;
import com.edu.ufps.fitek.basesDeDatosInterfaz.IAdministradorDAO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class AdministradorDAO implements Serializable, IAdministradorDAO {

	private Connection conn;
	private String DRIVER = "com.mysql.jdbc.Driver";
	private String DBURL = "jdbc:mysql://sandbox2.ufps.edu.co/1151055";
	private String USER = "";
	private String PASS = "";
	private boolean keepOpenConn;
    
    public AdministradorDAO(boolean keepOpenConn) {
    	this.keepOpenConn = keepOpenConn;
    	try{
            Class.forName(DRIVER).newInstance();
            //Obtiene una connection
            conn = DriverManager.getConnection(DBURL, USER, PASS); 
            System.out.println("Conexion establecida");
        }catch (Exception e){
            e.getMessage();
            return;
        }
    }
	
    @Override
	public boolean insertar(AdministradorDTO dto) throws Exception {
		PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = conn.prepareStatement("INSERT INTO Administrador "
                    + "(ID, NOMBRE, DIRECCION) values (?, ?, ?)");
/*            stmt.setInt(1, dto.getId());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getDireccion());*/
            int total = stmt.executeUpdate();
            if(total>0)
                exito = true;                        
            stmt.close();            
        } finally {
        	if(!keepOpenConn){
	            if (conn != null) {
	                conn.close();
	            }
        	}
        }
        
        return exito;
	}

	@Override
	public boolean eliminar(AdministradorDTO dto) throws Exception {
		PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = conn.prepareStatement("DELETE FROM Administrador "
                    + "WHERE ID=?");
            //stmt.setInt(1, dto.getId());
            int total = stmt.executeUpdate();
            if(total>0)
                exito = true;                        
            stmt.close();            
        } finally {
        	if(!keepOpenConn){
	            if (conn != null) {
	                conn.close();
	            }
        	}
        }
        
        return exito;
	}

	@Override
	public List<AdministradorDTO> listar() throws Exception {
		List<AdministradorDTO> lista = null;

        try {

            // Este modo se usa para evitar ataque de inyecci�n de SQL
            // String selectStatement = "SELECT * FROM User WHERE userId = ? ";
            String selectStatement = "SELECT ID, NOMBRE, DIRECCION FROM EMPLEADO";
            PreparedStatement prepStmt = conn.prepareStatement(selectStatement);
            // Para pasar los par�metros
            //prepStmt.setString(1, userId);

            ResultSet rs = prepStmt.executeQuery();

            lista = new ArrayList<AdministradorDTO>();

            while (rs.next()) {
            	AdministradorDTO dto = new AdministradorDTO();
                /*
                dto.setId(rs.getInt(1));
                dto.setNombre(rs.getString(2));
                dto.setDireccion(rs.getString(3));
                */
                lista.add(dto);
            }

            rs.close();
            
        } catch (Exception e) {
            lista = null;
            throw new Exception(e);
        } finally {
        	if(!keepOpenConn){
	            if (conn != null) {
	                conn.close();
	            }
        	}
        }
        return lista;
	}
	
	@Override
	public boolean closeConn() throws Exception {
		if (conn != null) {
            conn.close();
            System.out.println("Conexion cerrada");
        }
		return true;
	}

}

