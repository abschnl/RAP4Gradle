package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.RoleAndUserDO;

public interface RoleAndUserDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertRoleAndUser(RoleAndUserDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteRoleAndUserById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateRoleAndUserById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return RoleAndUserDO
	 */
	RoleAndUserDO selectRoleAndUserById(Long id);
}
