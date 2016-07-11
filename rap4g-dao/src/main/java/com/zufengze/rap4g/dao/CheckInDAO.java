package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.CheckInDO;

public interface CheckInDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertCheckIn(CheckInDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteCheckInById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateCheckInById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return CheckInDO
	 */
	CheckInDO selectCheckInById(Long id);
}
