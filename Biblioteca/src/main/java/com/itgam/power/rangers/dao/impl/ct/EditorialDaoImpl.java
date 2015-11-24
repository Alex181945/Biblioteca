package com.itgam.power.rangers.dao.impl.ct;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.itgam.power.rangers.dao.ct.EditorialDao;
import com.itgam.power.rangers.model.ctEditorial;
import com.itgam.power.rangers.util.DBConexion;

@Repository
public class EditorialDaoImpl implements EditorialDao {

	public void addctEditorial (ctEditorial obj_ctEditorial) throws SQLException{
		 /*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Hacer autoincremental el ID*/
			Integer valorMaximo = 0;
			/*consulta.execute("SELECT MAX(iUsuario) FROM ctUsuario;");
			ResultSet res = consulta.getResultSet();*/
			ResultSet res = consulta.executeQuery("SELECT MAX(iEditorial) FROM ctEditorial");
			System.out.println("Pasa de la sentencia");
			if(res.next()){
				System.out.println(res.getInt(1));
				valorMaximo = res.getInt(1) + 1;
				System.out.println("Este es el valor obtenido de la consulta: "+valorMaximo);
			}
			else{
				valorMaximo = valorMaximo + 1;
				System.out.println("Estet es el valor obtenido del else de la consulta: "+valorMaximo);
			}
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "INSERT INTO ctEditorial VALUES ("+valorMaximo+","
					+ "\""+obj_ctEditorial.getiEditorial()+"\",\""+obj_ctEditorial.getcEditorial()+"\","
							+ "\""+obj_ctEditorial.getlEstatus()+"\",\""+obj_ctEditorial.getcObs()+"\")";
			System.out.println(sentencia);
			
			consulta.execute(sentencia);
			}catch(Exception e){
				System.out.println("No hubo exito "+e);
			}
			finally{
				/*Terminando conexion con la base de datos*/
				System.out.println("Termina conexion");
				inicio.close();	
			}
		
	}
	
	public void updatectEditorial (ctEditorial obj_ctEditorial){
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();

		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "UPDATE ctEditorial SET cEditorial = \""+obj_ctEditorial.getcEditorial()+"\","
					+"lEstatus = "+obj_ctEditorial.getlEstatus()+","
									+ "cObs = \""+obj_ctEditorial.getcObs()+"\" WHERE iLibro = "+obj_ctEditorial.getiEditorial()+"";
			System.out.println(sentencia);
			consulta.executeUpdate(sentencia);
			
		}catch(Exception e){
			System.out.println("Algo salio mal");
		}
		finally{
			/*Terminando conexion con la base de datos*/
			System.out.println("Termina conexion");
			try {
				inicio.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deletectEditorial (Integer id_ctEditorial){
		
	}
}
