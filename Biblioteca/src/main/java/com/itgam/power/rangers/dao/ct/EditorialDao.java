package com.itgam.power.rangers.dao.ct;

import java.sql.SQLException;
import java.util.List;

import com.itgam.power.rangers.model.ctEditorial;

public interface EditorialDao {
	
    public void addctEditorial (ctEditorial obj_ctEditorial) throws SQLException;
	
	public void updatectEditorial (ctEditorial obj_ctEditorial);
	
	public void deletectEditorial (Integer id_ctEditorial);
	
	public List<ctEditorial> list_ctEditorial();
	
	public ctEditorial get_ctEditorial (Integer id_ctEditorial);

}
