package com.itgam.power.rangers.control.pr;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itgam.power.rangers.control.HomeController;

@Controller
public class PrestamoController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/prestamo", method = RequestMethod.GET)
	public String servicios(Locale locale, Model model) {
	
	
		return "prestamo";
	}
}
