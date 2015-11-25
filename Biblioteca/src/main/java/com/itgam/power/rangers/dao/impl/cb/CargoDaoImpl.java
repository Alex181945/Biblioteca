package com.itgam.power.rangers.dao.impl.cb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itgam.power.rangers.dao.cb.CargoDao;
import com.itgam.power.rangers.model.cbCargo;
import com.itgam.power.rangers.util.DBConexion;

@Repository
public class CargoDaoImpl implements CargoDao {
	public void addctLibro (cbCargo obj_cbCargo){
		
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
			ResultSet res = consulta.executeQuery("SELECT MAX(iCargo) FROM cbCargo");
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
			
			sentencia = "INSERT INTO cbCargo VALUES ("+valorMaximo+","
					+obj_cbCargo.getiPrestamo()+"\","+obj_cbCargo.getiPrestamo()+","
							+ "\","+obj_cbCargo.getDbCargo()+"\',"+obj_cbCargo.getlEstatus()+","
									+"\""+obj_cbCargo.getcObs()+"\")";
			System.out.println(sentencia);
			
			consulta.execute(sentencia);
			}catch(Exception e){
				System.out.println("No hubo exito "+e);
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
	
	public void updatectLibro (cbCargo obj_cbCargo){
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();

		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "UPDATE cbCargo SET iPrestamo = "+obj_cbCargo.getiPrestamo()+","
					+ "dbCargo = "+obj_cbCargo.getDbCargo()+",lEstatus = "+obj_cbCargo.getlEstatus()+"\","
							+",lEstatus = "+obj_cbCargo.getlEstatus()+","
									+ "cObs = \""+obj_cbCargo.getcObs()+"\" WHERE iCargo = "+obj_cbCargo.getiCargo()+"";
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
	
	public void deletecbCargo (Integer id_cbCargo){
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "DELETE FROM cbCargo WHERE iCargo = "+id_cbCargo+"";
			consulta.execute(sentencia);
			
		}catch (Exception e){
			System.out.println("Hubo un problema: "+e);
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
	
	public List<cbCargo> list_cbCargo(){
		
		/*Creacion de la lista que almacenara los datos*/
		List<cbCargo> Lista = new ArrayList<cbCargo>();
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "SELECT * FROM cbCargo";
			ResultSet res = consulta.executeQuery(sentencia);
			
			while(res.next()){
				cbCargo obj = new cbCargo();
				
				obj.setiCargo(res.getInt("iCargo"));
				obj.setiPrestamo(res.getInt("iPrestamo"));
				obj.setDbCargo(res.getDouble("dbCargo"));
				obj.setlEstatus(res.getBoolean("lEstatus"));
				obj.setcObs(res.getString("cObs"));
				
				Lista.add(obj);
			}
			
		}catch (Exception e){
			System.out.println("Hubo un problema: "+e);
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
		return Lista ;
	}

	public cbCargo get_cbCargo(Integer id_cbCargo){
		
		/*Creacion de la lista que almacenara los datos*/
		cbCargo obj = new cbCargo();
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "SELECT * FROM cbCargo WHERE iCargo = "+id_cbCargo+"";
			ResultSet res = consulta.executeQuery(sentencia);
			
			while(res.next()){
				
				obj.setiCargo(res.getInt("iCargo"));
				obj.setiPrestamo(res.getInt("iPrestamo"));
				obj.setDbCargo(res.getDouble("dbCargo"));
				obj.setlEstatus(res.getBoolean("lEstatus"));
				obj.setcObs(res.getString("cObs"));
				
			}
			
		}catch (Exception e){
			System.out.println("Hubo un problema: "+e);
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
		
		return obj;
	}
}
