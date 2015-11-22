package com.itgam.power.rangers.service.impl.ct;

import java.util.List;

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
		libroDao.addctLibro(obj_ctLibro);
	}
	
	public void updatectLibro (ctLibro obj_ctLibro){
		libroDao.updatectLibro(obj_ctLibro);
	}
	
	public void deletectLibro (Integer id_ctLibro){
		libroDao.deletectLibro(id_ctLibro);
	}
	
	public List<ctLibro> list_ctLibro(){
		return libroDao.list_ctLibro();
	}
	
	public ctLibro get_ctLibro(Integer id_ctLibro){
		return libroDao.get_ctLibro(id_ctLibro);
	}
}
