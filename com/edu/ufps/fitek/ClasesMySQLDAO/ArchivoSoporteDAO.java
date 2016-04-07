/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.ufps.fitek.ClasesMySQLDAO;

import com.edu.ufps.fitek.basesDeDatosInterfaz.IArchivoSoporteDAO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author andrea
 */
public class ArchivoSoporteDAO implements Serializable, IArchivoSoporteDAO {

    private Connection conn;
    private String DRIVER = "com.mysql.jdbc.Driver";
    private String DBURL = "jdbc:mysql://sandbox2.ufps.edu.co/115....";
    private String USER = "";
    private String PASS = "";
    private boolean keepOpenConn;

    public ArchivoSoporteDAO(boolean keepOpenConn) {
        this.keepOpenConn = keepOpenConn;
        try {
            Class.forName(DRIVER).newInstance();
            //Obtiene una connection
            conn = DriverManager.getConnection(DBURL, USER, PASS);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            e.getMessage();
            return;
        }
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
