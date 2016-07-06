/**
 * Project Name:rap4g-domain File Name:ProjectDO.java Package Name:com.zufengze.rap4g.dataobject Date:2016年7月6日下午4:13:17
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;
import java.util.Date;

public class ProjectDO implements Serializable {

    private static final long serialVersionUID = -5426530984014794816L;

    /** 权限：普通. */
    final static int          ACCESS_NORMAL    = 10;

    /** 权限：私有. */
    final static int          ACCESS_PRIVATE   = 0;

    /** 主键ID. */
    private Long              id;

    /** 版本号 . */
    private String            version;

    /** 项目名称. */
    private String            name;

    /** 创建日期. */
    private Date              createDate;

    /** 创建人ID. */
    private Long              userId;

    /** 项目描述. */
    private String            introduction;

    /** 项目JSON数据，存放当前最新的版本. */
    private String            projectData;

    /** 分组ID. */
    private Long              groupId;

    /** 路由ID，用于指定与哪些项目共享mock数据. */
    private String            relatedIds;

    /** 更新时间. */
    private Date              updateTime;

    /** mock次数. */
    private Integer           mockNum;

    /** 权限控制, 10普通, 0私有. */
    private Integer           accessType;

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
     * version.
     *
     * @return the version
     * @since JDK 1.6
     */
    public String getVersion() {
        return version;
    }

    /**
     * version.
     *
     * @param version the version to set
     * @since JDK 1.6
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * name.
     *
     * @return the name
     * @since JDK 1.6
     */
    public String getName() {
        return name;
    }

    /**
     * name.
     *
     * @param name the name to set
     * @since JDK 1.6
     */
    public void setName(String name) {
        this.name = name;
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
     * introduction.
     *
     * @return the introduction
     * @since JDK 1.6
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * introduction.
     *
     * @param introduction the introduction to set
     * @since JDK 1.6
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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
     * groupId.
     *
     * @return the groupId
     * @since JDK 1.6
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * groupId.
     *
     * @param groupId the groupId to set
     * @since JDK 1.6
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * relatedIds.
     *
     * @return the relatedIds
     * @since JDK 1.6
     */
    public String getRelatedIds() {
        return relatedIds;
    }

    /**
     * relatedIds.
     *
     * @param relatedIds the relatedIds to set
     * @since JDK 1.6
     */
    public void setRelatedIds(String relatedIds) {
        this.relatedIds = relatedIds;
    }

    /**
     * updateTime.
     *
     * @return the updateTime
     * @since JDK 1.6
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * updateTime.
     *
     * @param updateTime the updateTime to set
     * @since JDK 1.6
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * mockNum.
     *
     * @return the mockNum
     * @since JDK 1.6
     */
    public Integer getMockNum() {
        return mockNum;
    }

    /**
     * mockNum.
     *
     * @param mockNum the mockNum to set
     * @since JDK 1.6
     */
    public void setMockNum(Integer mockNum) {
        this.mockNum = mockNum;
    }

    /**
     * accessType.
     *
     * @return the accessType
     * @since JDK 1.6
     */
    public Integer getAccessType() {
        return accessType;
    }

    /**
     * accessType.
     *
     * @param accessType the accessType to set
     * @since JDK 1.6
     */
    public void setAccessType(Integer accessType) {
        this.accessType = accessType;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProjectDO [id=");
        builder.append(id);
        builder.append(", version=");
        builder.append(version);
        builder.append(", name=");
        builder.append(name);
        builder.append(", createDate=");
        builder.append(createDate);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", introduction=");
        builder.append(introduction);
        builder.append(", projectData=");
        builder.append(projectData);
        builder.append(", groupId=");
        builder.append(groupId);
        builder.append(", relatedIds=");
        builder.append(relatedIds);
        builder.append(", updateTime=");
        builder.append(updateTime);
        builder.append(", mockNum=");
        builder.append(mockNum);
        builder.append(", accessType=");
        builder.append(accessType);
        builder.append("]");
        return builder.toString();
    }

}
