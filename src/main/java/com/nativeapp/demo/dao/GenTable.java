package com.nativeapp.demo.dao;

import java.io.Serializable;
import java.util.Date;

public class GenTable implements Serializable {
    private Long id;

    private String tableName;

    private String className;

    private String tableComment;

    private String author;

    private String email;

    private String packageName;

    private String version;

    private Byte generatorType;

    private String backendPath;

    private String frontendPath;

    private String moduleName;

    private String functionName;

    private Byte formLayout;

    private Long datasourceId;

    private Long baseclassId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Byte getGeneratorType() {
        return generatorType;
    }

    public void setGeneratorType(Byte generatorType) {
        this.generatorType = generatorType;
    }

    public String getBackendPath() {
        return backendPath;
    }

    public void setBackendPath(String backendPath) {
        this.backendPath = backendPath;
    }

    public String getFrontendPath() {
        return frontendPath;
    }

    public void setFrontendPath(String frontendPath) {
        this.frontendPath = frontendPath;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Byte getFormLayout() {
        return formLayout;
    }

    public void setFormLayout(Byte formLayout) {
        this.formLayout = formLayout;
    }

    public Long getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
    }

    public Long getBaseclassId() {
        return baseclassId;
    }

    public void setBaseclassId(Long baseclassId) {
        this.baseclassId = baseclassId;
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
        GenTable other = (GenTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getTableComment() == null ? other.getTableComment() == null : this.getTableComment().equals(other.getTableComment()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPackageName() == null ? other.getPackageName() == null : this.getPackageName().equals(other.getPackageName()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getGeneratorType() == null ? other.getGeneratorType() == null : this.getGeneratorType().equals(other.getGeneratorType()))
            && (this.getBackendPath() == null ? other.getBackendPath() == null : this.getBackendPath().equals(other.getBackendPath()))
            && (this.getFrontendPath() == null ? other.getFrontendPath() == null : this.getFrontendPath().equals(other.getFrontendPath()))
            && (this.getModuleName() == null ? other.getModuleName() == null : this.getModuleName().equals(other.getModuleName()))
            && (this.getFunctionName() == null ? other.getFunctionName() == null : this.getFunctionName().equals(other.getFunctionName()))
            && (this.getFormLayout() == null ? other.getFormLayout() == null : this.getFormLayout().equals(other.getFormLayout()))
            && (this.getDatasourceId() == null ? other.getDatasourceId() == null : this.getDatasourceId().equals(other.getDatasourceId()))
            && (this.getBaseclassId() == null ? other.getBaseclassId() == null : this.getBaseclassId().equals(other.getBaseclassId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getTableComment() == null) ? 0 : getTableComment().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getGeneratorType() == null) ? 0 : getGeneratorType().hashCode());
        result = prime * result + ((getBackendPath() == null) ? 0 : getBackendPath().hashCode());
        result = prime * result + ((getFrontendPath() == null) ? 0 : getFrontendPath().hashCode());
        result = prime * result + ((getModuleName() == null) ? 0 : getModuleName().hashCode());
        result = prime * result + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        result = prime * result + ((getFormLayout() == null) ? 0 : getFormLayout().hashCode());
        result = prime * result + ((getDatasourceId() == null) ? 0 : getDatasourceId().hashCode());
        result = prime * result + ((getBaseclassId() == null) ? 0 : getBaseclassId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}