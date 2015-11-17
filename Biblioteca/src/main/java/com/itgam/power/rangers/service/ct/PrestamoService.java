package com.itgam.power.rangers.service.ct;

import com.itgam.power.rangers.model.prPrestamos;
import java.sql.*;

public interface PrestamoService {
	
	public void addctPrestamo (prPrestamos obj_ctPrestamo) throws SQLException;
	
	public void updatectPrestamo (prPrestamos id_ctPrestamo);
	
	public void deletectPrestamo (Integer id_ctPrestamo);

}
