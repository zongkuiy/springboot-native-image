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

import com.nativeapp.demo.dao.GenTable;
import com.nativeapp.demo.dao.GenTableExample.Criteria;
import com.nativeapp.demo.dao.GenTableExample.Criterion;
import com.nativeapp.demo.dao.GenTableExample;
import java.util.List;
import java.util.Map;

public class GenTableSqlProvider {

    public String countByExample(GenTableExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("gen_table");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GenTableExample example) {
        BEGIN();
        DELETE_FROM("gen_table");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(GenTable record) {
        BEGIN();
        INSERT_INTO("gen_table");
        
        if (record.getTableName() != null) {
            VALUES("table_name", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getClassName() != null) {
            VALUES("class_name", "#{className,jdbcType=VARCHAR}");
        }
        
        if (record.getTableComment() != null) {
            VALUES("table_comment", "#{tableComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthor() != null) {
            VALUES("author", "#{author,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            VALUES("package_name", "#{packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            VALUES("version", "#{version,jdbcType=VARCHAR}");
        }
        
        if (record.getGeneratorType() != null) {
            VALUES("generator_type", "#{generatorType,jdbcType=TINYINT}");
        }
        
        if (record.getBackendPath() != null) {
            VALUES("backend_path", "#{backendPath,jdbcType=VARCHAR}");
        }
        
        if (record.getFrontendPath() != null) {
            VALUES("frontend_path", "#{frontendPath,jdbcType=VARCHAR}");
        }
        
        if (record.getModuleName() != null) {
            VALUES("module_name", "#{moduleName,jdbcType=VARCHAR}");
        }
        
        if (record.getFunctionName() != null) {
            VALUES("function_name", "#{functionName,jdbcType=VARCHAR}");
        }
        
        if (record.getFormLayout() != null) {
            VALUES("form_layout", "#{formLayout,jdbcType=TINYINT}");
        }
        
        if (record.getDatasourceId() != null) {
            VALUES("datasource_id", "#{datasourceId,jdbcType=BIGINT}");
        }
        
        if (record.getBaseclassId() != null) {
            VALUES("baseclass_id", "#{baseclassId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(GenTableExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("table_name");
        SELECT("class_name");
        SELECT("table_comment");
        SELECT("author");
        SELECT("email");
        SELECT("package_name");
        SELECT("version");
        SELECT("generator_type");
        SELECT("backend_path");
        SELECT("frontend_path");
        SELECT("module_name");
        SELECT("function_name");
        SELECT("form_layout");
        SELECT("datasource_id");
        SELECT("baseclass_id");
        SELECT("create_time");
        FROM("gen_table");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GenTable record = (GenTable) parameter.get("record");
        GenTableExample example = (GenTableExample) parameter.get("example");
        
        BEGIN();
        UPDATE("gen_table");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getTableName() != null) {
            SET("table_name = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getClassName() != null) {
            SET("class_name = #{record.className,jdbcType=VARCHAR}");
        }
        
        if (record.getTableComment() != null) {
            SET("table_comment = #{record.tableComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthor() != null) {
            SET("author = #{record.author,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            SET("package_name = #{record.packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{record.version,jdbcType=VARCHAR}");
        }
        
        if (record.getGeneratorType() != null) {
            SET("generator_type = #{record.generatorType,jdbcType=TINYINT}");
        }
        
        if (record.getBackendPath() != null) {
            SET("backend_path = #{record.backendPath,jdbcType=VARCHAR}");
        }
        
        if (record.getFrontendPath() != null) {
            SET("frontend_path = #{record.frontendPath,jdbcType=VARCHAR}");
        }
        
        if (record.getModuleName() != null) {
            SET("module_name = #{record.moduleName,jdbcType=VARCHAR}");
        }
        
        if (record.getFunctionName() != null) {
            SET("function_name = #{record.functionName,jdbcType=VARCHAR}");
        }
        
        if (record.getFormLayout() != null) {
            SET("form_layout = #{record.formLayout,jdbcType=TINYINT}");
        }
        
        if (record.getDatasourceId() != null) {
            SET("datasource_id = #{record.datasourceId,jdbcType=BIGINT}");
        }
        
        if (record.getBaseclassId() != null) {
            SET("baseclass_id = #{record.baseclassId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("gen_table");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("table_name = #{record.tableName,jdbcType=VARCHAR}");
        SET("class_name = #{record.className,jdbcType=VARCHAR}");
        SET("table_comment = #{record.tableComment,jdbcType=VARCHAR}");
        SET("author = #{record.author,jdbcType=VARCHAR}");
        SET("email = #{record.email,jdbcType=VARCHAR}");
        SET("package_name = #{record.packageName,jdbcType=VARCHAR}");
        SET("version = #{record.version,jdbcType=VARCHAR}");
        SET("generator_type = #{record.generatorType,jdbcType=TINYINT}");
        SET("backend_path = #{record.backendPath,jdbcType=VARCHAR}");
        SET("frontend_path = #{record.frontendPath,jdbcType=VARCHAR}");
        SET("module_name = #{record.moduleName,jdbcType=VARCHAR}");
        SET("function_name = #{record.functionName,jdbcType=VARCHAR}");
        SET("form_layout = #{record.formLayout,jdbcType=TINYINT}");
        SET("datasource_id = #{record.datasourceId,jdbcType=BIGINT}");
        SET("baseclass_id = #{record.baseclassId,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        GenTableExample example = (GenTableExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(GenTable record) {
        BEGIN();
        UPDATE("gen_table");
        
        if (record.getTableName() != null) {
            SET("table_name = #{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getClassName() != null) {
            SET("class_name = #{className,jdbcType=VARCHAR}");
        }
        
        if (record.getTableComment() != null) {
            SET("table_comment = #{tableComment,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthor() != null) {
            SET("author = #{author,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            SET("package_name = #{packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{version,jdbcType=VARCHAR}");
        }
        
        if (record.getGeneratorType() != null) {
            SET("generator_type = #{generatorType,jdbcType=TINYINT}");
        }
        
        if (record.getBackendPath() != null) {
            SET("backend_path = #{backendPath,jdbcType=VARCHAR}");
        }
        
        if (record.getFrontendPath() != null) {
            SET("frontend_path = #{frontendPath,jdbcType=VARCHAR}");
        }
        
        if (record.getModuleName() != null) {
            SET("module_name = #{moduleName,jdbcType=VARCHAR}");
        }
        
        if (record.getFunctionName() != null) {
            SET("function_name = #{functionName,jdbcType=VARCHAR}");
        }
        
        if (record.getFormLayout() != null) {
            SET("form_layout = #{formLayout,jdbcType=TINYINT}");
        }
        
        if (record.getDatasourceId() != null) {
            SET("datasource_id = #{datasourceId,jdbcType=BIGINT}");
        }
        
        if (record.getBaseclassId() != null) {
            SET("baseclass_id = #{baseclassId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(GenTableExample example, boolean includeExamplePhrase) {
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