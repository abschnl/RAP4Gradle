/**
 * Project Name:rap4g-domain File Name:ProductionLineDO.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午4:08:17 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class ProductionLineDO implements Serializable {

    private static final long serialVersionUID = -5066574145056281634L;

    /** 主键ID. */
    private Long              id;

    /** 名称. */
    private String            name;

    /** 工程数量. */
    private Integer           projectNum;

    /** 公司ID. */
    private Long              corporationId;

    /** 用户ID. */
    private Long              userId;

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
     * projectNum.
     *
     * @return the projectNum
     * @since JDK 1.6
     */
    public Integer getProjectNum() {
        return projectNum;
    }

    /**
     * projectNum.
     *
     * @param projectNum the projectNum to set
     * @since JDK 1.6
     */
    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
    }

    /**
     * corporationId.
     *
     * @return the corporationId
     * @since JDK 1.6
     */
    public Long getCorporationId() {
        return corporationId;
    }

    /**
     * corporationId.
     *
     * @param corporationId the corporationId to set
     * @since JDK 1.6
     */
    public void setCorporationId(Long corporationId) {
        this.corporationId = corporationId;
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
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProductionLineDO [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", projectNum=");
        builder.append(projectNum);
        builder.append(", corporationId=");
        builder.append(corporationId);
        builder.append(", userId=");
        builder.append(userId);
        builder.append("]");
        return builder.toString();
    }

}
