package com.itgam.power.rangers.control.ct;

import java.sql.SQLException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itgam.power.rangers.model.ctUsuario;
import com.itgam.power.rangers.service.ct.UsuarioService;

@Controller
public class RegistroController {
	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/biblioteca/registro", method = RequestMethod.GET)
	public String registro(Locale locale, Model model) {
		
		
		return "inicioSistema";
	}
	
	@RequestMapping(value = "/biblioteca/registro/usuario", method = RequestMethod.POST)
	public String home(@ModelAttribute("ctUsuario") ctUsuario obj_ctUsuario) throws SQLException {
		
		usuarioService.addctUsuario(obj_ctUsuario);
		return "redirect:/itgam/registro";
	}
}
