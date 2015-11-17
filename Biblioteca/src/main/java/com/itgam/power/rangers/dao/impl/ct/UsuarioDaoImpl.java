package com.itgam.power.rangers.dao.impl.ct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itgam.power.rangers.dao.ct.UsuarioDao;
import com.itgam.power.rangers.model.ctUsuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	public void addctUsuario (ctUsuario obj_ctUsuario){
		
		List<ctUsuario> Lista = new ArrayList<ctUsuario>();
		Lista.add(obj_ctUsuario);
		
		
	}
	
	public void updatectUsuario (ctUsuario id_ctUsuario){
		
	}
	
	public void deletectUsuario (Integer id_ctUsuario){
		
	}
}
