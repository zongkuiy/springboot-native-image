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

import com.nativeapp.demo.dao.QrtzTriggers;
import com.nativeapp.demo.dao.QrtzTriggersExample.Criteria;
import com.nativeapp.demo.dao.QrtzTriggersExample.Criterion;
import com.nativeapp.demo.dao.QrtzTriggersExample;
import java.util.List;
import java.util.Map;

public class QrtzTriggersSqlProvider {

    public String countByExample(QrtzTriggersExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("qrtz_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(QrtzTriggersExample example) {
        BEGIN();
        DELETE_FROM("qrtz_triggers");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(QrtzTriggers record) {
        BEGIN();
        INSERT_INTO("qrtz_triggers");
        
        if (record.getSchedName() != null) {
            VALUES("sched_name", "#{schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            VALUES("trigger_name", "#{triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            VALUES("trigger_group", "#{triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getJobName() != null) {
            VALUES("job_name", "#{jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            VALUES("job_group", "#{jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getNextFireTime() != null) {
            VALUES("next_fire_time", "#{nextFireTime,jdbcType=BIGINT}");
        }
        
        if (record.getPrevFireTime() != null) {
            VALUES("prev_fire_time", "#{prevFireTime,jdbcType=BIGINT}");
        }
        
        if (record.getPriority() != null) {
            VALUES("priority", "#{priority,jdbcType=INTEGER}");
        }
        
        if (record.getTriggerState() != null) {
            VALUES("trigger_state", "#{triggerState,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerType() != null) {
            VALUES("trigger_type", "#{triggerType,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            VALUES("start_time", "#{startTime,jdbcType=BIGINT}");
        }
        
        if (record.getEndTime() != null) {
            VALUES("end_time", "#{endTime,jdbcType=BIGINT}");
        }
        
        if (record.getCalendarName() != null) {
            VALUES("calendar_name", "#{calendarName,jdbcType=VARCHAR}");
        }
        
        if (record.getMisfireInstr() != null) {
            VALUES("misfire_instr", "#{misfireInstr,jdbcType=SMALLINT}");
        }
        
        if (record.getJobData() != null) {
            VALUES("job_data", "#{jobData,jdbcType=LONGVARBINARY}");
        }
        
        return SQL();
    }

    public String selectByExampleWithBLOBs(QrtzTriggersExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sched_name");
        } else {
            SELECT("sched_name");
        }
        SELECT("trigger_name");
        SELECT("trigger_group");
        SELECT("job_name");
        SELECT("job_group");
        SELECT("description");
        SELECT("next_fire_time");
        SELECT("prev_fire_time");
        SELECT("priority");
        SELECT("trigger_state");
        SELECT("trigger_type");
        SELECT("start_time");
        SELECT("end_time");
        SELECT("calendar_name");
        SELECT("misfire_instr");
        SELECT("job_data");
        FROM("qrtz_triggers");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String selectByExample(QrtzTriggersExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sched_name");
        } else {
            SELECT("sched_name");
        }
        SELECT("trigger_name");
        SELECT("trigger_group");
        SELECT("job_name");
        SELECT("job_group");
        SELECT("description");
        SELECT("next_fire_time");
        SELECT("prev_fire_time");
        SELECT("priority");
        SELECT("trigger_state");
        SELECT("trigger_type");
        SELECT("start_time");
        SELECT("end_time");
        SELECT("calendar_name");
        SELECT("misfire_instr");
        FROM("qrtz_triggers");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        QrtzTriggers record = (QrtzTriggers) parameter.get("record");
        QrtzTriggersExample example = (QrtzTriggersExample) parameter.get("example");
        
        BEGIN();
        UPDATE("qrtz_triggers");
        
        if (record.getSchedName() != null) {
            SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerGroup() != null) {
            SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getJobName() != null) {
            SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getNextFireTime() != null) {
            SET("next_fire_time = #{record.nextFireTime,jdbcType=BIGINT}");
        }
        
        if (record.getPrevFireTime() != null) {
            SET("prev_fire_time = #{record.prevFireTime,jdbcType=BIGINT}");
        }
        
        if (record.getPriority() != null) {
            SET("priority = #{record.priority,jdbcType=INTEGER}");
        }
        
        if (record.getTriggerState() != null) {
            SET("trigger_state = #{record.triggerState,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerType() != null) {
            SET("trigger_type = #{record.triggerType,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            SET("start_time = #{record.startTime,jdbcType=BIGINT}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{record.endTime,jdbcType=BIGINT}");
        }
        
        if (record.getCalendarName() != null) {
            SET("calendar_name = #{record.calendarName,jdbcType=VARCHAR}");
        }
        
        if (record.getMisfireInstr() != null) {
            SET("misfire_instr = #{record.misfireInstr,jdbcType=SMALLINT}");
        }
        
        if (record.getJobData() != null) {
            SET("job_data = #{record.jobData,jdbcType=LONGVARBINARY}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("qrtz_triggers");
        
        SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        SET("next_fire_time = #{record.nextFireTime,jdbcType=BIGINT}");
        SET("prev_fire_time = #{record.prevFireTime,jdbcType=BIGINT}");
        SET("priority = #{record.priority,jdbcType=INTEGER}");
        SET("trigger_state = #{record.triggerState,jdbcType=VARCHAR}");
        SET("trigger_type = #{record.triggerType,jdbcType=VARCHAR}");
        SET("start_time = #{record.startTime,jdbcType=BIGINT}");
        SET("end_time = #{record.endTime,jdbcType=BIGINT}");
        SET("calendar_name = #{record.calendarName,jdbcType=VARCHAR}");
        SET("misfire_instr = #{record.misfireInstr,jdbcType=SMALLINT}");
        SET("job_data = #{record.jobData,jdbcType=LONGVARBINARY}");
        
        QrtzTriggersExample example = (QrtzTriggersExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("qrtz_triggers");
        
        SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        SET("trigger_name = #{record.triggerName,jdbcType=VARCHAR}");
        SET("trigger_group = #{record.triggerGroup,jdbcType=VARCHAR}");
        SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        SET("next_fire_time = #{record.nextFireTime,jdbcType=BIGINT}");
        SET("prev_fire_time = #{record.prevFireTime,jdbcType=BIGINT}");
        SET("priority = #{record.priority,jdbcType=INTEGER}");
        SET("trigger_state = #{record.triggerState,jdbcType=VARCHAR}");
        SET("trigger_type = #{record.triggerType,jdbcType=VARCHAR}");
        SET("start_time = #{record.startTime,jdbcType=BIGINT}");
        SET("end_time = #{record.endTime,jdbcType=BIGINT}");
        SET("calendar_name = #{record.calendarName,jdbcType=VARCHAR}");
        SET("misfire_instr = #{record.misfireInstr,jdbcType=SMALLINT}");
        
        QrtzTriggersExample example = (QrtzTriggersExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(QrtzTriggers record) {
        BEGIN();
        UPDATE("qrtz_triggers");
        
        if (record.getJobName() != null) {
            SET("job_name = #{jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            SET("job_group = #{jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getNextFireTime() != null) {
            SET("next_fire_time = #{nextFireTime,jdbcType=BIGINT}");
        }
        
        if (record.getPrevFireTime() != null) {
            SET("prev_fire_time = #{prevFireTime,jdbcType=BIGINT}");
        }
        
        if (record.getPriority() != null) {
            SET("priority = #{priority,jdbcType=INTEGER}");
        }
        
        if (record.getTriggerState() != null) {
            SET("trigger_state = #{triggerState,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerType() != null) {
            SET("trigger_type = #{triggerType,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            SET("start_time = #{startTime,jdbcType=BIGINT}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{endTime,jdbcType=BIGINT}");
        }
        
        if (record.getCalendarName() != null) {
            SET("calendar_name = #{calendarName,jdbcType=VARCHAR}");
        }
        
        if (record.getMisfireInstr() != null) {
            SET("misfire_instr = #{misfireInstr,jdbcType=SMALLINT}");
        }
        
        if (record.getJobData() != null) {
            SET("job_data = #{jobData,jdbcType=LONGVARBINARY}");
        }
        
        WHERE("sched_name = #{schedName,jdbcType=VARCHAR}");
        WHERE("trigger_name = #{triggerName,jdbcType=VARCHAR}");
        WHERE("trigger_group = #{triggerGroup,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(QrtzTriggersExample example, boolean includeExamplePhrase) {
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