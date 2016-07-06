package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

/**
 * 请求说明表
 */
public class ActionDO implements Serializable {

    private static final long serialVersionUID = 4776267777311442772L;

    /** get请求类型. */
    final static int          REQUEST_GET      = 1;
    /** post请求类型. */
    final static int          REQUEST_POST     = 2;
    /** put请求类型. */
    final static int          REQUEST_PUT      = 3;
    /** delete请求类型. */
    final static int          REQUEST_DELETE   = 4;

    /** 主键ID. */
    private Long              id;

    /** 名称. */
    private String            name;

    /** 描述. */
    private String            description;

    /** 请求类型 1-get/2-post/3-put/4-delete. */
    private Integer           requestType;

    /** 请求地址. */
    private String            requestUrl;

    /** 禁用Mock缓存. */
    private Integer           disableCache;

    /** 响应模板地址, 暂时弃用. */
    private String            responseTemplate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public Integer getDisableCache() {
        return disableCache;
    }

    public void setDisableCache(Integer disableCache) {
        this.disableCache = disableCache;
    }

    public String getResponseTemplate() {
        return responseTemplate;
    }

    public void setResponseTemplate(String responseTemplate) {
        this.responseTemplate = responseTemplate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Action [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", description=");
        builder.append(description);
        builder.append(", requestType=");
        builder.append(requestType);
        builder.append(", requestUrl=");
        builder.append(requestUrl);
        builder.append(", disableCache=");
        builder.append(disableCache);
        builder.append(", responseTemplate=");
        builder.append(responseTemplate);
        builder.append("]");
        return builder.toString();
    }

}
