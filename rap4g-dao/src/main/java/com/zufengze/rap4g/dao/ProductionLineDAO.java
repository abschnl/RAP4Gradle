package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.ProductionLineDO;

public interface ProductionLineDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertProductionLine(ProductionLineDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteProductionLineById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateProductionLineById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return ProductionLineDO
	 */
	ProductionLineDO selectProductionLineById(Long id);
}
