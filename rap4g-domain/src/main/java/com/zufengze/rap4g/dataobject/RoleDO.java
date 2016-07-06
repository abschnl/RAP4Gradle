package com.zufengze.rap4g.dataobject;

public class RoleDO implements java.io.Serializable {

    private static final long serialVersionUID = -9031054356616620288L;

    /** 超级管理员. */
    public static final Long  SUPER_ADMIN      = 1L;
    
    /** 管理员. */
    public static final Long  ADMIN            = 2L;
    
    /** 普通用户. */
    public static final Long  USER             = 3L;

    /** 主键ID. */
    private Long              id;

    /** 角色名称. */
    private String            roleName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RoleDO [id=");
        builder.append(id);
        builder.append(", roleName=");
        builder.append(roleName);
        builder.append("]");
        return builder.toString();
    }

}
