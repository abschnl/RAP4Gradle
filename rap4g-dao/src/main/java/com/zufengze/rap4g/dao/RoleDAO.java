package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.RoleDO;

public interface RoleDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertRole(RoleDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteRoleById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateRoleById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return RoleDO
	 */
	RoleDO selectRoleById(Long id);
}
