package com.itgam.power.rangers.dao.ct;

import java.sql.SQLException;

import com.itgam.power.rangers.model.ctUsuario;

public interface UsuarioDao {
	
	public void addctUsuario (ctUsuario obj_ctUsuario) throws SQLException;
	
	public void updatectUsuario (ctUsuario obj_ctUsuario);
	
	public void deletectUsuario (Integer id_ctUsuario);

	public Boolean loginctUsuario (ctUsuario obj_ctUsuario) throws SQLException;
}
