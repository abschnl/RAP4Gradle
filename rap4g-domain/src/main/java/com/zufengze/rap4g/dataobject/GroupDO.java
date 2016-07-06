/**
 * Project Name:rap4g-domain File Name:groupDO.java Package Name:com.zufengze.rap4g.dataobject Date:2016年7月6日上午11:25:40
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class GroupDO implements Serializable {

    private static final long serialVersionUID = 1695927979965225490L;

    /** 主键ID. */
    private Long              id;

    /** 名称. */
    private String            name;

    /** 生产线ID. */
    private Long              productionLineId;

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
     * productionLineId.
     *
     * @return the productionLineId
     * @since JDK 1.6
     */
    public Long getProductionLineId() {
        return productionLineId;
    }

    /**
     * productionLineId.
     *
     * @param productionLineId the productionLineId to set
     * @since JDK 1.6
     */
    public void setProductionLineId(Long productionLineId) {
        this.productionLineId = productionLineId;
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
        builder.append("groupDO [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", productionLineId=");
        builder.append(productionLineId);
        builder.append(", userId=");
        builder.append(userId);
        builder.append("]");
        return builder.toString();
    }

}
