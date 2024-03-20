package com.nativeapp.demo.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.nativeapp.demo.dao.GenTableField;
import com.nativeapp.demo.dao.GenTableFieldExample.Criteria;
import com.nativeapp.demo.dao.GenTableFieldExample.Criterion;
import com.nativeapp.demo.dao.GenTableFieldExample;
import java.util.List;
import java.util.Map;

public class GenTableFieldSqlProvider {

    public String countByExample(GenTableFieldExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("gen_table_field");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GenTableFieldExample example) {
        BEGIN();
        DELETE_FROM("gen_table_field");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(GenTableField record) {
        BEGIN();
        INSERT_INTO("gen_table_field");
        
        if (record.getTableId() != null) {
            VALUES("table_id", "#{tableId,jdbcType=BIGINT}");
        }
        
        if (record.getFieldName() != null) {
            VALUES("field_name", "#{fieldName,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldType() != null) {
            VALUES("field_type", "#{fieldType,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldComment() != null) {
            VALUES("field_comment", "#{fieldComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAttrName() != null) {
            VALUES("attr_name", "#{attrName,jdbcType=VARCHAR}");
        }
        
        if (record.getAttrType() != null) {
            VALUES("attr_type", "#{attrType,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            VALUES("package_name", "#{packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            VALUES("sort", "#{sort,jdbcType=INTEGER}");
        }
        
        if (record.getAutoFill() != null) {
            VALUES("auto_fill", "#{autoFill,jdbcType=VARCHAR}");
        }
        
        if (record.getPrimaryPk() != null) {
            VALUES("primary_pk", "#{primaryPk,jdbcType=TINYINT}");
        }
        
        if (record.getBaseField() != null) {
            VALUES("base_field", "#{baseField,jdbcType=TINYINT}");
        }
        
        if (record.getFormItem() != null) {
            VALUES("form_item", "#{formItem,jdbcType=TINYINT}");
        }
        
        if (record.getFormRequired() != null) {
            VALUES("form_required", "#{formRequired,jdbcType=TINYINT}");
        }
        
        if (record.getFormType() != null) {
            VALUES("form_type", "#{formType,jdbcType=VARCHAR}");
        }
        
        if (record.getFormDict() != null) {
            VALUES("form_dict", "#{formDict,jdbcType=VARCHAR}");
        }
        
        if (record.getFormValidator() != null) {
            VALUES("form_validator", "#{formValidator,jdbcType=VARCHAR}");
        }
        
        if (record.getGridItem() != null) {
            VALUES("grid_item", "#{gridItem,jdbcType=TINYINT}");
        }
        
        if (record.getGridSort() != null) {
            VALUES("grid_sort", "#{gridSort,jdbcType=TINYINT}");
        }
        
        if (record.getQueryItem() != null) {
            VALUES("query_item", "#{queryItem,jdbcType=TINYINT}");
        }
        
        if (record.getQueryType() != null) {
            VALUES("query_type", "#{queryType,jdbcType=VARCHAR}");
        }
        
        if (record.getQueryFormType() != null) {
            VALUES("query_form_type", "#{queryFormType,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(GenTableFieldExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("table_id");
        SELECT("field_name");
        SELECT("field_type");
        SELECT("field_comment");
        SELECT("attr_name");
        SELECT("attr_type");
        SELECT("package_name");
        SELECT("sort");
        SELECT("auto_fill");
        SELECT("primary_pk");
        SELECT("base_field");
        SELECT("form_item");
        SELECT("form_required");
        SELECT("form_type");
        SELECT("form_dict");
        SELECT("form_validator");
        SELECT("grid_item");
        SELECT("grid_sort");
        SELECT("query_item");
        SELECT("query_type");
        SELECT("query_form_type");
        FROM("gen_table_field");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GenTableField record = (GenTableField) parameter.get("record");
        GenTableFieldExample example = (GenTableFieldExample) parameter.get("example");
        
        BEGIN();
        UPDATE("gen_table_field");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getTableId() != null) {
            SET("table_id = #{record.tableId,jdbcType=BIGINT}");
        }
        
        if (record.getFieldName() != null) {
            SET("field_name = #{record.fieldName,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldType() != null) {
            SET("field_type = #{record.fieldType,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldComment() != null) {
            SET("field_comment = #{record.fieldComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAttrName() != null) {
            SET("attr_name = #{record.attrName,jdbcType=VARCHAR}");
        }
        
        if (record.getAttrType() != null) {
            SET("attr_type = #{record.attrType,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            SET("package_name = #{record.packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{record.sort,jdbcType=INTEGER}");
        }
        
        if (record.getAutoFill() != null) {
            SET("auto_fill = #{record.autoFill,jdbcType=VARCHAR}");
        }
        
        if (record.getPrimaryPk() != null) {
            SET("primary_pk = #{record.primaryPk,jdbcType=TINYINT}");
        }
        
        if (record.getBaseField() != null) {
            SET("base_field = #{record.baseField,jdbcType=TINYINT}");
        }
        
        if (record.getFormItem() != null) {
            SET("form_item = #{record.formItem,jdbcType=TINYINT}");
        }
        
        if (record.getFormRequired() != null) {
            SET("form_required = #{record.formRequired,jdbcType=TINYINT}");
        }
        
        if (record.getFormType() != null) {
            SET("form_type = #{record.formType,jdbcType=VARCHAR}");
        }
        
        if (record.getFormDict() != null) {
            SET("form_dict = #{record.formDict,jdbcType=VARCHAR}");
        }
        
        if (record.getFormValidator() != null) {
            SET("form_validator = #{record.formValidator,jdbcType=VARCHAR}");
        }
        
        if (record.getGridItem() != null) {
            SET("grid_item = #{record.gridItem,jdbcType=TINYINT}");
        }
        
        if (record.getGridSort() != null) {
            SET("grid_sort = #{record.gridSort,jdbcType=TINYINT}");
        }
        
        if (record.getQueryItem() != null) {
            SET("query_item = #{record.queryItem,jdbcType=TINYINT}");
        }
        
        if (record.getQueryType() != null) {
            SET("query_type = #{record.queryType,jdbcType=VARCHAR}");
        }
        
        if (record.getQueryFormType() != null) {
            SET("query_form_type = #{record.queryFormType,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("gen_table_field");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("table_id = #{record.tableId,jdbcType=BIGINT}");
        SET("field_name = #{record.fieldName,jdbcType=VARCHAR}");
        SET("field_type = #{record.fieldType,jdbcType=VARCHAR}");
        SET("field_comment = #{record.fieldComment,jdbcType=VARCHAR}");
        SET("attr_name = #{record.attrName,jdbcType=VARCHAR}");
        SET("attr_type = #{record.attrType,jdbcType=VARCHAR}");
        SET("package_name = #{record.packageName,jdbcType=VARCHAR}");
        SET("sort = #{record.sort,jdbcType=INTEGER}");
        SET("auto_fill = #{record.autoFill,jdbcType=VARCHAR}");
        SET("primary_pk = #{record.primaryPk,jdbcType=TINYINT}");
        SET("base_field = #{record.baseField,jdbcType=TINYINT}");
        SET("form_item = #{record.formItem,jdbcType=TINYINT}");
        SET("form_required = #{record.formRequired,jdbcType=TINYINT}");
        SET("form_type = #{record.formType,jdbcType=VARCHAR}");
        SET("form_dict = #{record.formDict,jdbcType=VARCHAR}");
        SET("form_validator = #{record.formValidator,jdbcType=VARCHAR}");
        SET("grid_item = #{record.gridItem,jdbcType=TINYINT}");
        SET("grid_sort = #{record.gridSort,jdbcType=TINYINT}");
        SET("query_item = #{record.queryItem,jdbcType=TINYINT}");
        SET("query_type = #{record.queryType,jdbcType=VARCHAR}");
        SET("query_form_type = #{record.queryFormType,jdbcType=VARCHAR}");
        
        GenTableFieldExample example = (GenTableFieldExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(GenTableField record) {
        BEGIN();
        UPDATE("gen_table_field");
        
        if (record.getTableId() != null) {
            SET("table_id = #{tableId,jdbcType=BIGINT}");
        }
        
        if (record.getFieldName() != null) {
            SET("field_name = #{fieldName,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldType() != null) {
            SET("field_type = #{fieldType,jdbcType=VARCHAR}");
        }
        
        if (record.getFieldComment() != null) {
            SET("field_comment = #{fieldComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAttrName() != null) {
            SET("attr_name = #{attrName,jdbcType=VARCHAR}");
        }
        
        if (record.getAttrType() != null) {
            SET("attr_type = #{attrType,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            SET("package_name = #{packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{sort,jdbcType=INTEGER}");
        }
        
        if (record.getAutoFill() != null) {
            SET("auto_fill = #{autoFill,jdbcType=VARCHAR}");
        }
        
        if (record.getPrimaryPk() != null) {
            SET("primary_pk = #{primaryPk,jdbcType=TINYINT}");
        }
        
        if (record.getBaseField() != null) {
            SET("base_field = #{baseField,jdbcType=TINYINT}");
        }
        
        if (record.getFormItem() != null) {
            SET("form_item = #{formItem,jdbcType=TINYINT}");
        }
        
        if (record.getFormRequired() != null) {
            SET("form_required = #{formRequired,jdbcType=TINYINT}");
        }
        
        if (record.getFormType() != null) {
            SET("form_type = #{formType,jdbcType=VARCHAR}");
        }
        
        if (record.getFormDict() != null) {
            SET("form_dict = #{formDict,jdbcType=VARCHAR}");
        }
        
        if (record.getFormValidator() != null) {
            SET("form_validator = #{formValidator,jdbcType=VARCHAR}");
        }
        
        if (record.getGridItem() != null) {
            SET("grid_item = #{gridItem,jdbcType=TINYINT}");
        }
        
        if (record.getGridSort() != null) {
            SET("grid_sort = #{gridSort,jdbcType=TINYINT}");
        }
        
        if (record.getQueryItem() != null) {
            SET("query_item = #{queryItem,jdbcType=TINYINT}");
        }
        
        if (record.getQueryType() != null) {
            SET("query_type = #{queryType,jdbcType=VARCHAR}");
        }
        
        if (record.getQueryFormType() != null) {
            SET("query_form_type = #{queryFormType,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(GenTableFieldExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}