package com.itgam.power.rangers.control.pr;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrestamoController {
	
	@RequestMapping(value = "/prestamo", method = RequestMethod.GET)
	public String servicios(Locale locale, Model model) {
	
	
		return "prestamo";
	}
}
