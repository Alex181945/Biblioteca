package com.itgam.power.rangers.util;

import java.sql.*;

public class DBConexion {
	
public static Connection GetConnection(){
		
		Connection conexion = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3311/dbbanco","root","root");
            System.out.println("Me conecte exitosamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Conexi�n Intente Mas Tarde"
                    + " O Contact� con el �rea de Sistemas"+"\n"+e);
        }
		return conexion;
	}
}
