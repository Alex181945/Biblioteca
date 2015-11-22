package com.itgam.power.rangers.util;

import java.sql.*;

public class DBConexion {
	
public static Connection GetConnection(){
		
		Connection conexion = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://us-cdbr-azure-west-c.cloudapp.net/acsm_70d4dd62426898e","b80e40+c20ed508","c17b0729");
            System.out.println("Me conecte exitosamente");
        } catch (Exception e) {
            System.out.println("Error de Conexión Intente Mas Tarde"
                    + " O Contacté con el área de Sistemas"+"\n"+e);
        }
		return conexion;
	}
}
