package com.itgam.power.rangers.dao.impl.ct;


import java.sql.*;

import org.springframework.stereotype.Repository;

import com.itgam.power.rangers.dao.ct.UsuarioDao;
import com.itgam.power.rangers.model.ctUsuario;
import com.itgam.power.rangers.util.DBConexion;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	public void addctUsuario (ctUsuario obj_ctUsuario) throws SQLException{
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		/*Creacion de la variable que almacenara la sentencia SQL*/
		Statement consulta = inicio.createStatement();
		
		/*Hacer autoincremental el ID*/
		Integer valorMaximo = 0;
		ResultSet res = consulta.executeQuery("SELECT MAX(iUsuario)");
		if(res.next()){
			valorMaximo = res.getInt("iUsuario");
			System.out.println("Este es el valor obtenido de la consulta: "+valorMaximo);
		}
		else{
			valorMaximo = valorMaximo + 1;
			System.out.println("Estet es el valor obtenido del else de la consulta: "+valorMaximo);
		}
		
		/*Sentencia SQL*/
		String sentencia = null;
		
		sentencia = "INSERT INTO ctUsuario VALUES ("+valorMaximo+","+obj_ctUsuario.getcNombre()+","
				+ ""+obj_ctUsuario.getcApellidos()+","+obj_ctUsuario.getcCalle()+","+obj_ctUsuario.getcNumExterior()+","+obj_ctUsuario.getcNumInterior()+","
						+ ""+obj_ctUsuario.getcColonia()+","+obj_ctUsuario.getcCP()+","+obj_ctUsuario.getcEstado()+","+obj_ctUsuario.getcEmail()+","
								+ ""+obj_ctUsuario.getDtFechaNac()+","+obj_ctUsuario.getlEstatus()+","+obj_ctUsuario.getcUsuario()+","+obj_ctUsuario.getcPassword()+","
										+ ""+obj_ctUsuario.getcObs()+")";
		System.out.println(sentencia);
		
		consulta.execute(sentencia);
		
		/*Terminando conexion con la base de datos*/
		inicio.close();
	}
	
	public void updatectUsuario (ctUsuario id_ctUsuario){
            
            
	}
	
	public void deletectUsuario (Integer id_ctUsuario){
		
	}
}
