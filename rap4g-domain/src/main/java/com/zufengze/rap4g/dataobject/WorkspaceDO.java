/**
 * Project Name:rap4g-domain File Name:WorkspaceDO.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午5:00:41 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;
import java.util.Date;

public class WorkspaceDO implements Serializable {

    private static final long serialVersionUID = 5783220663126498399L;

    /** 主键ID. */
    private Long              id;

    /** 项目ID. */
    private Long              projectId;

    /** 用户ID. */
    private Long              userId;

    /** 创建时间. */
    private Date              createDate;

    /** 修改时间. */
    private Date              updateDate;

    /** 项目数据. */
    private String            projectData;

    /** 项目原始数据. */
    private String            projectDataOriginal;

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
     * projectId.
     *
     * @return the projectId
     * @since JDK 1.6
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * projectId.
     *
     * @param projectId the projectId to set
     * @since JDK 1.6
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * userId.
     *
     * @return the userId
     * @since JDK 1.6
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * userId.
     *
     * @param userId the userId to set
     * @since JDK 1.6
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * createDate.
     *
     * @return the createDate
     * @since JDK 1.6
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * createDate.
     *
     * @param createDate the createDate to set
     * @since JDK 1.6
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
     * projectDataOriginal.
     *
     * @return the projectDataOriginal
     * @since JDK 1.6
     */
    public String getProjectDataOriginal() {
        return projectDataOriginal;
    }

    /**
     * projectDataOriginal.
     *
     * @param projectDataOriginal the projectDataOriginal to set
     * @since JDK 1.6
     */
    public void setProjectDataOriginal(String projectDataOriginal) {
        this.projectDataOriginal = projectDataOriginal;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("WorkspaceDO [id=");
        builder.append(id);
        builder.append(", projectId=");
        builder.append(projectId);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", createDate=");
        builder.append(createDate);
        builder.append(", updateDate=");
        builder.append(updateDate);
        builder.append(", projectData=");
        builder.append(projectData);
        builder.append(", projectDataOriginal=");
        builder.append(projectDataOriginal);
        builder.append("]");
        return builder.toString();
    }

}
