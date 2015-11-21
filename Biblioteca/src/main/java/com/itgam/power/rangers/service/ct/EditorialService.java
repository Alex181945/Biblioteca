package com.itgam.power.rangers.service.ct;

import java.sql.SQLException;

import com.itgam.power.rangers.model.ctEditorial;

public interface EditorialService {
	
	public void addctEditorial (ctEditorial obj_ctEditorial) throws SQLException;
	
	public void updatectEditorial (ctEditorial id_ctEditorial);
	
	public void deletectEditorial (Integer id_ctEditorial);

}
