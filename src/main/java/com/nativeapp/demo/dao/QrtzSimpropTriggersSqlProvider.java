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

import com.nativeapp.demo.dao.QrtzSimpropTriggers;
import com.nativeapp.demo.dao.QrtzSimpropTriggersExample.Criteria;
import com.nativeapp.demo.dao.QrtzSimpropTriggersExample.Criterion;
import com.nativeapp.demo.dao.QrtzSimpropTriggersExample;
import java.util.List;
import java.util.Map;

public class QrtzSimpropTriggersSqlProvider {

    public String countByExample(QrtzSimpropTriggersExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("qrtz_simprop_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(QrtzSimpropTriggersExample example) {
        BEGIN();
        DELETE_FROM("qrtz_simprop_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(QrtzSimpropTriggers record) {
        BEGIN();
        INSERT_INTO("qrtz_simprop_triggers");
        
        if (record.getSchedName() != null) {
            VALUES("sched_name", "#{schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            VALUES("trigger_name", "#{triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            VALUES("trigger_group", "#{triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp1() != null) {
            VALUES("str_prop_1", "#{strProp1,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp2() != null) {
            VALUES("str_prop_2", "#{strProp2,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp3() != null) {
            VALUES("str_prop_3", "#{strProp3,jdbcType=VARCHAR}");
        }
        
        if (record.getIntProp1() != null) {
            VALUES("int_prop_1", "#{intProp1,jdbcType=INTEGER}");
        }
        
        if (record.getIntProp2() != null) {
            VALUES("int_prop_2", "#{intProp2,jdbcType=INTEGER}");
        }
        
        if (record.getLongProp1() != null) {
            VALUES("long_prop_1", "#{longProp1,jdbcType=BIGINT}");
        }
        
        if (record.getLongProp2() != null) {
            VALUES("long_prop_2", "#{longProp2,jdbcType=BIGINT}");
        }
        
        if (record.getDecProp1() != null) {
            VALUES("dec_prop_1", "#{decProp1,jdbcType=DECIMAL}");
        }
        
        if (record.getDecProp2() != null) {
            VALUES("dec_prop_2", "#{decProp2,jdbcType=DECIMAL}");
        }
        
        if (record.getBoolProp1() != null) {
            VALUES("bool_prop_1", "#{boolProp1,jdbcType=VARCHAR}");
        }
        
        if (record.getBoolProp2() != null) {
            VALUES("bool_prop_2", "#{boolProp2,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(QrtzSimpropTriggersExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sched_name");
        } else {
            SELECT("sched_name");
        }
        SELECT("trigger_name");
        SELECT("trigger_group");
        SELECT("str_prop_1");
        SELECT("str_prop_2");
        SELECT("str_prop_3");
        SELECT("int_prop_1");
        SELECT("int_prop_2");
        SELECT("long_prop_1");
        SELECT("long_prop_2");
        SELECT("dec_prop_1");
        SELECT("dec_prop_2");
        SELECT("bool_prop_1");
        SELECT("bool_prop_2");
        FROM("qrtz_simprop_triggers");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        QrtzSimpropTriggers record = (QrtzSimpropTriggers) parameter.get("record");
        QrtzSimpropTriggersExample example = (QrtzSimpropTriggersExample) parameter.get("example");
        
        BEGIN();
        UPDATE("qrtz_simprop_triggers");
        
        if (record.getSchedName() != null) {
            SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp1() != null) {
            SET("str_prop_1 = #{record.strProp1,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp2() != null) {
            SET("str_prop_2 = #{record.strProp2,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp3() != null) {
            SET("str_prop_3 = #{record.strProp3,jdbcType=VARCHAR}");
        }
        
        if (record.getIntProp1() != null) {
            SET("int_prop_1 = #{record.intProp1,jdbcType=INTEGER}");
        }
        
        if (record.getIntProp2() != null) {
            SET("int_prop_2 = #{record.intProp2,jdbcType=INTEGER}");
        }
        
        if (record.getLongProp1() != null) {
            SET("long_prop_1 = #{record.longProp1,jdbcType=BIGINT}");
        }
        
        if (record.getLongProp2() != null) {
            SET("long_prop_2 = #{record.longProp2,jdbcType=BIGINT}");
        }
        
        if (record.getDecProp1() != null) {
            SET("dec_prop_1 = #{record.decProp1,jdbcType=DECIMAL}");
        }
        
        if (record.getDecProp2() != null) {
            SET("dec_prop_2 = #{record.decProp2,jdbcType=DECIMAL}");
        }
        
        if (record.getBoolProp1() != null) {
            SET("bool_prop_1 = #{record.boolProp1,jdbcType=VARCHAR}");
        }
        
        if (record.getBoolProp2() != null) {
            SET("bool_prop_2 = #{record.boolProp2,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("qrtz_simprop_triggers");
        
        SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        SET("str_prop_1 = #{record.strProp1,jdbcType=VARCHAR}");
        SET("str_prop_2 = #{record.strProp2,jdbcType=VARCHAR}");
        SET("str_prop_3 = #{record.strProp3,jdbcType=VARCHAR}");
        SET("int_prop_1 = #{record.intProp1,jdbcType=INTEGER}");
        SET("int_prop_2 = #{record.intProp2,jdbcType=INTEGER}");
        SET("long_prop_1 = #{record.longProp1,jdbcType=BIGINT}");
        SET("long_prop_2 = #{record.longProp2,jdbcType=BIGINT}");
        SET("dec_prop_1 = #{record.decProp1,jdbcType=DECIMAL}");
        SET("dec_prop_2 = #{record.decProp2,jdbcType=DECIMAL}");
        SET("bool_prop_1 = #{record.boolProp1,jdbcType=VARCHAR}");
        SET("bool_prop_2 = #{record.boolProp2,jdbcType=VARCHAR}");
        
        QrtzSimpropTriggersExample example = (QrtzSimpropTriggersExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(QrtzSimpropTriggers record) {
        BEGIN();
        UPDATE("qrtz_simprop_triggers");
        
        if (record.getStrProp1() != null) {
            SET("str_prop_1 = #{strProp1,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp2() != null) {
            SET("str_prop_2 = #{strProp2,jdbcType=VARCHAR}");
        }
        
        if (record.getStrProp3() != null) {
            SET("str_prop_3 = #{strProp3,jdbcType=VARCHAR}");
        }
        
        if (record.getIntProp1() != null) {
            SET("int_prop_1 = #{intProp1,jdbcType=INTEGER}");
        }
        
        if (record.getIntProp2() != null) {
            SET("int_prop_2 = #{intProp2,jdbcType=INTEGER}");
        }
        
        if (record.getLongProp1() != null) {
            SET("long_prop_1 = #{longProp1,jdbcType=BIGINT}");
        }
        
        if (record.getLongProp2() != null) {
            SET("long_prop_2 = #{longProp2,jdbcType=BIGINT}");
        }
        
        if (record.getDecProp1() != null) {
            SET("dec_prop_1 = #{decProp1,jdbcType=DECIMAL}");
        }
        
        if (record.getDecProp2() != null) {
            SET("dec_prop_2 = #{decProp2,jdbcType=DECIMAL}");
        }
        
        if (record.getBoolProp1() != null) {
            SET("bool_prop_1 = #{boolProp1,jdbcType=VARCHAR}");
        }
        
        if (record.getBoolProp2() != null) {
            SET("bool_prop_2 = #{boolProp2,jdbcType=VARCHAR}");
        }
        
        WHERE("sched_name = #{schedName,jdbcType=VARCHAR}");
        WHERE("trigger_name = #{triggerName,jdbcType=VARCHAR}");
        WHERE("trigger_group = #{triggerGroup,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(QrtzSimpropTriggersExample example, boolean includeExamplePhrase) {
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