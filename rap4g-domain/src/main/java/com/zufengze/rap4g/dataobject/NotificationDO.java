/**
 * Project Name:rap4g-domain File Name:Notification.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午3:54:44 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;
import java.util.Date;

public class NotificationDO implements Serializable {

    private static final long serialVersionUID = -4558476218538076768L;

    /** 通知类型:文档修改. */
    final static int          DOC_EDIT         = 1;

    /** 通知类型:被加入新项目. */
    final static int          JOIN_NEW_PROJECT = 2;

    /** 主键ID. */
    private Long              id;

    /** 接受通知的用户ID. */
    private Long              userId;

    /** 上下文用户ID. */
    private Long              targetUserId;

    /** 通知类型 1-文档修改,2-被加入新项目. */
    private Integer           typeId;

    /** 1,2-项目id. */
    private String            param1;

    /** 1,2-项目名称. */
    private String            param2;

    /** 备用预留. */
    private String            param3;

    /** 创建时间. */
    private Date              createTime;

    /** 是否已读. */
    private boolean           isRead;

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
     * targetUserId.
     *
     * @return the targetUserId
     * @since JDK 1.6
     */
    public Long getTargetUserId() {
        return targetUserId;
    }

    /**
     * targetUserId.
     *
     * @param targetUserId the targetUserId to set
     * @since JDK 1.6
     */
    public void setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
    }

    /**
     * typeId.
     *
     * @return the typeId
     * @since JDK 1.6
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * typeId.
     *
     * @param typeId the typeId to set
     * @since JDK 1.6
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * param1.
     *
     * @return the param1
     * @since JDK 1.6
     */
    public String getParam1() {
        return param1;
    }

    /**
     * param1.
     *
     * @param param1 the param1 to set
     * @since JDK 1.6
     */
    public void setParam1(String param1) {
        this.param1 = param1;
    }

    /**
     * param2.
     *
     * @return the param2
     * @since JDK 1.6
     */
    public String getParam2() {
        return param2;
    }

    /**
     * param2.
     *
     * @param param2 the param2 to set
     * @since JDK 1.6
     */
    public void setParam2(String param2) {
        this.param2 = param2;
    }

    /**
     * param3.
     *
     * @return the param3
     * @since JDK 1.6
     */
    public String getParam3() {
        return param3;
    }

    /**
     * param3.
     *
     * @param param3 the param3 to set
     * @since JDK 1.6
     */
    public void setParam3(String param3) {
        this.param3 = param3;
    }

    /**
     * createTime.
     *
     * @return the createTime
     * @since JDK 1.6
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * createTime.
     *
     * @param createTime the createTime to set
     * @since JDK 1.6
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * isRead.
     *
     * @return the isRead
     * @since JDK 1.6
     */
    public boolean isRead() {
        return isRead;
    }

    /**
     * isRead.
     *
     * @param isRead the isRead to set
     * @since JDK 1.6
     */
    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * TODO 简单描述该方法的实现功能（可选）.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NotificationDO [id=");
        builder.append(id);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", targetUserId=");
        builder.append(targetUserId);
        builder.append(", typeId=");
        builder.append(typeId);
        builder.append(", param1=");
        builder.append(param1);
        builder.append(", param2=");
        builder.append(param2);
        builder.append(", param3=");
        builder.append(param3);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", isRead=");
        builder.append(isRead);
        builder.append("]");
        return builder.toString();
    }

}
