package com.itgam.power.rangers.dao.impl.ct;

import org.springframework.stereotype.Repository;

import com.itgam.power.rangers.dao.ct.PersonalDao;
import com.itgam.power.rangers.model.ctPersonal;
import com.itgam.power.rangers.util.DBConexion;
import java.sql.*;

@Repository
public class PersonalDaoImpl implements PersonalDao {

	public void addctPersonal (ctPersonal obj_ctPersonal) throws SQLException{
                /*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		/*Creacion de la variable que almacenara la sentencia SQL*/
		Statement consulta = inicio.createStatement();
	}
	
	public void updatectPersonal (ctPersonal id_ctPersonal){
		
	}
	
	public void deletectPersonal (Integer id_ctPersonal){
		
	}
}
