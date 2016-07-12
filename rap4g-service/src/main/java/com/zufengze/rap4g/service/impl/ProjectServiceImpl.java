/**
 * Project Name:rap4g-service File Name:ProjectServiceImpl.java Package Name:com.zufengze.rap4g.service.impl
 * Date:2016年7月12日下午5:30:57 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.zufengze.rap4g.dao.ProjectDAO;
import com.zufengze.rap4g.dataobject.ProjectDO;
import com.zufengze.rap4g.exception.Rap4gException;
import com.zufengze.rap4g.req.OrganizationReq;
import com.zufengze.rap4g.rsp.OrganizationRsp;
import com.zufengze.rap4g.rsp.PageQuestRsp;
import com.zufengze.rap4g.service.ProjectService;

/**
 * ClassName:ProjectServiceImpl <br/>
 * Date: 2016年7月12日 下午5:30:57 <br/>
 * 
 * @author ZFZ
 * @version
 * @since JDK 1.6
 * @see
 */
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    @Override
    public PageQuestRsp<OrganizationRsp> selectProjectsByUid(OrganizationReq req) throws Rap4gException {
        // 1.查询记录总数
        int totalAmount = projectDAO.selectProjectsByUidCount(req);
        if (totalAmount == 0) {
            return new PageQuestRsp<OrganizationRsp>(totalAmount, null, req.getPageSize());
        }
        // 2.查询列表数据
        req.setRowStart(req.getPageSize() * (req.getCurrentPage() - 1));
        List<ProjectDO> projects = projectDAO.selectProjectsByUid(req);
        if (CollectionUtils.isEmpty(projects)) {
            return new PageQuestRsp<OrganizationRsp>(totalAmount, null, req.getPageSize());
        }
        // 3.组装返回结果
        List<OrganizationRsp> rspList = new ArrayList<OrganizationRsp>(projects.size());
        for (ProjectDO project : projects) {
            OrganizationRsp organizationRsp = new OrganizationRsp();
            organizationRsp.setId(project.getId());
            organizationRsp.setName(project.getName());
//          organizationRsp.setUpdateTime(project.getUpdateTime());
            rspList.add(organizationRsp);
        }
        return new PageQuestRsp<OrganizationRsp>(totalAmount, rspList, req.getPageSize());
    }

}
