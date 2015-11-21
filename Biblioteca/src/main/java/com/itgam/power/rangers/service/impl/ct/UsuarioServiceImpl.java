package com.itgam.power.rangers.service.impl.ct;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.power.rangers.dao.ct.UsuarioDao;
import com.itgam.power.rangers.model.ctUsuario;
import com.itgam.power.rangers.service.ct.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	public void addctUsuario (ctUsuario obj_ctUsuario) throws SQLException{
		usuarioDao.addctUsuario(obj_ctUsuario);
	}
	
	public void updatectUsuario (ctUsuario obj_ctUsuario){
		usuarioDao.updatectUsuario(obj_ctUsuario);
	}
	
	public void deletectUsuario (Integer id_ctUsuario){
		usuarioDao.deletectUsuario(id_ctUsuario);
	}
	
	public Boolean loginctUsuario (ctUsuario obj_ctUsuario) throws SQLException{
		return usuarioDao.loginctUsuario(obj_ctUsuario);
	}
}
