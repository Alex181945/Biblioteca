package com.itgam.power.rangers.service.ct;

import com.itgam.power.rangers.model.ctPersonal;
import java.sql.*;

public interface PersonalService {
	
	public void addctPersonal (ctPersonal obj_ctPersonal) throws SQLException;
	
	public void updatectPersonal (ctPersonal id_ctPersonal);
	
	public void deletectPersonal (Integer id_ctPersonal);

}
