/**
 * Project Name:rap4g-domain File Name:ModuleDO.java Package Name:com.zufengze.rap4g.dataobject Date:2016年7月6日下午1:38:14
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class ModuleDO implements Serializable {

    private static final long serialVersionUID = -3422444567141323938L;

    /** 主键ID. */
    private Long              id;

    /** 项目ID. */
    private Long              projectId;

    /** 名称. */
    private String            name;

    /** 介绍. */
    private String            introduction;

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
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ModuleDO [id=");
        builder.append(id);
        builder.append(", projectId=");
        builder.append(projectId);
        builder.append(", name=");
        builder.append(name);
        builder.append(", introduction=");
        builder.append(introduction);
        builder.append("]");
        return builder.toString();
    }

}
