/**
 * 文件名： ErrorCode.java 此类描述的是： 作者: zufengze 创建时间: 2016年3月23日 上午10:15:33
 */
package com.zufengze.rap4g.constants;

/**
 * 此类描述的是： 项目错误码<br>
 * 错误码组成：AABCCCC
 * <ul>
 * AA：模块编号
 * <li>01：模块共用</li>
 * <li>02：用户模块</li>
 * <li>03：项目模块</li>
 * </ul>
 * <ul>
 * B：内外部错误码标志
 * <li>0：内部错误码</li>
 * <li>1：外部错误码</li>
 * </ul>
 * <ul>
 * <ul>
 * CCCC:具体错误码 举例
 * <li>通用的成功状态码：0000000</li>
 * <li>通用的未知错误码：9999999</li>
 * </ul>
 * .
 *
 * @author: zufengze
 * @version: 2016年2月18日 下午3:36:01
 */
public enum ErrorCode {

    /** 成功. */
    E0000000("0", "成功"),

    /** 数据库异常. */
    E0000001("0000001", "数据库异常"),

    /** MD5解密失败. */
    E0000003("0100003", "MD5解密失败"),

    /** 数据库异常. */
    E0100001("0100001", "数据库异常"),

    /** 参数错误. */
    E0100002("0100002", "参数错误"),

    /** 发生系统错误. */
    E9999999("9999999", "发生系统错误"),

    /** 账号不存在. */
    E0200001("0200001", "账号不存在"),

    /** 账号/密码错误. */
    E0200002("0200002", "账号/密码错误"),

    ;

    /** 错误码. */
    private String errorCode;

    /** 中文描述. */
    private String desc;

    /**
     * The Constructor.
     *
     * @param errorCode the error code
     * @param desc the desc
     */
    private ErrorCode(String errorCode, String desc) {
        this.errorCode = errorCode;
        this.desc = desc;
    }

    /**
     * The Constructor.
     *
     * @param errorCode the error code
     */
    private ErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
