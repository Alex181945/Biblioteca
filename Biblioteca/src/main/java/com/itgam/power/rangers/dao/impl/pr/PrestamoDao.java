package com.itgam.power.rangers.dao.impl.pr;

import com.itgam.power.rangers.model.prPrestamos;

public interface PrestamoDao {

	public void addctPrestamo (prPrestamos obj_ctPrestamo);
	
	public void updatectPrestamo (prPrestamos id_ctPrestamo);
	
	public void deletectPrestamo (Integer id_ctPrestamo);

}
