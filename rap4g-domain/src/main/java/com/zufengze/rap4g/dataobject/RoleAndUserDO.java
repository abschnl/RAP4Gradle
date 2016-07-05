package com.zufengze.rap4g.dataobject;

public class RoleAndUserDO implements java.io.Serializable {

	private static final long serialVersionUID = 3428975402547803539L;

	/** 主键ID. */
	private Long id;

	/** 用户ID. */
	private Long userId;

	/** 角色ID. */
	private Long roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoleAndUserDO [id=");
		builder.append(id);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", roleId=");
		builder.append(roleId);
		builder.append("]");
		return builder.toString();
	}

}
