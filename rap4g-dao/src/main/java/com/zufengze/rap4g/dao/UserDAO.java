package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.UserDO;

public interface UserDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertUser(UserDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteUserById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateUserById(Long id);

	/**
	 * 根据ID查询指定数据
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
