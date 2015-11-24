package com.itgam.power.rangers.control.ct;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itgam.power.rangers.model.ctLibro;
import com.itgam.power.rangers.service.ct.LibroService;

@Controller
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	@RequestMapping(value = "/libro", method = RequestMethod.GET)
	public String libro(Model model) {
		
		model.addAttribute("ctLibro", new ctLibro());
		model.addAttribute("lista_ctLibro",libroService.list_ctLibro());
		
		return "registroLibros";
	}
	
	@RequestMapping(value = "/libro/registro", method = RequestMethod.POST)
	public String registroLibro(@ModelAttribute("ctLibro") ctLibro obj_ctLibro) throws SQLException {
		System.out.println("Entro con: " + obj_ctLibro.getiLibro());
		if((obj_ctLibro.getiLibro()).equals(0)){
			System.out.println("Entro");
			libroService.addctLibro(obj_ctLibro);
		}
		else{
			libroService.updatectLibro(obj_ctLibro);
		}
		
		return "redirect:/libro";
	}
	
	@RequestMapping("/libro/get/{id}")
	public String get_ctLibro(@PathVariable("id") int id_ctLibro, Model model){
		
		model.addAttribute("ctLibro",libroService.get_ctLibro(id_ctLibro));
		return "addLibro";

	}
	
	@RequestMapping("/libro/borrar/{id}")
	public String remove_ctLibro(@PathVariable("id") int id_ctLibro){
		
		libroService.deletectLibro(id_ctLibro);
		return "redirect:/libro";
	}
}
