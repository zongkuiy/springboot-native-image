package com.nativeapp.demo.dao;

import java.io.Serializable;

public class GenTableField implements Serializable {
    private Long id;

    private Long tableId;

    private String fieldName;

    private String fieldType;

    private String fieldComment;

    private String attrName;

    private String attrType;

    private String packageName;

    private Integer sort;

    private String autoFill;

    private Byte primaryPk;

    private Byte baseField;

    private Byte formItem;

    private Byte formRequired;

    private String formType;

    private String formDict;

    private String formValidator;

    private Byte gridItem;

    private Byte gridSort;

    private Byte queryItem;

    private String queryType;

    private String queryFormType;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getAutoFill() {
        return autoFill;
    }

    public void setAutoFill(String autoFill) {
        this.autoFill = autoFill;
    }

    public Byte getPrimaryPk() {
        return primaryPk;
    }

    public void setPrimaryPk(Byte primaryPk) {
        this.primaryPk = primaryPk;
    }

    public Byte getBaseField() {
        return baseField;
    }

    public void setBaseField(Byte baseField) {
        this.baseField = baseField;
    }

    public Byte getFormItem() {
        return formItem;
    }

    public void setFormItem(Byte formItem) {
        this.formItem = formItem;
    }

    public Byte getFormRequired() {
        return formRequired;
    }

    public void setFormRequired(Byte formRequired) {
        this.formRequired = formRequired;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getFormDict() {
        return formDict;
    }

    public void setFormDict(String formDict) {
        this.formDict = formDict;
    }

    public String getFormValidator() {
        return formValidator;
    }

    public void setFormValidator(String formValidator) {
        this.formValidator = formValidator;
    }

    public Byte getGridItem() {
        return gridItem;
    }

    public void setGridItem(Byte gridItem) {
        this.gridItem = gridItem;
    }

    public Byte getGridSort() {
        return gridSort;
    }

    public void setGridSort(Byte gridSort) {
        this.gridSort = gridSort;
    }

    public Byte getQueryItem() {
        return queryItem;
    }

    public void setQueryItem(Byte queryItem) {
        this.queryItem = queryItem;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryFormType() {
        return queryFormType;
    }

    public void setQueryFormType(String queryFormType) {
        this.queryFormType = queryFormType;
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
        GenTableField other = (GenTableField) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTableId() == null ? other.getTableId() == null : this.getTableId().equals(other.getTableId()))
            && (this.getFieldName() == null ? other.getFieldName() == null : this.getFieldName().equals(other.getFieldName()))
            && (this.getFieldType() == null ? other.getFieldType() == null : this.getFieldType().equals(other.getFieldType()))
            && (this.getFieldComment() == null ? other.getFieldComment() == null : this.getFieldComment().equals(other.getFieldComment()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getAttrType() == null ? other.getAttrType() == null : this.getAttrType().equals(other.getAttrType()))
            && (this.getPackageName() == null ? other.getPackageName() == null : this.getPackageName().equals(other.getPackageName()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getAutoFill() == null ? other.getAutoFill() == null : this.getAutoFill().equals(other.getAutoFill()))
            && (this.getPrimaryPk() == null ? other.getPrimaryPk() == null : this.getPrimaryPk().equals(other.getPrimaryPk()))
            && (this.getBaseField() == null ? other.getBaseField() == null : this.getBaseField().equals(other.getBaseField()))
            && (this.getFormItem() == null ? other.getFormItem() == null : this.getFormItem().equals(other.getFormItem()))
            && (this.getFormRequired() == null ? other.getFormRequired() == null : this.getFormRequired().equals(other.getFormRequired()))
            && (this.getFormType() == null ? other.getFormType() == null : this.getFormType().equals(other.getFormType()))
            && (this.getFormDict() == null ? other.getFormDict() == null : this.getFormDict().equals(other.getFormDict()))
            && (this.getFormValidator() == null ? other.getFormValidator() == null : this.getFormValidator().equals(other.getFormValidator()))
            && (this.getGridItem() == null ? other.getGridItem() == null : this.getGridItem().equals(other.getGridItem()))
            && (this.getGridSort() == null ? other.getGridSort() == null : this.getGridSort().equals(other.getGridSort()))
            && (this.getQueryItem() == null ? other.getQueryItem() == null : this.getQueryItem().equals(other.getQueryItem()))
            && (this.getQueryType() == null ? other.getQueryType() == null : this.getQueryType().equals(other.getQueryType()))
            && (this.getQueryFormType() == null ? other.getQueryFormType() == null : this.getQueryFormType().equals(other.getQueryFormType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTableId() == null) ? 0 : getTableId().hashCode());
        result = prime * result + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        result = prime * result + ((getFieldType() == null) ? 0 : getFieldType().hashCode());
        result = prime * result + ((getFieldComment() == null) ? 0 : getFieldComment().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getAttrType() == null) ? 0 : getAttrType().hashCode());
        result = prime * result + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getAutoFill() == null) ? 0 : getAutoFill().hashCode());
        result = prime * result + ((getPrimaryPk() == null) ? 0 : getPrimaryPk().hashCode());
        result = prime * result + ((getBaseField() == null) ? 0 : getBaseField().hashCode());
        result = prime * result + ((getFormItem() == null) ? 0 : getFormItem().hashCode());
        result = prime * result + ((getFormRequired() == null) ? 0 : getFormRequired().hashCode());
        result = prime * result + ((getFormType() == null) ? 0 : getFormType().hashCode());
        result = prime * result + ((getFormDict() == null) ? 0 : getFormDict().hashCode());
        result = prime * result + ((getFormValidator() == null) ? 0 : getFormValidator().hashCode());
        result = prime * result + ((getGridItem() == null) ? 0 : getGridItem().hashCode());
        result = prime * result + ((getGridSort() == null) ? 0 : getGridSort().hashCode());
        result = prime * result + ((getQueryItem() == null) ? 0 : getQueryItem().hashCode());
        result = prime * result + ((getQueryType() == null) ? 0 : getQueryType().hashCode());
        result = prime * result + ((getQueryFormType() == null) ? 0 : getQueryFormType().hashCode());
        return result;
    }
}