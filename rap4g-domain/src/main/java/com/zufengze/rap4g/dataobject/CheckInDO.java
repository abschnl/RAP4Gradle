package com.zufengze.rap4g.dataobject;

import java.util.Date;

public class CheckInDO implements java.io.Serializable {

    private static final long serialVersionUID = 6528725827993089853L;

    /** 主键ID. */
    private Long              id;

    /** 创建时间. */
    private Date              createDate;

    /** 用户ID. */
    private Long              userId;

    /** 项目ID. */
    private Long              projectId;

    /** 提交描述. */
    private String            description;

    /** 版本号. */
    private String            version;

    /** 项目JSON数据. */
    private String            projectData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getProjectData() {
        return projectData;
    }

    public void setProjectData(String projectData) {
        this.projectData = projectData;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CheckInDO [id=");
        builder.append(id);
        builder.append(", createDate=");
        builder.append(createDate);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", projectId=");
        builder.append(projectId);
        builder.append(", description=");
        builder.append(description);
        builder.append(", version=");
        builder.append(version);
        builder.append(", projectData=");
        builder.append(projectData);
        builder.append("]");
        return builder.toString();
    }

}
