package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class CorporationAndUserDO implements Serializable {

    private static final long serialVersionUID = -719395778391270885L;

    /** 主键ID. */
    private Long              id;

    /** 用户ID. */
    private Long              userId;

    /** 公司ID. */
    private Long              corporationId;

    /** 角色ID. */
    private Long              roleId;

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
     * roleId.
     *
     * @return the roleId
     * @since JDK 1.6
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * roleId.
     *
     * @param roleId the roleId to set
     * @since JDK 1.6
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CorporationAndUserDO [id=");
        builder.append(id);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", corporationId=");
        builder.append(corporationId);
        builder.append(", roleId=");
        builder.append(roleId);
        builder.append("]");
        return builder.toString();
    }

}
