package com.zufengze.rap4g.dataobject;

import java.util.Date;

/**
 * 用户表
 */
public class UserDO implements java.io.Serializable {

    private static final long serialVersionUID = -7239752838952702038L;

    /** 主键ID. */
    private Long              id;

    /** 账户. */
    private String            account;

    /** 密码. */
    private String            password;

    /** 邮箱. */
    private String            email;

    /** 创建时间. */
    private Date              createDate;

    /** 真实名字. */
    private String            realname;

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
     * account.
     *
     * @return the account
     * @since JDK 1.6
     */
    public String getAccount() {
        return account;
    }

    /**
     * account.
     *
     * @param account the account to set
     * @since JDK 1.6
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * password.
     *
     * @return the password
     * @since JDK 1.6
     */
    public String getPassword() {
        return password;
    }

    /**
     * password.
     *
     * @param password the password to set
     * @since JDK 1.6
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * email.
     *
     * @return the email
     * @since JDK 1.6
     */
    public String getEmail() {
        return email;
    }

    /**
     * email.
     *
     * @param email the email to set
     * @since JDK 1.6
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * createDate.
     *
     * @return the createDate
     * @since JDK 1.6
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * createDate.
     *
     * @param createDate the createDate to set
     * @since JDK 1.6
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * realname.
     *
     * @return the realname
     * @since JDK 1.6
     */
    public String getRealname() {
        return realname;
    }

    /**
     * realname.
     *
     * @param realname the realname to set
     * @since JDK 1.6
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserDO [id=");
        builder.append(id);
        builder.append(", account=");
        builder.append(account);
        builder.append(", password=");
        builder.append(password);
        builder.append(", email=");
        builder.append(email);
        builder.append(", createDate=");
        builder.append(createDate);
        builder.append(", realname=");
        builder.append(realname);
        builder.append("]");
        return builder.toString();
    }

}
