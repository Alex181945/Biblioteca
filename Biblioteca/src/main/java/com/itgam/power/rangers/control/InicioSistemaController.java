package com.itgam.power.rangers.control;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itgam.power.rangers.model.ctLibro;
import com.itgam.power.rangers.model.ctUsuario;
import com.itgam.power.rangers.service.ct.UsuarioService;

@Controller
public class InicioSistemaController {
	@Autowired
	private UsuarioService usuarioService;

private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/itgam", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "login";
	}
	
	@RequestMapping(value = "/itgam/login", method = RequestMethod.POST)
	public String sistemaLogin(@ModelAttribute("ctUsuario") ctUsuario obj_ctUsuario) throws SQLException {
		System.out.println(obj_ctUsuario.getcUsuario()+" "+obj_ctUsuario.getcPassword());
		Boolean respuesta = usuarioService.loginctUsuario(obj_ctUsuario);
		if(respuesta.equals(false)){
			return "redirect:/itgam";
		}
		return "redirect:/biblioteca";
	}
	
	@RequestMapping(value = "/biblioteca", method = RequestMethod.GET)
	public String inicio(Locale locale, Model model) {
		return "inicioSistema";
	}
	
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String usuario(Locale locale, Model model) {
		
		
		model.addAttribute("ctUsuario", new ctUsuario());
		model.addAttribute("lista_ctUsuario",usuarioService.list_ctUsuario());
		return "usuario";
	}
}
