/**
 * Project Name:rap4g-domain File Name:WorkspaceSaveDO.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午5:16:10 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;
import java.util.Date;

public class WorkspaceSaveDO implements Serializable {

    private static final long serialVersionUID = 5324508215030406988L;

    /** 主键ID. */
    private Long              id;

    /** 工作空间ID. */
    private Long              workspaceId;

    /** 更新时间. */
    private Date              updateDate;

    /** 项目数据. */
    private String            projectData;

    /**
     * id.
     *
     * @return the id
     * @since JDK 1.6
     */
    public Long getId() {
        return id;
    }

    /**
     * id.
     *
     * @param id the id to set
     * @since JDK 1.6
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * workspaceId.
     *
     * @return the workspaceId
     * @since JDK 1.6
     */
    public Long getWorkspaceId() {
        return workspaceId;
    }

    /**
     * workspaceId.
     *
     * @param workspaceId the workspaceId to set
     * @since JDK 1.6
     */
    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * updateDate.
     *
     * @return the updateDate
     * @since JDK 1.6
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * updateDate.
     *
     * @param updateDate the updateDate to set
     * @since JDK 1.6
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * projectData.
     *
     * @return the projectData
     * @since JDK 1.6
     */
    public String getProjectData() {
        return projectData;
    }

    /**
     * projectData.
     *
     * @param projectData the projectData to set
     * @since JDK 1.6
     */
    public void setProjectData(String projectData) {
        this.projectData = projectData;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("WorkspaceSaveDO [id=");
        builder.append(id);
        builder.append(", workspaceId=");
        builder.append(workspaceId);
        builder.append(", updateDate=");
        builder.append(updateDate);
        builder.append(", projectData=");
        builder.append(projectData);
        builder.append("]");
        return builder.toString();
    }

}
