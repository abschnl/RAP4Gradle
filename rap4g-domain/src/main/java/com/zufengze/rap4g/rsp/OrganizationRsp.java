/**
 * Project Name:rap4g-domain File Name:OrganizationRsp.java Package Name:com.zufengze.rap4g.rsp Date:2016年7月12日下午5:57:46
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.rsp;

/**
 * ClassName:OrganizationRsp <br/>
 * Date: 2016年7月12日 下午5:57:46 <br/>
 * 
 * @author ZFZ
 * @version
 * @since JDK 1.6
 * @see
 */
public class OrganizationRsp {

    /** 项目ID */
    private Long   id;

    /** 项目名称 */
    private String name;

    /** 项目更新时间 */
    private String updateTime;

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
     * updateTime.
     *
     * @return the updateTime
     * @since JDK 1.6
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * updateTime.
     *
     * @param updateTime the updateTime to set
     * @since JDK 1.6
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OrganizationRsp [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", updateTime=");
        builder.append(updateTime);
        builder.append("]");
        return builder.toString();
    }

}
