/**
 * Project Name:rap4g-service File Name:ProjectService.java Package Name:com.zufengze.rap4g.service
 * Date:2016年7月12日下午5:30:01 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.service;

import com.zufengze.rap4g.exception.Rap4gException;
import com.zufengze.rap4g.req.OrganizationReq;
import com.zufengze.rap4g.rsp.OrganizationRsp;
import com.zufengze.rap4g.rsp.PageQuestRsp;

/**
 * ClassName:ProjectService <br/>
 * Date: 2016年7月12日 下午5:30:01 <br/>
 * 
 * @author ZFZ
 * @version
 * @since JDK 1.6
 * @see
 */
public interface ProjectService {

    /**
     * 分页查询用户参与的项目
     * 
     * @param req
     * @return PageQuestRsp<OrganizationRsp>
     */
    PageQuestRsp<OrganizationRsp> selectProjectsByUid(OrganizationReq req) throws Rap4gException;
}
