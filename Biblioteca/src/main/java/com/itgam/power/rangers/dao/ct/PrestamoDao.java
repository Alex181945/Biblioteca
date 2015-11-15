package com.itgam.power.rangers.dao.ct;

import com.itgam.power.rangers.service.ct.ctPrestamo;

public interface PrestamoDao {

	public void addctPrestamo (ctPrestamo obj_ctPrestamo);
	
	public void updatectPrestamo (ctPrestamo id_ctPrestamo);
	
	public void deletectPrestamo (Integer id_ctPrestamo);

}
