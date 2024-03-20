package com.nativeapp.demo.dao;

import java.io.Serializable;
import java.util.Date;

public class GenProjectModify implements Serializable {
    private Long id;

    private String projectName;

    private String projectCode;

    private String projectPackage;

    private String projectPath;

    private String modifyProjectName;

    private String modifyProjectCode;

    private String modifyProjectPackage;

    private String exclusions;

    private String modifySuffix;

    private String modifyTmpPath;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectPackage() {
        return projectPackage;
    }

    public void setProjectPackage(String projectPackage) {
        this.projectPackage = projectPackage;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getModifyProjectName() {
        return modifyProjectName;
    }

    public void setModifyProjectName(String modifyProjectName) {
        this.modifyProjectName = modifyProjectName;
    }

    public String getModifyProjectCode() {
        return modifyProjectCode;
    }

    public void setModifyProjectCode(String modifyProjectCode) {
        this.modifyProjectCode = modifyProjectCode;
    }

    public String getModifyProjectPackage() {
        return modifyProjectPackage;
    }

    public void setModifyProjectPackage(String modifyProjectPackage) {
        this.modifyProjectPackage = modifyProjectPackage;
    }

    public String getExclusions() {
        return exclusions;
    }

    public void setExclusions(String exclusions) {
        this.exclusions = exclusions;
    }

    public String getModifySuffix() {
        return modifySuffix;
    }

    public void setModifySuffix(String modifySuffix) {
        this.modifySuffix = modifySuffix;
    }

    public String getModifyTmpPath() {
        return modifyTmpPath;
    }

    public void setModifyTmpPath(String modifyTmpPath) {
        this.modifyTmpPath = modifyTmpPath;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GenProjectModify other = (GenProjectModify) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getProjectCode() == null ? other.getProjectCode() == null : this.getProjectCode().equals(other.getProjectCode()))
            && (this.getProjectPackage() == null ? other.getProjectPackage() == null : this.getProjectPackage().equals(other.getProjectPackage()))
            && (this.getProjectPath() == null ? other.getProjectPath() == null : this.getProjectPath().equals(other.getProjectPath()))
            && (this.getModifyProjectName() == null ? other.getModifyProjectName() == null : this.getModifyProjectName().equals(other.getModifyProjectName()))
            && (this.getModifyProjectCode() == null ? other.getModifyProjectCode() == null : this.getModifyProjectCode().equals(other.getModifyProjectCode()))
            && (this.getModifyProjectPackage() == null ? other.getModifyProjectPackage() == null : this.getModifyProjectPackage().equals(other.getModifyProjectPackage()))
            && (this.getExclusions() == null ? other.getExclusions() == null : this.getExclusions().equals(other.getExclusions()))
            && (this.getModifySuffix() == null ? other.getModifySuffix() == null : this.getModifySuffix().equals(other.getModifySuffix()))
            && (this.getModifyTmpPath() == null ? other.getModifyTmpPath() == null : this.getModifyTmpPath().equals(other.getModifyTmpPath()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getProjectCode() == null) ? 0 : getProjectCode().hashCode());
        result = prime * result + ((getProjectPackage() == null) ? 0 : getProjectPackage().hashCode());
        result = prime * result + ((getProjectPath() == null) ? 0 : getProjectPath().hashCode());
        result = prime * result + ((getModifyProjectName() == null) ? 0 : getModifyProjectName().hashCode());
        result = prime * result + ((getModifyProjectCode() == null) ? 0 : getModifyProjectCode().hashCode());
        result = prime * result + ((getModifyProjectPackage() == null) ? 0 : getModifyProjectPackage().hashCode());
        result = prime * result + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        result = prime * result + ((getModifySuffix() == null) ? 0 : getModifySuffix().hashCode());
        result = prime * result + ((getModifyTmpPath() == null) ? 0 : getModifyTmpPath().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}