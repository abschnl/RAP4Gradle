package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.GroupDO;

public interface GroupDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertGroup(GroupDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteGroupById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateGroupById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return GroupDO
	 */
	GroupDO selectGroupById(Long id);
}
