package com.itgam.power.rangers.control.ct;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itgam.power.rangers.model.ctUsuario;
import com.itgam.power.rangers.service.ct.UsuarioService;

@Controller
public class ReporteController {
	
	@Autowired
	private UsuarioService usuarioSerivice;
	
	@RequestMapping(value = "/repUsuario", method = RequestMethod.POST)
	public ModelAndView getList(Model model){

		List<ctUsuario> list = usuarioSerivice.list_ctUsuario();
		
		ModelAndView miModelo = new ModelAndView("pdfViewRepAlumnoGrupo");
		
		miModelo.addObject("listaUsuario", list);
		//miModelo.addObject("grupo", grupo);
		
		return miModelo;
	}
}
