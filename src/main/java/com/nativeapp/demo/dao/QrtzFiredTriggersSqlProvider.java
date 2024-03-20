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

import com.nativeapp.demo.dao.QrtzFiredTriggers;
import com.nativeapp.demo.dao.QrtzFiredTriggersExample.Criteria;
import com.nativeapp.demo.dao.QrtzFiredTriggersExample.Criterion;
import com.nativeapp.demo.dao.QrtzFiredTriggersExample;
import java.util.List;
import java.util.Map;

public class QrtzFiredTriggersSqlProvider {

    public String countByExample(QrtzFiredTriggersExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("qrtz_fired_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(QrtzFiredTriggersExample example) {
        BEGIN();
        DELETE_FROM("qrtz_fired_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(QrtzFiredTriggers record) {
        BEGIN();
        INSERT_INTO("qrtz_fired_triggers");
        
        if (record.getSchedName() != null) {
            VALUES("sched_name", "#{schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getEntryId() != null) {
            VALUES("entry_id", "#{entryId,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            VALUES("trigger_name", "#{triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            VALUES("trigger_group", "#{triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getInstanceName() != null) {
            VALUES("instance_name", "#{instanceName,jdbcType=VARCHAR}");
        }
        
        if (record.getFiredTime() != null) {
            VALUES("fired_time", "#{firedTime,jdbcType=BIGINT}");
        }
        
        if (record.getSchedTime() != null) {
            VALUES("sched_time", "#{schedTime,jdbcType=BIGINT}");
        }
        
        if (record.getPriority() != null) {
            VALUES("priority", "#{priority,jdbcType=INTEGER}");
        }
        
        if (record.getState() != null) {
            VALUES("state", "#{state,jdbcType=VARCHAR}");
        }
        
        if (record.getJobName() != null) {
            VALUES("job_name", "#{jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            VALUES("job_group", "#{jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getIsNonconcurrent() != null) {
            VALUES("is_nonconcurrent", "#{isNonconcurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getRequestsRecovery() != null) {
            VALUES("requests_recovery", "#{requestsRecovery,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(QrtzFiredTriggersExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sched_name");
        } else {
            SELECT("sched_name");
        }
        SELECT("entry_id");
        SELECT("trigger_name");
        SELECT("trigger_group");
        SELECT("instance_name");
        SELECT("fired_time");
        SELECT("sched_time");
        SELECT("priority");
        SELECT("state");
        SELECT("job_name");
        SELECT("job_group");
        SELECT("is_nonconcurrent");
        SELECT("requests_recovery");
        FROM("qrtz_fired_triggers");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        QrtzFiredTriggers record = (QrtzFiredTriggers) parameter.get("record");
        QrtzFiredTriggersExample example = (QrtzFiredTriggersExample) parameter.get("example");
        
        BEGIN();
        UPDATE("qrtz_fired_triggers");
        
        if (record.getSchedName() != null) {
            SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getEntryId() != null) {
            SET("entry_id = #{record.entryId,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getInstanceName() != null) {
            SET("instance_name = #{record.instanceName,jdbcType=VARCHAR}");
        }
        
        if (record.getFiredTime() != null) {
            SET("fired_time = #{record.firedTime,jdbcType=BIGINT}");
        }
        
        if (record.getSchedTime() != null) {
            SET("sched_time = #{record.schedTime,jdbcType=BIGINT}");
        }
        
        if (record.getPriority() != null) {
            SET("priority = #{record.priority,jdbcType=INTEGER}");
        }
        
        if (record.getState() != null) {
            SET("state = #{record.state,jdbcType=VARCHAR}");
        }
        
        if (record.getJobName() != null) {
            SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getIsNonconcurrent() != null) {
            SET("is_nonconcurrent = #{record.isNonconcurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getRequestsRecovery() != null) {
            SET("requests_recovery = #{record.requestsRecovery,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("qrtz_fired_triggers");
        
        SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        SET("entry_id = #{record.entryId,jdbcType=VARCHAR}");
        SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        SET("instance_name = #{record.instanceName,jdbcType=VARCHAR}");
        SET("fired_time = #{record.firedTime,jdbcType=BIGINT}");
        SET("sched_time = #{record.schedTime,jdbcType=BIGINT}");
        SET("priority = #{record.priority,jdbcType=INTEGER}");
        SET("state = #{record.state,jdbcType=VARCHAR}");
        SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        SET("is_nonconcurrent = #{record.isNonconcurrent,jdbcType=VARCHAR}");
        SET("requests_recovery = #{record.requestsRecovery,jdbcType=VARCHAR}");
        
        QrtzFiredTriggersExample example = (QrtzFiredTriggersExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(QrtzFiredTriggers record) {
        BEGIN();
        UPDATE("qrtz_fired_triggers");
        
        if (record.getTriggerName() != null) {
            SET("trigger_name = #{triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            SET("trigger_group = #{triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getInstanceName() != null) {
            SET("instance_name = #{instanceName,jdbcType=VARCHAR}");
        }
        
        if (record.getFiredTime() != null) {
            SET("fired_time = #{firedTime,jdbcType=BIGINT}");
        }
        
        if (record.getSchedTime() != null) {
            SET("sched_time = #{schedTime,jdbcType=BIGINT}");
        }
        
        if (record.getPriority() != null) {
            SET("priority = #{priority,jdbcType=INTEGER}");
        }
        
        if (record.getState() != null) {
            SET("state = #{state,jdbcType=VARCHAR}");
        }
        
        if (record.getJobName() != null) {
            SET("job_name = #{jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            SET("job_group = #{jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getIsNonconcurrent() != null) {
            SET("is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getRequestsRecovery() != null) {
            SET("requests_recovery = #{requestsRecovery,jdbcType=VARCHAR}");
        }
        
        WHERE("sched_name = #{schedName,jdbcType=VARCHAR}");
        WHERE("entry_id = #{entryId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(QrtzFiredTriggersExample example, boolean includeExamplePhrase) {
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