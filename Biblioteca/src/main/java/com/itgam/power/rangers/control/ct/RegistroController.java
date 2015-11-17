package com.itgam.power.rangers.control.ct;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
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

	@RequestMapping(value = "/itgam/registro", method = RequestMethod.GET)
	public String registro(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "inicioSistema";
	}
	
	@RequestMapping(value = "/itgam/registro/usuario", method = RequestMethod.POST)
	public String home(@ModelAttribute("ctUsuario") ctUsuario obj_ctUsuario) throws SQLException {
		
		/*Prueba*/
		
		obj_ctUsuario.setcNombre("Alex");
		obj_ctUsuario.setcApellidos("Estrada");
		obj_ctUsuario.setcCalle("AS");
		obj_ctUsuario.setcNumExterior("67");
		obj_ctUsuario.setcNumInterior("2");
		obj_ctUsuario.setcColonia("Vallejo");
		obj_ctUsuario.setcCP("07870");
		obj_ctUsuario.setcEstado("DF");
		obj_ctUsuario.setcEmail("alestra55@hotmail.com");
		//obj_ctUsuario.setdtFechaNac("2015/11/17 00:00:00.000000"); Estoy agregando un mensaje para verificar cambios
		obj_ctUsuario.setlSexo(true);
		obj_ctUsuario.setcUsuario("alex");
		obj_ctUsuario.setcPassword("123");
		obj_ctUsuario.setlEstatus(true);
		obj_ctUsuario.setcObs("XD");
		/*Elimar en cuanto deje de ser funcional*/
		usuarioService.addctUsuario(obj_ctUsuario);
		return "inicioSistema";
	}
}
