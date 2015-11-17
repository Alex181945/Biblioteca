package com.itgam.power.rangers.control.ct;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class RegistroController {

	@RequestMapping(value = "/itgam/registro", method = RequestMethod.GET)
	public String registro(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "inicioSistema";
	}
	
	@RequestMapping(value = "/itgam/registro/usuario", method = RequestMethod.POST)
	public String home(Locale locale, Model model) {
		
		return "inicioSistema";
	}
}
