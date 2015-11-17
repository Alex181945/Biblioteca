package com.itgam.power.rangers.service.impl.ct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.power.rangers.dao.ct.LibroDao;
import com.itgam.power.rangers.model.ctLibro;
import com.itgam.power.rangers.service.ct.LibroService;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDao libroDao;
	
	public void addctLibro (ctLibro obj_ctLibro){
		
	}
	
	public void updatectLibro (ctLibro id_ctLibro){
		
	}
	
	public void deletectLibro (Integer id_ctLibro){
		
	}
}
