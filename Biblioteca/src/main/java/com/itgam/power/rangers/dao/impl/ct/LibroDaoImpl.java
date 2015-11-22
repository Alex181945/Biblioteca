package com.itgam.power.rangers.dao.impl.ct;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itgam.power.rangers.dao.ct.LibroDao;
import com.itgam.power.rangers.model.ctLibro;
import com.itgam.power.rangers.util.DBConexion;

@Repository
public class LibroDaoImpl implements LibroDao {

	public void addctLibro (ctLibro obj_ctLibro){
		
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
			ResultSet res = consulta.executeQuery("SELECT MAX(iLibro) FROM ctLibro");
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
			
			sentencia = "INSERT INTO ctLibro VALUES ("+valorMaximo+","
					+ "\""+obj_ctLibro.getiLibro()+"\",\""+obj_ctLibro.getcNombre()+"\","
							+ "\""+obj_ctLibro.getiEditorial()+"\",\""+obj_ctLibro.getcAutor()+"\","
									+ "\""+obj_ctLibro.getiMateria()+"\",\""+obj_ctLibro.getlEstatus()+"\","
											+ "\""+obj_ctLibro.getcObs()+"\")";
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
	
	public void updatectLibro (ctLibro id_ctLibro){
		
	}
	
	public void deletectLibro (Integer id_ctLibro){
		
	}
	
	public List<ctLibro> list_ctLibro(){
		
		/*Creacion de la lista que almacenara los datos*/
		List<ctLibro> Lista = new ArrayList<ctLibro>();
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "SELECT * FROM ctLibro";
			ResultSet res = consulta.executeQuery(sentencia);
			
			while(res.next()){
				ctLibro obj = new ctLibro();
				
				obj.setiLibro(res.getInt("iLibro"));
				obj.setcNombre(res.getString("cNombre"));
				obj.setiEditorial(res.getInt("iEditorial"));
				obj.setcAutor(res.getString("cAutor"));
				obj.setiMateria(res.getInt("iMateria"));
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
	
	public ctLibro get_ctLibro(Integer id_ctLibro){
		
		return null;
	}
}
