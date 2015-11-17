package com.itgam.power.rangers.service.impl.ct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.power.rangers.dao.ct.UsuarioDao;
import com.itgam.power.rangers.model.ctUsuario;
import com.itgam.power.rangers.service.ct.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	public void addctUsuario (ctUsuario obj_ctUsuario){
		
	}
	
	public void updatectUsuario (ctUsuario id_ctUsuario){
		
	}
	
	public void deletectUsuario (Integer id_ctUsuario){
		
	}
}
