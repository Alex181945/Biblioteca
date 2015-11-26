package com.itgam.power.rangers.service.ct;

import java.sql.SQLException;
import java.util.List;

import com.itgam.power.rangers.model.ctUsuario;

public interface UsuarioService {

	public void addctUsuario (ctUsuario obj_ctUsuario) throws SQLException;
	
	public void updatectUsuario (ctUsuario id_ctUsuario);
	
	public void deletectUsuario (Integer id_ctUsuario);
	
	public Boolean loginctUsuario (ctUsuario obj_ctUsuario) throws SQLException;
	
	public List<ctUsuario> list_ctUsuario();
	
	public ctUsuario get_ctUsuario(Integer id_ctUsuario);
}