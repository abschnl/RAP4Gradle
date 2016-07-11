package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.UserDO;

public interface UserDAO {

	/**
	 * 新增请求与页面绑定数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertUser(UserDO obj);

	/**
	 * 根据绑定关系ID删除请求与页面绑定数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteUserById(Long id);

	/**
	 * 根据绑定关系ID修改请求与页面绑定数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateUserById(Long id);

	/**
	 * 根据绑定关系ID查询指定请求与页面绑定数据
	 * 
	 * @param id
	 * @return UserDO
	 */
	UserDO selectUserById(Long id);
	
	/**
	 * 根据账号查询用户信息
	 * 
	 * @param account
	 * @return UserDO
	 */
	UserDO selectUserByAccount(String account);
}
