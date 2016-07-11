package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.ParameterDO;

public interface ParameterDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertParameter(ParameterDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteParameterById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateParameterById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return ParameterDO
	 */
	ParameterDO selectParameterById(Long id);
}
