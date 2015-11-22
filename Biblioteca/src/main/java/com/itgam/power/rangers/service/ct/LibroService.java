package com.itgam.power.rangers.service.ct;

import java.util.List;

import com.itgam.power.rangers.model.ctLibro;

public interface LibroService {
	
	public void addctLibro (ctLibro obj_ctLibro);
	
	public void updatectLibro (ctLibro id_ctLibro);
	
	public void deletectLibro (Integer id_ctLibro);

	public List<ctLibro> list_ctLibro();
	
	public ctLibro get_ctLibro(Integer id_ctLibro);
}
