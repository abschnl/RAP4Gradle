/**
 * Project Name:rap4g-domain File Name:RequestParameterListMapping.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午4:24:34 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class RequestParameterListMappingDO implements Serializable {

    private static final long serialVersionUID = 6032682212190721874L;

    /** 主键ID. */
    private Long              id;

    /** 请求ID. */
    private Long              actionId;

    /** 参数ID. */
    private Long              parameterId;

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
     * parameterId.
     *
     * @return the parameterId
     * @since JDK 1.6
     */
    public Long getParameterId() {
        return parameterId;
    }

    /**
     * parameterId.
     *
     * @param parameterId the parameterId to set
     * @since JDK 1.6
     */
    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RequestParameterListMappingDO [id=");
        builder.append(id);
        builder.append(", actionId=");
        builder.append(actionId);
        builder.append(", parameterId=");
        builder.append(parameterId);
        builder.append("]");
        return builder.toString();
    }

}
