/**
 * Project Name:rap4g-domain File Name:registerReq.java Package Name:com.zufengze.rap4g.req Date:2016年7月12日下午2:49:10
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.req;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName:registerReq <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年7月12日 下午2:49:10 <br/>
 * 
 * @author ZFZ
 * @version
 * @since JDK 1.6
 * @see
 */
public class RegisterReq {

    /** 中文名 */
    private String realname;
    
    /** 邮箱 */
    @NotBlank(message="邮箱不可为空")
    @Pattern(regexp = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$", message="邮箱名称错误")
    private String email;
    
    /** 登录账号 */
    @NotBlank(message="账号不可为空")
    private String account;
    
    /** 密码 */
    @NotBlank(message="密码不可为空")
    private String password;
    
    /** 密码确认 */
    @NotBlank(message="密码不可为空")
    private String confirmPassword;

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
     * confirmPassword.
     *
     * @return the confirmPassword
     * @since JDK 1.6
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * confirmPassword.
     *
     * @param confirmPassword the confirmPassword to set
     * @since JDK 1.6
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RegisterReq [realname=");
        builder.append(realname);
        builder.append(", email=");
        builder.append(email);
        builder.append(", account=");
        builder.append(account);
        builder.append(", password=");
        builder.append(password);
        builder.append(", confirmPassword=");
        builder.append(confirmPassword);
        builder.append("]");
        return builder.toString();
    }

}
