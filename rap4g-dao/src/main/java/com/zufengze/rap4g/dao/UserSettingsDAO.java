package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.UserSettingsDO;

public interface UserSettingsDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertUserSettings(UserSettingsDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteUserSettingsById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateUserSettingsById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return UserSettingsDO
	 */
	UserSettingsDO selectUserSettingsById(Long id);
}
