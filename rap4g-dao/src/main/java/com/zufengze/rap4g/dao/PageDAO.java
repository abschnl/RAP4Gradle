package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.PageDO;

public interface PageDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertPage(PageDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deletePageById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updatePageById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return PageDO
	 */
	PageDO selectPageById(Long id);
}
