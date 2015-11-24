package com.itgam.power.rangers.service.impl.ct;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.power.rangers.dao.ct.EditorialDao;
import com.itgam.power.rangers.model.ctEditorial;
import com.itgam.power.rangers.service.ct.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService {

	@Autowired
	private EditorialDao editorialDao;
	
	public void addctEditorial (ctEditorial obj_ctEditorial) throws SQLException{
		editorialDao.addctEditorial(obj_ctEditorial);
	}
	
	public void updatectEditorial (ctEditorial obj_ctEditorial){
		editorialDao.updatectEditorial(obj_ctEditorial);
	}
	
	public void deletectEditorial (Integer id_ctEditorial){
		editorialDao.deletectEditorial(id_ctEditorial);
	}
	
	public List<ctEditorial> list_ctEditorial(){
		return editorialDao.list_ctEditorial();
	}
	
	public ctEditorial get_ctEditorial (Integer id_ctEditorial){
		return editorialDao.get_ctEditorial(id_ctEditorial);
	}
}
