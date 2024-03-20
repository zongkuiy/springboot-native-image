package com.nativeapp.demo.dao;

import java.util.ArrayList;
import java.util.List;

public class GenTableFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenTableFieldExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Long value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Long value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Long value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Long value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Long value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Long> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Long> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Long value1, Long value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Long value1, Long value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("field_name is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("field_name is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("field_name =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("field_name <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("field_name >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_name >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("field_name <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("field_name <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("field_name like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("field_name not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("field_name in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("field_name not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("field_name between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("field_name not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIsNull() {
            addCriterion("field_type is null");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIsNotNull() {
            addCriterion("field_type is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTypeEqualTo(String value) {
            addCriterion("field_type =", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotEqualTo(String value) {
            addCriterion("field_type <>", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeGreaterThan(String value) {
            addCriterion("field_type >", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeGreaterThanOrEqualTo(String value) {
            addCriterion("field_type >=", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLessThan(String value) {
            addCriterion("field_type <", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLessThanOrEqualTo(String value) {
            addCriterion("field_type <=", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLike(String value) {
            addCriterion("field_type like", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotLike(String value) {
            addCriterion("field_type not like", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIn(List<String> values) {
            addCriterion("field_type in", values, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotIn(List<String> values) {
            addCriterion("field_type not in", values, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeBetween(String value1, String value2) {
            addCriterion("field_type between", value1, value2, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotBetween(String value1, String value2) {
            addCriterion("field_type not between", value1, value2, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldCommentIsNull() {
            addCriterion("field_comment is null");
            return (Criteria) this;
        }

        public Criteria andFieldCommentIsNotNull() {
            addCriterion("field_comment is not null");
            return (Criteria) this;
        }

        public Criteria andFieldCommentEqualTo(String value) {
            addCriterion("field_comment =", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotEqualTo(String value) {
            addCriterion("field_comment <>", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentGreaterThan(String value) {
            addCriterion("field_comment >", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentGreaterThanOrEqualTo(String value) {
            addCriterion("field_comment >=", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentLessThan(String value) {
            addCriterion("field_comment <", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentLessThanOrEqualTo(String value) {
            addCriterion("field_comment <=", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentLike(String value) {
            addCriterion("field_comment like", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotLike(String value) {
            addCriterion("field_comment not like", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentIn(List<String> values) {
            addCriterion("field_comment in", values, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotIn(List<String> values) {
            addCriterion("field_comment not in", values, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentBetween(String value1, String value2) {
            addCriterion("field_comment between", value1, value2, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotBetween(String value1, String value2) {
            addCriterion("field_comment not between", value1, value2, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("attr_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("attr_name =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("attr_name <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("attr_name >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_name >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("attr_name <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("attr_name <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("attr_name like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("attr_name not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("attr_name in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("attr_name not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("attr_name between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("attr_name not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNull() {
            addCriterion("attr_type is null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNotNull() {
            addCriterion("attr_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeEqualTo(String value) {
            addCriterion("attr_type =", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotEqualTo(String value) {
            addCriterion("attr_type <>", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThan(String value) {
            addCriterion("attr_type >", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("attr_type >=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThan(String value) {
            addCriterion("attr_type <", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThanOrEqualTo(String value) {
            addCriterion("attr_type <=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLike(String value) {
            addCriterion("attr_type like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotLike(String value) {
            addCriterion("attr_type not like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIn(List<String> values) {
            addCriterion("attr_type in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotIn(List<String> values) {
            addCriterion("attr_type not in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeBetween(String value1, String value2) {
            addCriterion("attr_type between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotBetween(String value1, String value2) {
            addCriterion("attr_type not between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andAutoFillIsNull() {
            addCriterion("auto_fill is null");
            return (Criteria) this;
        }

        public Criteria andAutoFillIsNotNull() {
            addCriterion("auto_fill is not null");
            return (Criteria) this;
        }

        public Criteria andAutoFillEqualTo(String value) {
            addCriterion("auto_fill =", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillNotEqualTo(String value) {
            addCriterion("auto_fill <>", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillGreaterThan(String value) {
            addCriterion("auto_fill >", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillGreaterThanOrEqualTo(String value) {
            addCriterion("auto_fill >=", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillLessThan(String value) {
            addCriterion("auto_fill <", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillLessThanOrEqualTo(String value) {
            addCriterion("auto_fill <=", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillLike(String value) {
            addCriterion("auto_fill like", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillNotLike(String value) {
            addCriterion("auto_fill not like", value, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillIn(List<String> values) {
            addCriterion("auto_fill in", values, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillNotIn(List<String> values) {
            addCriterion("auto_fill not in", values, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillBetween(String value1, String value2) {
            addCriterion("auto_fill between", value1, value2, "autoFill");
            return (Criteria) this;
        }

        public Criteria andAutoFillNotBetween(String value1, String value2) {
            addCriterion("auto_fill not between", value1, value2, "autoFill");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkIsNull() {
            addCriterion("primary_pk is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkIsNotNull() {
            addCriterion("primary_pk is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkEqualTo(Byte value) {
            addCriterion("primary_pk =", value, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkNotEqualTo(Byte value) {
            addCriterion("primary_pk <>", value, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkGreaterThan(Byte value) {
            addCriterion("primary_pk >", value, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkGreaterThanOrEqualTo(Byte value) {
            addCriterion("primary_pk >=", value, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkLessThan(Byte value) {
            addCriterion("primary_pk <", value, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkLessThanOrEqualTo(Byte value) {
            addCriterion("primary_pk <=", value, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkIn(List<Byte> values) {
            addCriterion("primary_pk in", values, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkNotIn(List<Byte> values) {
            addCriterion("primary_pk not in", values, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkBetween(Byte value1, Byte value2) {
            addCriterion("primary_pk between", value1, value2, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andPrimaryPkNotBetween(Byte value1, Byte value2) {
            addCriterion("primary_pk not between", value1, value2, "primaryPk");
            return (Criteria) this;
        }

        public Criteria andBaseFieldIsNull() {
            addCriterion("base_field is null");
            return (Criteria) this;
        }

        public Criteria andBaseFieldIsNotNull() {
            addCriterion("base_field is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFieldEqualTo(Byte value) {
            addCriterion("base_field =", value, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldNotEqualTo(Byte value) {
            addCriterion("base_field <>", value, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldGreaterThan(Byte value) {
            addCriterion("base_field >", value, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldGreaterThanOrEqualTo(Byte value) {
            addCriterion("base_field >=", value, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldLessThan(Byte value) {
            addCriterion("base_field <", value, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldLessThanOrEqualTo(Byte value) {
            addCriterion("base_field <=", value, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldIn(List<Byte> values) {
            addCriterion("base_field in", values, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldNotIn(List<Byte> values) {
            addCriterion("base_field not in", values, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldBetween(Byte value1, Byte value2) {
            addCriterion("base_field between", value1, value2, "baseField");
            return (Criteria) this;
        }

        public Criteria andBaseFieldNotBetween(Byte value1, Byte value2) {
            addCriterion("base_field not between", value1, value2, "baseField");
            return (Criteria) this;
        }

        public Criteria andFormItemIsNull() {
            addCriterion("form_item is null");
            return (Criteria) this;
        }

        public Criteria andFormItemIsNotNull() {
            addCriterion("form_item is not null");
            return (Criteria) this;
        }

        public Criteria andFormItemEqualTo(Byte value) {
            addCriterion("form_item =", value, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemNotEqualTo(Byte value) {
            addCriterion("form_item <>", value, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemGreaterThan(Byte value) {
            addCriterion("form_item >", value, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemGreaterThanOrEqualTo(Byte value) {
            addCriterion("form_item >=", value, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemLessThan(Byte value) {
            addCriterion("form_item <", value, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemLessThanOrEqualTo(Byte value) {
            addCriterion("form_item <=", value, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemIn(List<Byte> values) {
            addCriterion("form_item in", values, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemNotIn(List<Byte> values) {
            addCriterion("form_item not in", values, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemBetween(Byte value1, Byte value2) {
            addCriterion("form_item between", value1, value2, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormItemNotBetween(Byte value1, Byte value2) {
            addCriterion("form_item not between", value1, value2, "formItem");
            return (Criteria) this;
        }

        public Criteria andFormRequiredIsNull() {
            addCriterion("form_required is null");
            return (Criteria) this;
        }

        public Criteria andFormRequiredIsNotNull() {
            addCriterion("form_required is not null");
            return (Criteria) this;
        }

        public Criteria andFormRequiredEqualTo(Byte value) {
            addCriterion("form_required =", value, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredNotEqualTo(Byte value) {
            addCriterion("form_required <>", value, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredGreaterThan(Byte value) {
            addCriterion("form_required >", value, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredGreaterThanOrEqualTo(Byte value) {
            addCriterion("form_required >=", value, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredLessThan(Byte value) {
            addCriterion("form_required <", value, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredLessThanOrEqualTo(Byte value) {
            addCriterion("form_required <=", value, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredIn(List<Byte> values) {
            addCriterion("form_required in", values, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredNotIn(List<Byte> values) {
            addCriterion("form_required not in", values, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredBetween(Byte value1, Byte value2) {
            addCriterion("form_required between", value1, value2, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormRequiredNotBetween(Byte value1, Byte value2) {
            addCriterion("form_required not between", value1, value2, "formRequired");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNull() {
            addCriterion("form_type is null");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNotNull() {
            addCriterion("form_type is not null");
            return (Criteria) this;
        }

        public Criteria andFormTypeEqualTo(String value) {
            addCriterion("form_type =", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotEqualTo(String value) {
            addCriterion("form_type <>", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThan(String value) {
            addCriterion("form_type >", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThanOrEqualTo(String value) {
            addCriterion("form_type >=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThan(String value) {
            addCriterion("form_type <", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThanOrEqualTo(String value) {
            addCriterion("form_type <=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLike(String value) {
            addCriterion("form_type like", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotLike(String value) {
            addCriterion("form_type not like", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeIn(List<String> values) {
            addCriterion("form_type in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotIn(List<String> values) {
            addCriterion("form_type not in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeBetween(String value1, String value2) {
            addCriterion("form_type between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotBetween(String value1, String value2) {
            addCriterion("form_type not between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andFormDictIsNull() {
            addCriterion("form_dict is null");
            return (Criteria) this;
        }

        public Criteria andFormDictIsNotNull() {
            addCriterion("form_dict is not null");
            return (Criteria) this;
        }

        public Criteria andFormDictEqualTo(String value) {
            addCriterion("form_dict =", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictNotEqualTo(String value) {
            addCriterion("form_dict <>", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictGreaterThan(String value) {
            addCriterion("form_dict >", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictGreaterThanOrEqualTo(String value) {
            addCriterion("form_dict >=", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictLessThan(String value) {
            addCriterion("form_dict <", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictLessThanOrEqualTo(String value) {
            addCriterion("form_dict <=", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictLike(String value) {
            addCriterion("form_dict like", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictNotLike(String value) {
            addCriterion("form_dict not like", value, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictIn(List<String> values) {
            addCriterion("form_dict in", values, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictNotIn(List<String> values) {
            addCriterion("form_dict not in", values, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictBetween(String value1, String value2) {
            addCriterion("form_dict between", value1, value2, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormDictNotBetween(String value1, String value2) {
            addCriterion("form_dict not between", value1, value2, "formDict");
            return (Criteria) this;
        }

        public Criteria andFormValidatorIsNull() {
            addCriterion("form_validator is null");
            return (Criteria) this;
        }

        public Criteria andFormValidatorIsNotNull() {
            addCriterion("form_validator is not null");
            return (Criteria) this;
        }

        public Criteria andFormValidatorEqualTo(String value) {
            addCriterion("form_validator =", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorNotEqualTo(String value) {
            addCriterion("form_validator <>", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorGreaterThan(String value) {
            addCriterion("form_validator >", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorGreaterThanOrEqualTo(String value) {
            addCriterion("form_validator >=", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorLessThan(String value) {
            addCriterion("form_validator <", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorLessThanOrEqualTo(String value) {
            addCriterion("form_validator <=", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorLike(String value) {
            addCriterion("form_validator like", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorNotLike(String value) {
            addCriterion("form_validator not like", value, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorIn(List<String> values) {
            addCriterion("form_validator in", values, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorNotIn(List<String> values) {
            addCriterion("form_validator not in", values, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorBetween(String value1, String value2) {
            addCriterion("form_validator between", value1, value2, "formValidator");
            return (Criteria) this;
        }

        public Criteria andFormValidatorNotBetween(String value1, String value2) {
            addCriterion("form_validator not between", value1, value2, "formValidator");
            return (Criteria) this;
        }

        public Criteria andGridItemIsNull() {
            addCriterion("grid_item is null");
            return (Criteria) this;
        }

        public Criteria andGridItemIsNotNull() {
            addCriterion("grid_item is not null");
            return (Criteria) this;
        }

        public Criteria andGridItemEqualTo(Byte value) {
            addCriterion("grid_item =", value, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemNotEqualTo(Byte value) {
            addCriterion("grid_item <>", value, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemGreaterThan(Byte value) {
            addCriterion("grid_item >", value, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemGreaterThanOrEqualTo(Byte value) {
            addCriterion("grid_item >=", value, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemLessThan(Byte value) {
            addCriterion("grid_item <", value, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemLessThanOrEqualTo(Byte value) {
            addCriterion("grid_item <=", value, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemIn(List<Byte> values) {
            addCriterion("grid_item in", values, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemNotIn(List<Byte> values) {
            addCriterion("grid_item not in", values, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemBetween(Byte value1, Byte value2) {
            addCriterion("grid_item between", value1, value2, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridItemNotBetween(Byte value1, Byte value2) {
            addCriterion("grid_item not between", value1, value2, "gridItem");
            return (Criteria) this;
        }

        public Criteria andGridSortIsNull() {
            addCriterion("grid_sort is null");
            return (Criteria) this;
        }

        public Criteria andGridSortIsNotNull() {
            addCriterion("grid_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGridSortEqualTo(Byte value) {
            addCriterion("grid_sort =", value, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortNotEqualTo(Byte value) {
            addCriterion("grid_sort <>", value, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortGreaterThan(Byte value) {
            addCriterion("grid_sort >", value, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("grid_sort >=", value, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortLessThan(Byte value) {
            addCriterion("grid_sort <", value, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortLessThanOrEqualTo(Byte value) {
            addCriterion("grid_sort <=", value, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortIn(List<Byte> values) {
            addCriterion("grid_sort in", values, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortNotIn(List<Byte> values) {
            addCriterion("grid_sort not in", values, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortBetween(Byte value1, Byte value2) {
            addCriterion("grid_sort between", value1, value2, "gridSort");
            return (Criteria) this;
        }

        public Criteria andGridSortNotBetween(Byte value1, Byte value2) {
            addCriterion("grid_sort not between", value1, value2, "gridSort");
            return (Criteria) this;
        }

        public Criteria andQueryItemIsNull() {
            addCriterion("query_item is null");
            return (Criteria) this;
        }

        public Criteria andQueryItemIsNotNull() {
            addCriterion("query_item is not null");
            return (Criteria) this;
        }

        public Criteria andQueryItemEqualTo(Byte value) {
            addCriterion("query_item =", value, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemNotEqualTo(Byte value) {
            addCriterion("query_item <>", value, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemGreaterThan(Byte value) {
            addCriterion("query_item >", value, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemGreaterThanOrEqualTo(Byte value) {
            addCriterion("query_item >=", value, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemLessThan(Byte value) {
            addCriterion("query_item <", value, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemLessThanOrEqualTo(Byte value) {
            addCriterion("query_item <=", value, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemIn(List<Byte> values) {
            addCriterion("query_item in", values, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemNotIn(List<Byte> values) {
            addCriterion("query_item not in", values, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemBetween(Byte value1, Byte value2) {
            addCriterion("query_item between", value1, value2, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryItemNotBetween(Byte value1, Byte value2) {
            addCriterion("query_item not between", value1, value2, "queryItem");
            return (Criteria) this;
        }

        public Criteria andQueryTypeIsNull() {
            addCriterion("query_type is null");
            return (Criteria) this;
        }

        public Criteria andQueryTypeIsNotNull() {
            addCriterion("query_type is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTypeEqualTo(String value) {
            addCriterion("query_type =", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeNotEqualTo(String value) {
            addCriterion("query_type <>", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeGreaterThan(String value) {
            addCriterion("query_type >", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("query_type >=", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeLessThan(String value) {
            addCriterion("query_type <", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeLessThanOrEqualTo(String value) {
            addCriterion("query_type <=", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeLike(String value) {
            addCriterion("query_type like", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeNotLike(String value) {
            addCriterion("query_type not like", value, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeIn(List<String> values) {
            addCriterion("query_type in", values, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeNotIn(List<String> values) {
            addCriterion("query_type not in", values, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeBetween(String value1, String value2) {
            addCriterion("query_type between", value1, value2, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryTypeNotBetween(String value1, String value2) {
            addCriterion("query_type not between", value1, value2, "queryType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeIsNull() {
            addCriterion("query_form_type is null");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeIsNotNull() {
            addCriterion("query_form_type is not null");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeEqualTo(String value) {
            addCriterion("query_form_type =", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeNotEqualTo(String value) {
            addCriterion("query_form_type <>", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeGreaterThan(String value) {
            addCriterion("query_form_type >", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeGreaterThanOrEqualTo(String value) {
            addCriterion("query_form_type >=", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeLessThan(String value) {
            addCriterion("query_form_type <", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeLessThanOrEqualTo(String value) {
            addCriterion("query_form_type <=", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeLike(String value) {
            addCriterion("query_form_type like", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeNotLike(String value) {
            addCriterion("query_form_type not like", value, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeIn(List<String> values) {
            addCriterion("query_form_type in", values, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeNotIn(List<String> values) {
            addCriterion("query_form_type not in", values, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeBetween(String value1, String value2) {
            addCriterion("query_form_type between", value1, value2, "queryFormType");
            return (Criteria) this;
        }

        public Criteria andQueryFormTypeNotBetween(String value1, String value2) {
            addCriterion("query_form_type not between", value1, value2, "queryFormType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}