package com.itgam.power.rangers.dao.impl.ct;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
		
		try{
		/*Creacion de la variable que almacenara la sentencia SQL*/
		Statement consulta = inicio.createStatement();
		
		/*Hacer autoincremental el ID*/
		Integer valorMaximo = 0;
		/*consulta.execute("SELECT MAX(iUsuario) FROM ctUsuario;");
		ResultSet res = consulta.getResultSet();*/
		ResultSet res = consulta.executeQuery("SELECT MAX(iUsuario) FROM ctUsuario");
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
		
		sentencia = "INSERT INTO ctUsuario VALUES ("+valorMaximo+","
				+ "\""+obj_ctUsuario.getcNombre()+"\",\""+obj_ctUsuario.getcApellidos()+"\","
						+ "\""+obj_ctUsuario.getcCalle()+"\",\""+obj_ctUsuario.getcNumExterior()+"\","
								+ "\""+obj_ctUsuario.getcNumInterior()+"\",\""+obj_ctUsuario.getcColonia()+"\","
										+ "\""+obj_ctUsuario.getcCP()+"\",\""+obj_ctUsuario.getcEstado()+"\",\""+obj_ctUsuario.getcEmail()+"\","
												+ "\'"+Timestamp.valueOf(obj_ctUsuario.getDtFechaNac()+" 00:00:00.000000")+"\',"+obj_ctUsuario.getlSexo()+","
														+ "\""+obj_ctUsuario.getcUsuario()+"\",\""+obj_ctUsuario.getcPassword()+"\","+true+",\""+obj_ctUsuario.getcObs()+"\")";
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
	
	public void updatectUsuario (ctUsuario obj_ctUsuario){
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();

		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "UPDATE ctUsuario SET cNombre = \""+obj_ctUsuario.getcNombre()+"\","
					+ "cApellidos = \" "+obj_ctUsuario.getcApellidos()+",cCalle = \""+obj_ctUsuario.getcCalle()+"\","
							+ "cNumExterior = \""+obj_ctUsuario.getcNumExterior()+",cNumInterior = \""+obj_ctUsuario.getcNumInterior()+","
							   + "cColonia = \""+obj_ctUsuario.getcColonia() + ", cCP = \" "+obj_ctUsuario.getcCP()
							     + ", cEstado = \""+obj_ctUsuario.getcEstado()+ "," + ", cEmail = \""+obj_ctUsuario.getcEmail()
							       + obj_ctUsuario.getDtFechaNac()+ "," + ""+obj_ctUsuario.getlSexo()+
							       "ctUsuario = \""+obj_ctUsuario.getcUsuario()+ "," +  "cPassword = \""+obj_ctUsuario.getcPassword()+
							            "lEstatus = "+obj_ctUsuario.getlEstatus()+ "cObs = \""+obj_ctUsuario.getcObs()+"\" WHERE iUsuario = "+obj_ctUsuario.getiUsuario()+"";
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
	
	public void deletectUsuario (Integer id_ctUsuario){
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "DELETE FROM ctUsuario WHERE ctUsuario = "+id_ctUsuario+"";
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
	
	public Boolean loginctUsuario (ctUsuario obj_ctUsuario) throws SQLException{
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		Boolean respuesta = false;
		try{
		/*Creacion de la variable que almacenara la sentencia SQL*/
		Statement consulta = inicio.createStatement();
		ResultSet res = consulta.executeQuery("SELECT * FROM ctUsuario WHERE cUsuario = \""+obj_ctUsuario.getcUsuario()+"\" AND cPassword = \""+obj_ctUsuario.getcPassword()+"\";");
		respuesta = res.next();
		System.out.println(respuesta);
		}catch(Exception e){
			System.out.println("No hubo exito "+e);
		}
		finally{
			/*Terminando conexion con la base de datos*/
			System.out.println("Termina conexion");
			inicio.close();	
		}
		System.out.println(respuesta);
		return respuesta;
	}
	
	public List<ctUsuario> list_ctUsuario(){
		
		/*Creacion de la lista que almacenara los datos*/
		List<ctUsuario> Lista = new ArrayList<ctUsuario>();
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "SELECT * FROM ctUsuario";
			ResultSet res = consulta.executeQuery(sentencia);
			
			while(res.next()){
				ctUsuario obj = new ctUsuario();
				
				obj.setiUsuario (res.getInt("iUsuario"));
				obj.setcNombre(res.getString("cNombre"));
				obj.setcApellidos(res.getString("cApellidos"));
				obj.setcCalle(res.getString("cCalle"));
				obj.setcNumExterior(res.getString("cNumExterior"));
				obj.setcNumInterior(res.getString("cNumInterior"));
				obj.setcColonia(res.getString("cColonia"));
				obj.setcCP (res.getString("cCP "));
				obj.setcEstado(res.getString("cEstado"));
				obj.setcEmail(res.getString("cEmail"));
				obj.setDtFechaNac(res.getString("dtFechaNac"));
				obj.setcEmail(res.getString("cEmail"));
				obj.setlSexo(res.getBoolean("lSexo"));
				obj.setcUsuario(res.getString("cUsuario"));
				obj.setcPassword(res.getString("cPassword"));
				obj.setlSexo(res.getBoolean("lSexo"));
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
	
	public ctUsuario get_ctUsuario(Integer id_ctUsuario){
		
		/*Creacion de la lista que almacenara los datos*/
		ctUsuario obj = new ctUsuario();
		
		/*Conexion a la base de datos*/
		DBConexion conexion = new DBConexion();
		Connection inicio = conexion.GetConnection();
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Sentencia SQL*/
			String sentencia = null;
			
			sentencia = "SELECT * FROM ctUsuarii WHERE cUsuario = "+id_ctUsuario+"";
			ResultSet res = consulta.executeQuery(sentencia);
			
			while(res.next()){
				
				obj.setiUsuario (res.getInt("iUsuario"));
				obj.setcNombre(res.getString("cNombre"));
				obj.setcApellidos(res.getString("cApellidos"));
				obj.setcCalle(res.getString("cCalle"));
				obj.setcNumExterior(res.getString("cNumExterior"));
				obj.setcNumInterior(res.getString("cNumInterior"));
				obj.setcColonia(res.getString("cColonia"));
				obj.setcCP (res.getString("cCP "));
				obj.setcEstado(res.getString("cEstado"));
				obj.setcEmail(res.getString("cEmail"));
				obj.setDtFechaNac(res.getString("dtFechaNac"));
				obj.setcEmail(res.getString("cEmail"));
				obj.setlSexo(res.getBoolean("lSexo"));
				obj.setcUsuario(res.getString("cUsuario"));
				obj.setcPassword(res.getString("cPassword"));
				obj.setlSexo(res.getBoolean("lSexo"));
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
