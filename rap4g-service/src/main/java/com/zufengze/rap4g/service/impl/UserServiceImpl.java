package com.zufengze.rap4g.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zufengze.rap4g.constants.ErrorCode;
import com.zufengze.rap4g.dao.UserDAO;
import com.zufengze.rap4g.dataobject.UserDO;
import com.zufengze.rap4g.exception.Rap4gException;
import com.zufengze.rap4g.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Long login(String account, String passwd) throws Rap4gException {
		UserDO userDO = userDAO.selectUserByAccount(account);
		if(userDO == null){
			throw new Rap4gException(ErrorCode.E0200001);
		}else if(userDO.getPassword() != passwd){
			throw new Rap4gException(ErrorCode.E0200002);
		}else{
			return userDO.getId();
		}
	}

}
