package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.CorporationAndUserDO;

public interface CorporationAndUserDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertCorporationAndUser(CorporationAndUserDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteCorporationAndUserById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateCorporationAndUserById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return CorporationAndUserDO
	 */
	CorporationAndUserDO selectCorporationAndUserById(Long id);
}
