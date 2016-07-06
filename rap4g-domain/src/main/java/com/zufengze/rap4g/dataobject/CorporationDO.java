package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class CorporationDO implements Serializable {

    private static final long serialVersionUID = 6380758834598204461L;

    /** 公开权限. */
    public static final int   PUBLIC_ACCESS    = 20;

    /** 普通权限. */
    public static final int   PRIVATE_ACCESS   = 10;

    /** 主键ID. */
    private Long              id;

    /** 名称. */
    private String            name;

    /** logo图片地址. */
    private String            logoUrl;

    /** 用户ID. */
    private Long              userId;

    /** 权限控制, 10普通, 20公开. */
    private Integer           accessType;

    /** 备注. */
    private String            desc;

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
     * logoUrl.
     *
     * @return the logoUrl
     * @since JDK 1.6
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * logoUrl.
     *
     * @param logoUrl the logoUrl to set
     * @since JDK 1.6
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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
     * desc.
     *
     * @return the desc
     * @since JDK 1.6
     */
    public String getDesc() {
        return desc;
    }

    /**
     * desc.
     *
     * @param desc the desc to set
     * @since JDK 1.6
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CorporationDO [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", logoUrl=");
        builder.append(logoUrl);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", accessType=");
        builder.append(accessType);
        builder.append(", desc=");
        builder.append(desc);
        builder.append("]");
        return builder.toString();
    }

}
