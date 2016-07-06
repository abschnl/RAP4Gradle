/**
 * Project Name:rap4g-domain File Name:ParameterDO.java Package Name:com.zufengze.rap4g.dataobject
 * Date:2016年7月6日下午4:04:44 Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 */

package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class ParameterDO implements Serializable {

    private static final long serialVersionUID = -837725760037685542L;

    /** 主键ID. */
    private Long              id;

    /** 参数含义. */
    private String            name;

    /** 变量名/参数标识符. */
    private String            identifier;

    /** 数据类型. */
    private String            dataType;

    /** 备注/mock数据等. */
    private String            remark;

    /** 备用字段：表达式. */
    private String            expression;

    /** 备用字段:mock数据. */
    private String            mockData;

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
     * identifier.
     *
     * @return the identifier
     * @since JDK 1.6
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * identifier.
     *
     * @param identifier the identifier to set
     * @since JDK 1.6
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * dataType.
     *
     * @return the dataType
     * @since JDK 1.6
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * dataType.
     *
     * @param dataType the dataType to set
     * @since JDK 1.6
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * remark.
     *
     * @return the remark
     * @since JDK 1.6
     */
    public String getRemark() {
        return remark;
    }

    /**
     * remark.
     *
     * @param remark the remark to set
     * @since JDK 1.6
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * expression.
     *
     * @return the expression
     * @since JDK 1.6
     */
    public String getExpression() {
        return expression;
    }

    /**
     * expression.
     *
     * @param expression the expression to set
     * @since JDK 1.6
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * mockData.
     *
     * @return the mockData
     * @since JDK 1.6
     */
    public String getMockData() {
        return mockData;
    }

    /**
     * mockData.
     *
     * @param mockData the mockData to set
     * @since JDK 1.6
     */
    public void setMockData(String mockData) {
        this.mockData = mockData;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ParameterDO [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", identifier=");
        builder.append(identifier);
        builder.append(", dataType=");
        builder.append(dataType);
        builder.append(", remark=");
        builder.append(remark);
        builder.append(", expression=");
        builder.append(expression);
        builder.append(", mockData=");
        builder.append(mockData);
        builder.append("]");
        return builder.toString();
    }

}
