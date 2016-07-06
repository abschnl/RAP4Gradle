/**
 * Project Name:rap4g-domain File Name:UserSettingsDO.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午4:55:09 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class UserSettingsDO implements Serializable {

    private static final long serialVersionUID = 5199865502015399420L;

    /** 主键ID. */
    private Long              id;

    /** 用户ID. */
    private Long              userId;

    /** 配置KEY. */
    private Long              key;

    /** 配置VALUE. */
    private Long              value;

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
     * key.
     *
     * @return the key
     * @since JDK 1.6
     */
    public Long getKey() {
        return key;
    }

    /**
     * key.
     *
     * @param key the key to set
     * @since JDK 1.6
     */
    public void setKey(Long key) {
        this.key = key;
    }

    /**
     * value.
     *
     * @return the value
     * @since JDK 1.6
     */
    public Long getValue() {
        return value;
    }

    /**
     * value.
     *
     * @param value the value to set
     * @since JDK 1.6
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserSettingsDO [id=");
        builder.append(id);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", key=");
        builder.append(key);
        builder.append(", value=");
        builder.append(value);
        builder.append("]");
        return builder.toString();
    }

}
