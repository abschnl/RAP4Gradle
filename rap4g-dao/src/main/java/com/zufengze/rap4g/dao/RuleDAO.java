package com.zufengze.rap4g.dao;

import com.zufengze.rap4g.dataobject.RuleDO;

public interface RuleDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertRule(RuleDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteRuleById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateRuleById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return RuleDO
	 */
	RuleDO selectRuleById(Long id);
}
