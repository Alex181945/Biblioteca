package com.itgam.power.rangers.dao.cb;

import java.util.List;

import com.itgam.power.rangers.model.cbCargo;

public interface CargoDao {

	public void addctLibro (cbCargo obj_cbCargo);
	
	public void updatectLibro (cbCargo obj_cbCargo);
	
	public void deletecbCargo (Integer id_cbCargo);
	
	public List<cbCargo> list_cbCargo();
	
	public cbCargo get_cbCargo(Integer id_cbCargo);
}
