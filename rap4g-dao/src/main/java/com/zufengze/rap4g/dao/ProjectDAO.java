package com.zufengze.rap4g.dao;

import java.util.List;

import com.zufengze.rap4g.dataobject.ProjectDO;
import com.zufengze.rap4g.req.OrganizationReq;

public interface ProjectDAO {

	/**
	 * 新增数据
	 * 
	 * @param obj
	 * @return 影响记录数
	 */
	void insertProject(ProjectDO obj);

	/**
	 * 根据ID删除数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int deleteProjectById(Long id);

	/**
	 * 根据ID修改数据
	 * 
	 * @param id
	 * @return 影响记录数
	 */
	int updateProjectById(Long id);

	/**
	 * 根据ID获取数据
	 * 
	 * @param id
	 * @return ProjectDO
	 */
	ProjectDO selectProjectById(Long id);
	
   /**
     * 分页查询用户参与的项目数量
     * 
     * @param req
     * @return int
     */
    int selectProjectsByUidCount(OrganizationReq req);
	
	
   /**
     * 分页查询用户参与的项目
     * 
     * @param req
     * @return List<ProjectDO>
     */
	List<ProjectDO> selectProjectsByUid(OrganizationReq req);
}
