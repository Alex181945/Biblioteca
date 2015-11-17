package com.itgam.power.rangers.dao.ct;

import java.sql.SQLException;

import com.itgam.power.rangers.model.ctUsuario;

public interface UsuarioDao {
	
	public void addctUsuario (ctUsuario obj_ctUsuario) throws SQLException;
	
	public void updatectUsuario (ctUsuario id_ctUsuario);
	
	public void deletectUsuario (Integer id_ctUsuario);

}
