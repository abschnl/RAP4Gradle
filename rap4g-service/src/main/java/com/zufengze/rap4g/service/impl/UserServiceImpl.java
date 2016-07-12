package com.zufengze.rap4g.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zufengze.rap4g.constants.ErrorCode;
import com.zufengze.rap4g.dao.UserDAO;
import com.zufengze.rap4g.dataobject.UserDO;
import com.zufengze.rap4g.exception.Rap4gException;
import com.zufengze.rap4g.req.RegisterReq;
import com.zufengze.rap4g.service.UserService;
import com.zufengze.rap4g.utils.MD5Utils;

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

    @Override
    public void register(RegisterReq req) throws Rap4gException {
        UserDO userDO = new UserDO();
        // 账号
        userDO.setAccount(req.getAccount());
        // 邮箱
        userDO.setEmail(req.getEmail());
        // 是否开启新手引导
        userDO.setHintEnabled(UserDO.HINT_SIGN_ENABLE);
        // 错误登录次数，登录成功后会重置为0
        userDO.setIncorrectLoginAttempt(UserDO.LOGIN_ERROR_NUM_INIT);
        // 用户是否锁定 false-未锁定 true-被锁定
        userDO.setLockedOut(UserDO.LOCK_SIGN_UNLOCK);
        // mock接口调用次数 初始化为0
        userDO.setMockNum(UserDO.MOCK_NUM_INIT);
        // 名字/昵称
        userDO.setName(req.getRealname());
        // 密码
        userDO.setPassword(MD5Utils.getDoubleMD5(req.getPassword()));
        // 真实名字
        userDO.setRealname(req.getRealname());
        userDAO.insertUser(userDO);
    }

}
