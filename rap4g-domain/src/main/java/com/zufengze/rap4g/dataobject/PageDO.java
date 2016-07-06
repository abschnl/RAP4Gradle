/**
 * Project Name:rap4g-domain File Name:PageDO.java Package Name:com.zufengze.rap4g.dataobject Date:2016年7月6日下午4:01:25
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class PageDO implements Serializable {

    private static final long serialVersionUID = -858914150859939608L;

    /** 主键ID. */
    private Long              id;

    /** 名称. */
    private String            name;

    /** 模块ID. */
    private Long              moduleId;

    /** 介绍. */
    private String            introduction;

    /** 模板. */
    private String            template;

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
     * moduleId.
     *
     * @return the moduleId
     * @since JDK 1.6
     */
    public Long getModuleId() {
        return moduleId;
    }

    /**
     * moduleId.
     *
     * @param moduleId the moduleId to set
     * @since JDK 1.6
     */
    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * introduction.
     *
     * @return the introduction
     * @since JDK 1.6
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * introduction.
     *
     * @param introduction the introduction to set
     * @since JDK 1.6
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * template.
     *
     * @return the template
     * @since JDK 1.6
     */
    public String getTemplate() {
        return template;
    }

    /**
     * template.
     *
     * @param template the template to set
     * @since JDK 1.6
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PageDO [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", moduleId=");
        builder.append(moduleId);
        builder.append(", introduction=");
        builder.append(introduction);
        builder.append(", template=");
        builder.append(template);
        builder.append("]");
        return builder.toString();
    }

}
