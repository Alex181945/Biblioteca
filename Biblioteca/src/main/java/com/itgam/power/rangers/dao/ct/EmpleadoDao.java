package com.itgam.power.rangers.dao.ct;

import com.itgam.power.rangers.service.ct.ctEmpleado;

public interface EmpleadoDao {

	public void addctEmpleado (ctEmpleado obj_ctEmpleado);
	
	public void updatectEmpleado (ctEmpleado id_ctEmpleado);
	
	public void deletectEmpleado (Integer id_ctEmpleado);
}
