package com.zufengze.rap4g.dataobject;

import java.io.Serializable;

public class ActionAndPageDO implements Serializable {

    private static final long serialVersionUID = -1032693387809788289L;

    /** 主键ID. */
    private Long              id;

    /** 请求ID. */
    private Long              actionId;

    /** 页面ID. */
    private Long              pageId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public Long getPageId() {
        return pageId;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ActionAndPageDO [id=");
        builder.append(id);
        builder.append(", actionId=");
        builder.append(actionId);
        builder.append(", pageId=");
        builder.append(pageId);
        builder.append("]");
        return builder.toString();
    }

}
