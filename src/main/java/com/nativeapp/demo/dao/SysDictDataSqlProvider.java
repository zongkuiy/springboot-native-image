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

import com.nativeapp.demo.dao.SysDictData;
import com.nativeapp.demo.dao.SysDictDataExample.Criteria;
import com.nativeapp.demo.dao.SysDictDataExample.Criterion;
import com.nativeapp.demo.dao.SysDictDataExample;
import java.util.List;
import java.util.Map;

public class SysDictDataSqlProvider {

    public String countByExample(SysDictDataExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sys_dict_data");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(SysDictDataExample example) {
        BEGIN();
        DELETE_FROM("sys_dict_data");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(SysDictData record) {
        BEGIN();
        INSERT_INTO("sys_dict_data");
        
        if (record.getDictTypeId() != null) {
            VALUES("dict_type_id", "#{dictTypeId,jdbcType=BIGINT}");
        }
        
        if (record.getDictLabel() != null) {
            VALUES("dict_label", "#{dictLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getDictValue() != null) {
            VALUES("dict_value", "#{dictValue,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelClass() != null) {
            VALUES("label_class", "#{labelClass,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            VALUES("sort", "#{sort,jdbcType=INTEGER}");
        }
        
        if (record.getTenantId() != null) {
            VALUES("tenant_id", "#{tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getVersion() != null) {
            VALUES("version", "#{version,jdbcType=INTEGER}");
        }
        
        if (record.getDeleted() != null) {
            VALUES("deleted", "#{deleted,jdbcType=TINYINT}");
        }
        
        if (record.getCreator() != null) {
            VALUES("creator", "#{creator,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdater() != null) {
            VALUES("updater", "#{updater,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(SysDictDataExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("dict_type_id");
        SELECT("dict_label");
        SELECT("dict_value");
        SELECT("label_class");
        SELECT("remark");
        SELECT("sort");
        SELECT("tenant_id");
        SELECT("version");
        SELECT("deleted");
        SELECT("creator");
        SELECT("create_time");
        SELECT("updater");
        SELECT("update_time");
        FROM("sys_dict_data");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysDictData record = (SysDictData) parameter.get("record");
        SysDictDataExample example = (SysDictDataExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sys_dict_data");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getDictTypeId() != null) {
            SET("dict_type_id = #{record.dictTypeId,jdbcType=BIGINT}");
        }
        
        if (record.getDictLabel() != null) {
            SET("dict_label = #{record.dictLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getDictValue() != null) {
            SET("dict_value = #{record.dictValue,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelClass() != null) {
            SET("label_class = #{record.labelClass,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{record.sort,jdbcType=INTEGER}");
        }
        
        if (record.getTenantId() != null) {
            SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{record.version,jdbcType=INTEGER}");
        }
        
        if (record.getDeleted() != null) {
            SET("deleted = #{record.deleted,jdbcType=TINYINT}");
        }
        
        if (record.getCreator() != null) {
            SET("creator = #{record.creator,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdater() != null) {
            SET("updater = #{record.updater,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sys_dict_data");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("dict_type_id = #{record.dictTypeId,jdbcType=BIGINT}");
        SET("dict_label = #{record.dictLabel,jdbcType=VARCHAR}");
        SET("dict_value = #{record.dictValue,jdbcType=VARCHAR}");
        SET("label_class = #{record.labelClass,jdbcType=VARCHAR}");
        SET("remark = #{record.remark,jdbcType=VARCHAR}");
        SET("sort = #{record.sort,jdbcType=INTEGER}");
        SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        SET("version = #{record.version,jdbcType=INTEGER}");
        SET("deleted = #{record.deleted,jdbcType=TINYINT}");
        SET("creator = #{record.creator,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("updater = #{record.updater,jdbcType=BIGINT}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        SysDictDataExample example = (SysDictDataExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(SysDictData record) {
        BEGIN();
        UPDATE("sys_dict_data");
        
        if (record.getDictTypeId() != null) {
            SET("dict_type_id = #{dictTypeId,jdbcType=BIGINT}");
        }
        
        if (record.getDictLabel() != null) {
            SET("dict_label = #{dictLabel,jdbcType=VARCHAR}");
        }
        
        if (record.getDictValue() != null) {
            SET("dict_value = #{dictValue,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelClass() != null) {
            SET("label_class = #{labelClass,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{sort,jdbcType=INTEGER}");
        }
        
        if (record.getTenantId() != null) {
            SET("tenant_id = #{tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{version,jdbcType=INTEGER}");
        }
        
        if (record.getDeleted() != null) {
            SET("deleted = #{deleted,jdbcType=TINYINT}");
        }
        
        if (record.getCreator() != null) {
            SET("creator = #{creator,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdater() != null) {
            SET("updater = #{updater,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(SysDictDataExample example, boolean includeExamplePhrase) {
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