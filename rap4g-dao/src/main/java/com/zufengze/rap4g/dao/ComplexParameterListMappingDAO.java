package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.ComplexParameterListMappingDO;

public interface ComplexParameterListMappingDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertComplexParameterListMapping(ComplexParameterListMappingDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteComplexParameterListMappingById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateComplexParameterListMappingById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return ComplexParameterListMappingDO
	 */
	ComplexParameterListMappingDO selectComplexParameterListMappingById(Long id);
}
