package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.ProjectAndUserDO;

public interface ProjectAndUserDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertProjectAndUser(ProjectAndUserDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteProjectAndUserById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateProjectAndUserById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return ProjectAndUserDO
	 */
	ProjectAndUserDO selectProjectAndUserById(Long id);
}
