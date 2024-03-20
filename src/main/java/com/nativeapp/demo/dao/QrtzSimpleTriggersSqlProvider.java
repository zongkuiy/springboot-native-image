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

import com.nativeapp.demo.dao.QrtzSimpleTriggers;
import com.nativeapp.demo.dao.QrtzSimpleTriggersExample.Criteria;
import com.nativeapp.demo.dao.QrtzSimpleTriggersExample.Criterion;
import com.nativeapp.demo.dao.QrtzSimpleTriggersExample;
import java.util.List;
import java.util.Map;

public class QrtzSimpleTriggersSqlProvider {

    public String countByExample(QrtzSimpleTriggersExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("qrtz_simple_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(QrtzSimpleTriggersExample example) {
        BEGIN();
        DELETE_FROM("qrtz_simple_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(QrtzSimpleTriggers record) {
        BEGIN();
        INSERT_INTO("qrtz_simple_triggers");
        
        if (record.getSchedName() != null) {
            VALUES("sched_name", "#{schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            VALUES("trigger_name", "#{triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            VALUES("trigger_group", "#{triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getRepeatCount() != null) {
            VALUES("repeat_count", "#{repeatCount,jdbcType=BIGINT}");
        }
        
        if (record.getRepeatInterval() != null) {
            VALUES("repeat_interval", "#{repeatInterval,jdbcType=BIGINT}");
        }
        
        if (record.getTimesTriggered() != null) {
            VALUES("times_triggered", "#{timesTriggered,jdbcType=BIGINT}");
        }
        
        return SQL();
    }

    public String selectByExample(QrtzSimpleTriggersExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sched_name");
        } else {
            SELECT("sched_name");
        }
        SELECT("trigger_name");
        SELECT("trigger_group");
        SELECT("repeat_count");
        SELECT("repeat_interval");
        SELECT("times_triggered");
        FROM("qrtz_simple_triggers");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        QrtzSimpleTriggers record = (QrtzSimpleTriggers) parameter.get("record");
        QrtzSimpleTriggersExample example = (QrtzSimpleTriggersExample) parameter.get("example");
        
        BEGIN();
        UPDATE("qrtz_simple_triggers");
        
        if (record.getSchedName() != null) {
            SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getRepeatCount() != null) {
            SET("repeat_count = #{record.repeatCount,jdbcType=BIGINT}");
        }
        
        if (record.getRepeatInterval() != null) {
            SET("repeat_interval = #{record.repeatInterval,jdbcType=BIGINT}");
        }
        
        if (record.getTimesTriggered() != null) {
            SET("times_triggered = #{record.timesTriggered,jdbcType=BIGINT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("qrtz_simple_triggers");
        
        SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        SET("repeat_count = #{record.repeatCount,jdbcType=BIGINT}");
        SET("repeat_interval = #{record.repeatInterval,jdbcType=BIGINT}");
        SET("times_triggered = #{record.timesTriggered,jdbcType=BIGINT}");
        
        QrtzSimpleTriggersExample example = (QrtzSimpleTriggersExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(QrtzSimpleTriggers record) {
        BEGIN();
        UPDATE("qrtz_simple_triggers");
        
        if (record.getRepeatCount() != null) {
            SET("repeat_count = #{repeatCount,jdbcType=BIGINT}");
        }
        
        if (record.getRepeatInterval() != null) {
            SET("repeat_interval = #{repeatInterval,jdbcType=BIGINT}");
        }
        
        if (record.getTimesTriggered() != null) {
            SET("times_triggered = #{timesTriggered,jdbcType=BIGINT}");
        }
        
        WHERE("sched_name = #{schedName,jdbcType=VARCHAR}");
        WHERE("trigger_name = #{triggerName,jdbcType=VARCHAR}");
        WHERE("trigger_group = #{triggerGroup,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(QrtzSimpleTriggersExample example, boolean includeExamplePhrase) {
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