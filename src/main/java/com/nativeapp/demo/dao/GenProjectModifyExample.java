package com.nativeapp.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenProjectModifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenProjectModifyExample() {
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectPackageIsNull() {
            addCriterion("project_package is null");
            return (Criteria) this;
        }

        public Criteria andProjectPackageIsNotNull() {
            addCriterion("project_package is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPackageEqualTo(String value) {
            addCriterion("project_package =", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageNotEqualTo(String value) {
            addCriterion("project_package <>", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageGreaterThan(String value) {
            addCriterion("project_package >", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageGreaterThanOrEqualTo(String value) {
            addCriterion("project_package >=", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageLessThan(String value) {
            addCriterion("project_package <", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageLessThanOrEqualTo(String value) {
            addCriterion("project_package <=", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageLike(String value) {
            addCriterion("project_package like", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageNotLike(String value) {
            addCriterion("project_package not like", value, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageIn(List<String> values) {
            addCriterion("project_package in", values, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageNotIn(List<String> values) {
            addCriterion("project_package not in", values, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageBetween(String value1, String value2) {
            addCriterion("project_package between", value1, value2, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPackageNotBetween(String value1, String value2) {
            addCriterion("project_package not between", value1, value2, "projectPackage");
            return (Criteria) this;
        }

        public Criteria andProjectPathIsNull() {
            addCriterion("project_path is null");
            return (Criteria) this;
        }

        public Criteria andProjectPathIsNotNull() {
            addCriterion("project_path is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPathEqualTo(String value) {
            addCriterion("project_path =", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathNotEqualTo(String value) {
            addCriterion("project_path <>", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathGreaterThan(String value) {
            addCriterion("project_path >", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathGreaterThanOrEqualTo(String value) {
            addCriterion("project_path >=", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathLessThan(String value) {
            addCriterion("project_path <", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathLessThanOrEqualTo(String value) {
            addCriterion("project_path <=", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathLike(String value) {
            addCriterion("project_path like", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathNotLike(String value) {
            addCriterion("project_path not like", value, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathIn(List<String> values) {
            addCriterion("project_path in", values, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathNotIn(List<String> values) {
            addCriterion("project_path not in", values, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathBetween(String value1, String value2) {
            addCriterion("project_path between", value1, value2, "projectPath");
            return (Criteria) this;
        }

        public Criteria andProjectPathNotBetween(String value1, String value2) {
            addCriterion("project_path not between", value1, value2, "projectPath");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameIsNull() {
            addCriterion("modify_project_name is null");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameIsNotNull() {
            addCriterion("modify_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameEqualTo(String value) {
            addCriterion("modify_project_name =", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameNotEqualTo(String value) {
            addCriterion("modify_project_name <>", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameGreaterThan(String value) {
            addCriterion("modify_project_name >", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("modify_project_name >=", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameLessThan(String value) {
            addCriterion("modify_project_name <", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameLessThanOrEqualTo(String value) {
            addCriterion("modify_project_name <=", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameLike(String value) {
            addCriterion("modify_project_name like", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameNotLike(String value) {
            addCriterion("modify_project_name not like", value, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameIn(List<String> values) {
            addCriterion("modify_project_name in", values, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameNotIn(List<String> values) {
            addCriterion("modify_project_name not in", values, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameBetween(String value1, String value2) {
            addCriterion("modify_project_name between", value1, value2, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectNameNotBetween(String value1, String value2) {
            addCriterion("modify_project_name not between", value1, value2, "modifyProjectName");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeIsNull() {
            addCriterion("modify_project_code is null");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeIsNotNull() {
            addCriterion("modify_project_code is not null");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeEqualTo(String value) {
            addCriterion("modify_project_code =", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeNotEqualTo(String value) {
            addCriterion("modify_project_code <>", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeGreaterThan(String value) {
            addCriterion("modify_project_code >", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_project_code >=", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeLessThan(String value) {
            addCriterion("modify_project_code <", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("modify_project_code <=", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeLike(String value) {
            addCriterion("modify_project_code like", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeNotLike(String value) {
            addCriterion("modify_project_code not like", value, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeIn(List<String> values) {
            addCriterion("modify_project_code in", values, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeNotIn(List<String> values) {
            addCriterion("modify_project_code not in", values, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeBetween(String value1, String value2) {
            addCriterion("modify_project_code between", value1, value2, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectCodeNotBetween(String value1, String value2) {
            addCriterion("modify_project_code not between", value1, value2, "modifyProjectCode");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageIsNull() {
            addCriterion("modify_project_package is null");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageIsNotNull() {
            addCriterion("modify_project_package is not null");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageEqualTo(String value) {
            addCriterion("modify_project_package =", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageNotEqualTo(String value) {
            addCriterion("modify_project_package <>", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageGreaterThan(String value) {
            addCriterion("modify_project_package >", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageGreaterThanOrEqualTo(String value) {
            addCriterion("modify_project_package >=", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageLessThan(String value) {
            addCriterion("modify_project_package <", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageLessThanOrEqualTo(String value) {
            addCriterion("modify_project_package <=", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageLike(String value) {
            addCriterion("modify_project_package like", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageNotLike(String value) {
            addCriterion("modify_project_package not like", value, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageIn(List<String> values) {
            addCriterion("modify_project_package in", values, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageNotIn(List<String> values) {
            addCriterion("modify_project_package not in", values, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageBetween(String value1, String value2) {
            addCriterion("modify_project_package between", value1, value2, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andModifyProjectPackageNotBetween(String value1, String value2) {
            addCriterion("modify_project_package not between", value1, value2, "modifyProjectPackage");
            return (Criteria) this;
        }

        public Criteria andExclusionsIsNull() {
            addCriterion("exclusions is null");
            return (Criteria) this;
        }

        public Criteria andExclusionsIsNotNull() {
            addCriterion("exclusions is not null");
            return (Criteria) this;
        }

        public Criteria andExclusionsEqualTo(String value) {
            addCriterion("exclusions =", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsNotEqualTo(String value) {
            addCriterion("exclusions <>", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsGreaterThan(String value) {
            addCriterion("exclusions >", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsGreaterThanOrEqualTo(String value) {
            addCriterion("exclusions >=", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsLessThan(String value) {
            addCriterion("exclusions <", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsLessThanOrEqualTo(String value) {
            addCriterion("exclusions <=", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsLike(String value) {
            addCriterion("exclusions like", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsNotLike(String value) {
            addCriterion("exclusions not like", value, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsIn(List<String> values) {
            addCriterion("exclusions in", values, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsNotIn(List<String> values) {
            addCriterion("exclusions not in", values, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsBetween(String value1, String value2) {
            addCriterion("exclusions between", value1, value2, "exclusions");
            return (Criteria) this;
        }

        public Criteria andExclusionsNotBetween(String value1, String value2) {
            addCriterion("exclusions not between", value1, value2, "exclusions");
            return (Criteria) this;
        }

        public Criteria andModifySuffixIsNull() {
            addCriterion("modify_suffix is null");
            return (Criteria) this;
        }

        public Criteria andModifySuffixIsNotNull() {
            addCriterion("modify_suffix is not null");
            return (Criteria) this;
        }

        public Criteria andModifySuffixEqualTo(String value) {
            addCriterion("modify_suffix =", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixNotEqualTo(String value) {
            addCriterion("modify_suffix <>", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixGreaterThan(String value) {
            addCriterion("modify_suffix >", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixGreaterThanOrEqualTo(String value) {
            addCriterion("modify_suffix >=", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixLessThan(String value) {
            addCriterion("modify_suffix <", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixLessThanOrEqualTo(String value) {
            addCriterion("modify_suffix <=", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixLike(String value) {
            addCriterion("modify_suffix like", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixNotLike(String value) {
            addCriterion("modify_suffix not like", value, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixIn(List<String> values) {
            addCriterion("modify_suffix in", values, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixNotIn(List<String> values) {
            addCriterion("modify_suffix not in", values, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixBetween(String value1, String value2) {
            addCriterion("modify_suffix between", value1, value2, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifySuffixNotBetween(String value1, String value2) {
            addCriterion("modify_suffix not between", value1, value2, "modifySuffix");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathIsNull() {
            addCriterion("modify_tmp_path is null");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathIsNotNull() {
            addCriterion("modify_tmp_path is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathEqualTo(String value) {
            addCriterion("modify_tmp_path =", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathNotEqualTo(String value) {
            addCriterion("modify_tmp_path <>", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathGreaterThan(String value) {
            addCriterion("modify_tmp_path >", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathGreaterThanOrEqualTo(String value) {
            addCriterion("modify_tmp_path >=", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathLessThan(String value) {
            addCriterion("modify_tmp_path <", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathLessThanOrEqualTo(String value) {
            addCriterion("modify_tmp_path <=", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathLike(String value) {
            addCriterion("modify_tmp_path like", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathNotLike(String value) {
            addCriterion("modify_tmp_path not like", value, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathIn(List<String> values) {
            addCriterion("modify_tmp_path in", values, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathNotIn(List<String> values) {
            addCriterion("modify_tmp_path not in", values, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathBetween(String value1, String value2) {
            addCriterion("modify_tmp_path between", value1, value2, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andModifyTmpPathNotBetween(String value1, String value2) {
            addCriterion("modify_tmp_path not between", value1, value2, "modifyTmpPath");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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