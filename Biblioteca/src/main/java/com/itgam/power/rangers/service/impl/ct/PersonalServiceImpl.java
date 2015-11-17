package com.itgam.power.rangers.service.impl.ct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgam.power.rangers.dao.ct.PersonalDao;
import com.itgam.power.rangers.model.ctPersonal;
import com.itgam.power.rangers.service.ct.PersonalService;
import java.sql.*;

@Service
public class PersonalServiceImpl implements PersonalService {

	@Autowired
	private PersonalDao personalDao;
	
	public void addctPersonal (ctPersonal obj_ctPersonal) throws SQLException{
		personalDao.addctPersonal(obj_ctPersonal);
	}
	
	public void updatectPersonal (ctPersonal obj_ctPersonal){
		personalDao.updatectPersonal(obj_ctPersonal);
	}
	
	public void deletectPersonal (Integer id_ctPersonal){
		
	}
}
