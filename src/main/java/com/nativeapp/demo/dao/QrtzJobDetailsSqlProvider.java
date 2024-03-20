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

import com.nativeapp.demo.dao.QrtzJobDetails;
import com.nativeapp.demo.dao.QrtzJobDetailsExample.Criteria;
import com.nativeapp.demo.dao.QrtzJobDetailsExample.Criterion;
import com.nativeapp.demo.dao.QrtzJobDetailsExample;
import java.util.List;
import java.util.Map;

public class QrtzJobDetailsSqlProvider {

    public String countByExample(QrtzJobDetailsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("qrtz_job_details");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(QrtzJobDetailsExample example) {
        BEGIN();
        DELETE_FROM("qrtz_job_details");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(QrtzJobDetails record) {
        BEGIN();
        INSERT_INTO("qrtz_job_details");
        
        if (record.getSchedName() != null) {
            VALUES("sched_name", "#{schedName,jdbcType=VARCHAR}");
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
        
        if (record.getJobClassName() != null) {
            VALUES("job_class_name", "#{jobClassName,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDurable() != null) {
            VALUES("is_durable", "#{isDurable,jdbcType=VARCHAR}");
        }
        
        if (record.getIsNonconcurrent() != null) {
            VALUES("is_nonconcurrent", "#{isNonconcurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUpdateData() != null) {
            VALUES("is_update_data", "#{isUpdateData,jdbcType=VARCHAR}");
        }
        
        if (record.getRequestsRecovery() != null) {
            VALUES("requests_recovery", "#{requestsRecovery,jdbcType=VARCHAR}");
        }
        
        if (record.getJobData() != null) {
            VALUES("job_data", "#{jobData,jdbcType=LONGVARBINARY}");
        }
        
        return SQL();
    }

    public String selectByExampleWithBLOBs(QrtzJobDetailsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sched_name");
        } else {
            SELECT("sched_name");
        }
        SELECT("job_name");
        SELECT("job_group");
        SELECT("description");
        SELECT("job_class_name");
        SELECT("is_durable");
        SELECT("is_nonconcurrent");
        SELECT("is_update_data");
        SELECT("requests_recovery");
        SELECT("job_data");
        FROM("qrtz_job_details");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String selectByExample(QrtzJobDetailsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("sched_name");
        } else {
            SELECT("sched_name");
        }
        SELECT("job_name");
        SELECT("job_group");
        SELECT("description");
        SELECT("job_class_name");
        SELECT("is_durable");
        SELECT("is_nonconcurrent");
        SELECT("is_update_data");
        SELECT("requests_recovery");
        FROM("qrtz_job_details");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        QrtzJobDetails record = (QrtzJobDetails) parameter.get("record");
        QrtzJobDetailsExample example = (QrtzJobDetailsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("qrtz_job_details");
        
        if (record.getSchedName() != null) {
            SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
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
        
        if (record.getJobClassName() != null) {
            SET("job_class_name = #{record.jobClassName,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDurable() != null) {
            SET("is_durable = #{record.isDurable,jdbcType=VARCHAR}");
        }
        
        if (record.getIsNonconcurrent() != null) {
            SET("is_nonconcurrent = #{record.isNonconcurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUpdateData() != null) {
            SET("is_update_data = #{record.isUpdateData,jdbcType=VARCHAR}");
        }
        
        if (record.getRequestsRecovery() != null) {
            SET("requests_recovery = #{record.requestsRecovery,jdbcType=VARCHAR}");
        }
        
        if (record.getJobData() != null) {
            SET("job_data = #{record.jobData,jdbcType=LONGVARBINARY}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("qrtz_job_details");
        
        SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        SET("job_class_name = #{record.jobClassName,jdbcType=VARCHAR}");
        SET("is_durable = #{record.isDurable,jdbcType=VARCHAR}");
        SET("is_nonconcurrent = #{record.isNonconcurrent,jdbcType=VARCHAR}");
        SET("is_update_data = #{record.isUpdateData,jdbcType=VARCHAR}");
        SET("requests_recovery = #{record.requestsRecovery,jdbcType=VARCHAR}");
        SET("job_data = #{record.jobData,jdbcType=LONGVARBINARY}");
        
        QrtzJobDetailsExample example = (QrtzJobDetailsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("qrtz_job_details");
        
        SET("sched_name = #{record.schedName,jdbcType=VARCHAR}");
        SET("job_name = #{record.jobName,jdbcType=VARCHAR}");
        SET("job_group = #{record.jobGroup,jdbcType=VARCHAR}");
        SET("description = #{record.description,jdbcType=VARCHAR}");
        SET("job_class_name = #{record.jobClassName,jdbcType=VARCHAR}");
        SET("is_durable = #{record.isDurable,jdbcType=VARCHAR}");
        SET("is_nonconcurrent = #{record.isNonconcurrent,jdbcType=VARCHAR}");
        SET("is_update_data = #{record.isUpdateData,jdbcType=VARCHAR}");
        SET("requests_recovery = #{record.requestsRecovery,jdbcType=VARCHAR}");
        
        QrtzJobDetailsExample example = (QrtzJobDetailsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(QrtzJobDetails record) {
        BEGIN();
        UPDATE("qrtz_job_details");
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getJobClassName() != null) {
            SET("job_class_name = #{jobClassName,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDurable() != null) {
            SET("is_durable = #{isDurable,jdbcType=VARCHAR}");
        }
        
        if (record.getIsNonconcurrent() != null) {
            SET("is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUpdateData() != null) {
            SET("is_update_data = #{isUpdateData,jdbcType=VARCHAR}");
        }
        
        if (record.getRequestsRecovery() != null) {
            SET("requests_recovery = #{requestsRecovery,jdbcType=VARCHAR}");
        }
        
        if (record.getJobData() != null) {
            SET("job_data = #{jobData,jdbcType=LONGVARBINARY}");
        }
        
        WHERE("sched_name = #{schedName,jdbcType=VARCHAR}");
        WHERE("job_name = #{jobName,jdbcType=VARCHAR}");
        WHERE("job_group = #{jobGroup,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(QrtzJobDetailsExample example, boolean includeExamplePhrase) {
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