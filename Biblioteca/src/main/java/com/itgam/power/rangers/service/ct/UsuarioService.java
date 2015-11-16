package com.itgam.power.rangers.service.ct;

import com.itgam.power.rangers.model.ctUsuario;

public interface UsuarioService {

	public void addctUsuario (ctUsuario obj_ctUsuario);
	
	public void updatectUsuario (ctUsuario id_ctUsuario);
	
	public void deletectUsuario (Integer id_ctUsuario);
}