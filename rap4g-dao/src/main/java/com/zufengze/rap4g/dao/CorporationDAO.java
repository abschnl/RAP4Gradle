package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.CorporationDO;

public interface CorporationDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertCorporation(CorporationDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteCorporationById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateCorporationById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return CorporationDO
	 */
	CorporationDO selectCorporationById(Long id);
}
