/**
 * Project Name:rap4g-domain File Name:ProjectAndUser.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午4:21:20 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class ProjectAndUserDO implements Serializable {

    private static final long serialVersionUID = 7763636767546783833L;

    /** 主键ID. */
    private Long              id;

    /** 项目ID. */
    private Long              projectId;

    /** 用户ID. */
    private Long              userId;

    /** 访问等级. */
    private Integer           accessLevel;

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
     * accessLevel.
     *
     * @return the accessLevel
     * @since JDK 1.6
     */
    public Integer getAccessLevel() {
        return accessLevel;
    }

    /**
     * accessLevel.
     *
     * @param accessLevel the accessLevel to set
     * @since JDK 1.6
     */
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProjectAndUser [id=");
        builder.append(id);
        builder.append(", projectId=");
        builder.append(projectId);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", accessLevel=");
        builder.append(accessLevel);
        builder.append("]");
        return builder.toString();
    }

}
