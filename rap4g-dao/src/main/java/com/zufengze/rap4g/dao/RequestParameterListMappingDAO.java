package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.RequestParameterListMappingDO;

public interface RequestParameterListMappingDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertRequestParameterListMapping(RequestParameterListMappingDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteRequestParameterListMappingById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateRequestParameterListMappingById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return RequestParameterListMappingDO
	 */
	RequestParameterListMappingDO selectRequestParameterListMappingById(Long id);
}
