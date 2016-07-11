package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.NotificationDO;

public interface NotificationDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertNotification(NotificationDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteNotificationById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateNotificationById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return NotificationDO
	 */
	NotificationDO selectNotificationById(Long id);
}
