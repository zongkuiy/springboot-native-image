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

import com.nativeapp.demo.dao.GenProjectModify;
import com.nativeapp.demo.dao.GenProjectModifyExample.Criteria;
import com.nativeapp.demo.dao.GenProjectModifyExample.Criterion;
import com.nativeapp.demo.dao.GenProjectModifyExample;
import java.util.List;
import java.util.Map;

public class GenProjectModifySqlProvider {

    public String countByExample(GenProjectModifyExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("gen_project_modify");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GenProjectModifyExample example) {
        BEGIN();
        DELETE_FROM("gen_project_modify");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(GenProjectModify record) {
        BEGIN();
        INSERT_INTO("gen_project_modify");
        
        if (record.getProjectName() != null) {
            VALUES("project_name", "#{projectName,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectCode() != null) {
            VALUES("project_code", "#{projectCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectPackage() != null) {
            VALUES("project_package", "#{projectPackage,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectPath() != null) {
            VALUES("project_path", "#{projectPath,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectName() != null) {
            VALUES("modify_project_name", "#{modifyProjectName,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectCode() != null) {
            VALUES("modify_project_code", "#{modifyProjectCode,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectPackage() != null) {
            VALUES("modify_project_package", "#{modifyProjectPackage,jdbcType=VARCHAR}");
        }
        
        if (record.getExclusions() != null) {
            VALUES("exclusions", "#{exclusions,jdbcType=VARCHAR}");
        }
        
        if (record.getModifySuffix() != null) {
            VALUES("modify_suffix", "#{modifySuffix,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyTmpPath() != null) {
            VALUES("modify_tmp_path", "#{modifyTmpPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(GenProjectModifyExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("project_name");
        SELECT("project_code");
        SELECT("project_package");
        SELECT("project_path");
        SELECT("modify_project_name");
        SELECT("modify_project_code");
        SELECT("modify_project_package");
        SELECT("exclusions");
        SELECT("modify_suffix");
        SELECT("modify_tmp_path");
        SELECT("create_time");
        FROM("gen_project_modify");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GenProjectModify record = (GenProjectModify) parameter.get("record");
        GenProjectModifyExample example = (GenProjectModifyExample) parameter.get("example");
        
        BEGIN();
        UPDATE("gen_project_modify");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getProjectName() != null) {
            SET("project_name = #{record.projectName,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectCode() != null) {
            SET("project_code = #{record.projectCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectPackage() != null) {
            SET("project_package = #{record.projectPackage,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectPath() != null) {
            SET("project_path = #{record.projectPath,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectName() != null) {
            SET("modify_project_name = #{record.modifyProjectName,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectCode() != null) {
            SET("modify_project_code = #{record.modifyProjectCode,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectPackage() != null) {
            SET("modify_project_package = #{record.modifyProjectPackage,jdbcType=VARCHAR}");
        }
        
        if (record.getExclusions() != null) {
            SET("exclusions = #{record.exclusions,jdbcType=VARCHAR}");
        }
        
        if (record.getModifySuffix() != null) {
            SET("modify_suffix = #{record.modifySuffix,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyTmpPath() != null) {
            SET("modify_tmp_path = #{record.modifyTmpPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("gen_project_modify");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("project_name = #{record.projectName,jdbcType=VARCHAR}");
        SET("project_code = #{record.projectCode,jdbcType=VARCHAR}");
        SET("project_package = #{record.projectPackage,jdbcType=VARCHAR}");
        SET("project_path = #{record.projectPath,jdbcType=VARCHAR}");
        SET("modify_project_name = #{record.modifyProjectName,jdbcType=VARCHAR}");
        SET("modify_project_code = #{record.modifyProjectCode,jdbcType=VARCHAR}");
        SET("modify_project_package = #{record.modifyProjectPackage,jdbcType=VARCHAR}");
        SET("exclusions = #{record.exclusions,jdbcType=VARCHAR}");
        SET("modify_suffix = #{record.modifySuffix,jdbcType=VARCHAR}");
        SET("modify_tmp_path = #{record.modifyTmpPath,jdbcType=VARCHAR}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        GenProjectModifyExample example = (GenProjectModifyExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(GenProjectModify record) {
        BEGIN();
        UPDATE("gen_project_modify");
        
        if (record.getProjectName() != null) {
            SET("project_name = #{projectName,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectCode() != null) {
            SET("project_code = #{projectCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectPackage() != null) {
            SET("project_package = #{projectPackage,jdbcType=VARCHAR}");
        }
        
        if (record.getProjectPath() != null) {
            SET("project_path = #{projectPath,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectName() != null) {
            SET("modify_project_name = #{modifyProjectName,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectCode() != null) {
            SET("modify_project_code = #{modifyProjectCode,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyProjectPackage() != null) {
            SET("modify_project_package = #{modifyProjectPackage,jdbcType=VARCHAR}");
        }
        
        if (record.getExclusions() != null) {
            SET("exclusions = #{exclusions,jdbcType=VARCHAR}");
        }
        
        if (record.getModifySuffix() != null) {
            SET("modify_suffix = #{modifySuffix,jdbcType=VARCHAR}");
        }
        
        if (record.getModifyTmpPath() != null) {
            SET("modify_tmp_path = #{modifyTmpPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(GenProjectModifyExample example, boolean includeExamplePhrase) {
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