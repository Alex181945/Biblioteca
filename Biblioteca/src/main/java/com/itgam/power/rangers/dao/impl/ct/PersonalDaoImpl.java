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
		
		try{
			/*Creacion de la variable que almacenara la sentencia SQL*/
			Statement consulta = inicio.createStatement();
			
			/*Hacer autoincremental el ID*/
			Integer valorMaximo = 0;
			/*consulta.execute("SELECT MAX(iUsuario) FROM ctUsuario;");
			ResultSet res = consulta.getResultSet();*/
			ResultSet res = consulta.executeQuery("SELECT MAX(iPersonal) FROM ctPersonal");
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
			
			sentencia = "INSERT INTO ctPersonal VALUES ("+valorMaximo+","
					+ "\""+obj_ctPersonal.getcNombre()+"\",\""+obj_ctPersonal.getcApellidos()+"\","
							+ "\""+obj_ctPersonal.getcCalle()+"\",\""+obj_ctPersonal.getcNumExterior()+"\","
									+ "\""+obj_ctPersonal.getcNumInterior()+"\",\""+obj_ctPersonal.getcColonia()+"\","
											+ "\""+obj_ctPersonal.getcCP()+"\",\""+obj_ctPersonal.getcEstado()+"\",\""+obj_ctPersonal.getcEmail()+"\","
													+ "\'"+Timestamp.valueOf(obj_ctPersonal.getDtFechaNac()+" 00:00:00.000000")+"\',"+obj_ctPersonal.getlSexo()+","
															+ "\""+obj_ctPersonal.getcUsuario()+"\",\""+obj_ctPersonal.getcPassword()+"\","+true+",\""+obj_ctPersonal.getcObs()+"\")";
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
	
	public void updatectPersonal (ctPersonal id_ctPersonal){
		
	}
	
	public void deletectPersonal (Integer id_ctPersonal){
		
	}
}
