package com.zufengze.rap4g.dao;

import org.apache.ibatis.annotations.Param;

import com.zufengze.rap4g.dataobject.ActionAndPageDO;

public interface ActionAndPageDAO {

	/**
	 * 新增请求与页面绑定数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertActionAndPage(ActionAndPageDO obj);

	/**
	 * 根据绑定关系ID删除请求与页面绑定数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteActionAndPageById(Long id);

	/**
	 * 根据绑定关系ID修改请求与页面绑定数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateActionAndPageById(Long id);

	/**
	 * 根据绑定关系ID查询指定请求与页面绑定数据
	 * 
	 * @param id
	 * @return ActionAndPageDO
	 */
	ActionAndPageDO selectActionAndPageById(Long id);
}
