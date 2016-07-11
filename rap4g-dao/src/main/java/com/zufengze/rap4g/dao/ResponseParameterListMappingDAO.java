package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.ResponseParameterListMappingDO;

public interface ResponseParameterListMappingDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertResponseParameterListMapping(ResponseParameterListMappingDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteResponseParameterListMappingById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateResponseParameterListMappingById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return ResponseParameterListMappingDO
	 */
	ResponseParameterListMappingDO selectResponseParameterListMappingById(Long id);
}
