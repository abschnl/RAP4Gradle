/**
 * Project Name:rap4g-domain File Name:RuleDO.java Package Name:com.zufengze.rap4g.dataobject Date:2016年7月6日下午4:38:55
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;
import java.util.Date;

public class RuleDO implements Serializable {

    private static final long serialVersionUID = -8365218384005941508L;

    /** 主键ID. */
    private Long              id;

    /** 请求ID. */
    private Long              actionId;

    /** 规则ID. */
    private String            rules;

    /** 修改时间ID. */
    private Date              updateTime;

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
     * actionId.
     *
     * @return the actionId
     * @since JDK 1.6
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * actionId.
     *
     * @param actionId the actionId to set
     * @since JDK 1.6
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * rules.
     *
     * @return the rules
     * @since JDK 1.6
     */
    public String getRules() {
        return rules;
    }

    /**
     * rules.
     *
     * @param rules the rules to set
     * @since JDK 1.6
     */
    public void setRules(String rules) {
        this.rules = rules;
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
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RuleDO [id=");
        builder.append(id);
        builder.append(", actionId=");
        builder.append(actionId);
        builder.append(", rules=");
        builder.append(rules);
        builder.append(", updateTime=");
        builder.append(updateTime);
        builder.append("]");
        return builder.toString();
    }

}
