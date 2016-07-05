package com.zufengze.rap4g.dataobject;

import java.util.Date;

/**
 * 用户表
 */
public class UserDO implements java.io.Serializable {

	private static final long serialVersionUID = -7239752838952702038L;

	/** 账户锁定. */
	final static boolean LOCK_SIGN_LOCKED = true;

	/** 账户未锁定. */
	final static boolean LOCK_SIGN_UNLOCK = false;

	/** 开启新手引导. */
	final static boolean HINT_SIGN_ENABLE = true;

	/** 关闭新手引导. */
	final static boolean HINT_SIGN_UNABLE = false;

	/** 主键ID. */
	private Long id;

	/** 账户. */
	private String account;

	/** 密码. */
	private String password;

	/** 名字/昵称. */
	private String name;

	/** 邮箱. */
	private String email;

	/** 创建时间. */
	private Date createDate;

	/** 用户是否锁定 false-未锁定 true-被锁定. */
	private boolean isLockedOut;

	/** 是否开启新手引导. */
	private boolean isHintEnabled;

	/** 最近登录时间. */
	private Date lastLoginDate;

	/** 错误登录次数，登录成功后会重置为0. */
	private int incorrectLoginAttempt;

	/** 真实名字. */
	private String realname;

	/** 工号. */
	private String empId;

	/** mock次数，用于记录该用户所创建的接口被调用的mock次数. */
	private int mockNum;

	/** 角色ID. */
	private Long roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isLockedOut() {
		return isLockedOut;
	}

	public void setLockedOut(boolean isLockedOut) {
		this.isLockedOut = isLockedOut;
	}

	public boolean isHintEnabled() {
		return isHintEnabled;
	}

	public void setHintEnabled(boolean isHintEnabled) {
		this.isHintEnabled = isHintEnabled;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public int getIncorrectLoginAttempt() {
		return incorrectLoginAttempt;
	}

	public void setIncorrectLoginAttempt(int incorrectLoginAttempt) {
		this.incorrectLoginAttempt = incorrectLoginAttempt;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getMockNum() {
		return mockNum;
	}

	public void setMockNum(int mockNum) {
		this.mockNum = mockNum;
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
		builder.append("UserDO [id=");
		builder.append(id);
		builder.append(", account=");
		builder.append(account);
		builder.append(", password=");
		builder.append(password);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", isLockedOut=");
		builder.append(isLockedOut);
		builder.append(", isHintEnabled=");
		builder.append(isHintEnabled);
		builder.append(", lastLoginDate=");
		builder.append(lastLoginDate);
		builder.append(", incorrectLoginAttempt=");
		builder.append(incorrectLoginAttempt);
		builder.append(", realname=");
		builder.append(realname);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", mockNum=");
		builder.append(mockNum);
		builder.append(", roleId=");
		builder.append(roleId);
		builder.append("]");
		return builder.toString();
	}
}
