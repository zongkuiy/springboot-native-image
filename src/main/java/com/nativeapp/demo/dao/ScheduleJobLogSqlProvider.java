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

import com.nativeapp.demo.dao.ScheduleJobLog;
import com.nativeapp.demo.dao.ScheduleJobLogExample.Criteria;
import com.nativeapp.demo.dao.ScheduleJobLogExample.Criterion;
import com.nativeapp.demo.dao.ScheduleJobLogExample;
import java.util.List;
import java.util.Map;

public class ScheduleJobLogSqlProvider {

    public String countByExample(ScheduleJobLogExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("schedule_job_log");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ScheduleJobLogExample example) {
        BEGIN();
        DELETE_FROM("schedule_job_log");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(ScheduleJobLog record) {
        BEGIN();
        INSERT_INTO("schedule_job_log");
        
        if (record.getJobId() != null) {
            VALUES("job_id", "#{jobId,jdbcType=BIGINT}");
        }
        
        if (record.getJobName() != null) {
            VALUES("job_name", "#{jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            VALUES("job_group", "#{jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getBeanName() != null) {
            VALUES("bean_name", "#{beanName,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            VALUES("method", "#{method,jdbcType=VARCHAR}");
        }
        
        if (record.getParams() != null) {
            VALUES("params", "#{params,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getError() != null) {
            VALUES("error", "#{error,jdbcType=VARCHAR}");
        }
        
        if (record.getTimes() != null) {
            VALUES("times", "#{times,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(ScheduleJobLogExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("job_id");
        SELECT("job_name");
        SELECT("job_group");
        SELECT("bean_name");
        SELECT("method");
        SELECT("params");
        SELECT("status");
        SELECT("error");
        SELECT("times");
        SELECT("create_time");
        FROM("schedule_job_log");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ScheduleJobLog record = (ScheduleJobLog) parameter.get("record");
        ScheduleJobLogExample example = (ScheduleJobLogExample) parameter.get("example");
        
        BEGIN();
        UPDATE("schedule_job_log");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getJobId() != null) {
            SET("job_id = #{record.jobId,jdbcType=BIGINT}");
        }
        
        if (record.getJobName() != null) {
            SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getBeanName() != null) {
            SET("bean_name = #{record.beanName,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            SET("method = #{record.method,jdbcType=VARCHAR}");
        }
        
        if (record.getParams() != null) {
            SET("params = #{record.params,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getError() != null) {
            SET("error = #{record.error,jdbcType=VARCHAR}");
        }
        
        if (record.getTimes() != null) {
            SET("times = #{record.times,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("schedule_job_log");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("job_id = #{record.jobId,jdbcType=BIGINT}");
        SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        SET("bean_name = #{record.beanName,jdbcType=VARCHAR}");
        SET("method = #{record.method,jdbcType=VARCHAR}");
        SET("params = #{record.params,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("error = #{record.error,jdbcType=VARCHAR}");
        SET("times = #{record.times,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        ScheduleJobLogExample example = (ScheduleJobLogExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(ScheduleJobLog record) {
        BEGIN();
        UPDATE("schedule_job_log");
        
        if (record.getJobId() != null) {
            SET("job_id = #{jobId,jdbcType=BIGINT}");
        }
        
        if (record.getJobName() != null) {
            SET("job_name = #{jobName,jdbcType=VARCHAR}");
        }
        
        if (record.getJobGroup() != null) {
            SET("job_group = #{jobGroup,jdbcType=VARCHAR}");
        }
        
        if (record.getBeanName() != null) {
            SET("bean_name = #{beanName,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            SET("method = #{method,jdbcType=VARCHAR}");
        }
        
        if (record.getParams() != null) {
            SET("params = #{params,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getError() != null) {
            SET("error = #{error,jdbcType=VARCHAR}");
        }
        
        if (record.getTimes() != null) {
            SET("times = #{times,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(ScheduleJobLogExample example, boolean includeExamplePhrase) {
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