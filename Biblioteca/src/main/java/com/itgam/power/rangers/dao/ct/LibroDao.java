package com.itgam.power.rangers.dao.ct;

import java.util.List;

import com.itgam.power.rangers.model.ctLibro;

public interface LibroDao {
   
	public void addctLibro (ctLibro obj_ctLibro);
	
	public void updatectLibro (ctLibro obj_ctLibro);
	
	public void deletectLibro (Integer id_ctLibro);
	
	public List<ctLibro> list_ctLibro();
	
	public ctLibro get_ctLibro(Integer id_ctLibro);

}
