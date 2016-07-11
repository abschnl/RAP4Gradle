package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.ActionDO;

public interface ActionDAO {

	/**
	 * 新增请求数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertAction(ActionDO obj);

	/**
	 * 根据请求ID删除请求数据
	 *  
	 * @param id
	 * @return 影响记录数
	 */
	int deleteActionById(Long id);

	/**
	 * 根据请求ID修改请求数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateActionById(Long id);

	/**
	 * 根据请求ID获取请求数据
	 * 
	 * @param id
	 * @return ActionDO
	 */
	ActionDO selectActionById(Long id);
}
