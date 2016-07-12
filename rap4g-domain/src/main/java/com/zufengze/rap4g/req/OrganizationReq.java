/**
 * Project Name:rap4g-domain File Name:OrganizationReq.java Package Name:com.zufengze.rap4g.req Date:2016年7月12日下午2:49:10
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.req;


/**
 * ClassName:OrganizationReq <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年7月12日 下午2:49:10 <br/>
 * 
 * @author ZFZ
 * @version
 * @since JDK 1.6
 * @see
 */
public class OrganizationReq extends BaseQueryReq {

    /** 用户ID */
    private Long uid;

    /**
     * uid.
     *
     * @return the uid
     * @since JDK 1.6
     */
    public Long getUid() {
        return uid;
    }

    /**
     * uid.
     *
     * @param uid the uid to set
     * @since JDK 1.6
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OrganizationReq [uid=");
        builder.append(uid);
        builder.append(", getRowStart()=");
        builder.append(getRowStart());
        builder.append(", getCurrentPage()=");
        builder.append(getCurrentPage());
        builder.append(", getPageSize()=");
        builder.append(getPageSize());
        builder.append(", getSort()=");
        builder.append(getSort());
        builder.append(", getOrder()=");
        builder.append(getOrder());
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append(", getClass()=");
        builder.append(getClass());
        builder.append(", hashCode()=");
        builder.append(hashCode());
        builder.append("]");
        return builder.toString();
    }

}
