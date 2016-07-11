package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.ModuleDO;

public interface ModuleDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertModule(ModuleDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteModuleById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateModuleById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return ModuleDO
	 */
	ModuleDO selectModuleById(Long id);
}
