package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.WorkspaceSaveDO;

public interface WorkspaceSaveDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertWorkspaceSave(WorkspaceSaveDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteWorkspaceSaveById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateWorkspaceSaveById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return WorkspaceSaveDO
	 */
	WorkspaceSaveDO selectWorkspaceSaveById(Long id);
}
