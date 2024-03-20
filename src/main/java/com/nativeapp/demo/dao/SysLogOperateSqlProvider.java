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

import com.nativeapp.demo.dao.SysLogOperate;
import com.nativeapp.demo.dao.SysLogOperateExample.Criteria;
import com.nativeapp.demo.dao.SysLogOperateExample.Criterion;
import com.nativeapp.demo.dao.SysLogOperateExample;
import java.util.List;
import java.util.Map;

public class SysLogOperateSqlProvider {

    public String countByExample(SysLogOperateExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sys_log_operate");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(SysLogOperateExample example) {
        BEGIN();
        DELETE_FROM("sys_log_operate");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(SysLogOperate record) {
        BEGIN();
        INSERT_INTO("sys_log_operate");
        
        if (record.getModule() != null) {
            VALUES("module", "#{module,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getReqUri() != null) {
            VALUES("req_uri", "#{reqUri,jdbcType=VARCHAR}");
        }
        
        if (record.getReqMethod() != null) {
            VALUES("req_method", "#{reqMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAgent() != null) {
            VALUES("user_agent", "#{userAgent,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateType() != null) {
            VALUES("operate_type", "#{operateType,jdbcType=TINYINT}");
        }
        
        if (record.getDuration() != null) {
            VALUES("duration", "#{duration,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRealName() != null) {
            VALUES("real_name", "#{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getResultMsg() != null) {
            VALUES("result_msg", "#{resultMsg,jdbcType=VARCHAR}");
        }
        
        if (record.getTenantId() != null) {
            VALUES("tenant_id", "#{tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReqParams() != null) {
            VALUES("req_params", "#{reqParams,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExampleWithBLOBs(SysLogOperateExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("module");
        SELECT("name");
        SELECT("req_uri");
        SELECT("req_method");
        SELECT("ip");
        SELECT("address");
        SELECT("user_agent");
        SELECT("operate_type");
        SELECT("duration");
        SELECT("status");
        SELECT("user_id");
        SELECT("real_name");
        SELECT("result_msg");
        SELECT("tenant_id");
        SELECT("create_time");
        SELECT("req_params");
        FROM("sys_log_operate");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String selectByExample(SysLogOperateExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("module");
        SELECT("name");
        SELECT("req_uri");
        SELECT("req_method");
        SELECT("ip");
        SELECT("address");
        SELECT("user_agent");
        SELECT("operate_type");
        SELECT("duration");
        SELECT("status");
        SELECT("user_id");
        SELECT("real_name");
        SELECT("result_msg");
        SELECT("tenant_id");
        SELECT("create_time");
        FROM("sys_log_operate");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysLogOperate record = (SysLogOperate) parameter.get("record");
        SysLogOperateExample example = (SysLogOperateExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sys_log_operate");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getModule() != null) {
            SET("module = #{record.module,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getReqUri() != null) {
            SET("req_uri = #{record.reqUri,jdbcType=VARCHAR}");
        }
        
        if (record.getReqMethod() != null) {
            SET("req_method = #{record.reqMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            SET("ip = #{record.ip,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAgent() != null) {
            SET("user_agent = #{record.userAgent,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateType() != null) {
            SET("operate_type = #{record.operateType,jdbcType=TINYINT}");
        }
        
        if (record.getDuration() != null) {
            SET("duration = #{record.duration,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getRealName() != null) {
            SET("real_name = #{record.realName,jdbcType=VARCHAR}");
        }
        
        if (record.getResultMsg() != null) {
            SET("result_msg = #{record.resultMsg,jdbcType=VARCHAR}");
        }
        
        if (record.getTenantId() != null) {
            SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReqParams() != null) {
            SET("req_params = #{record.reqParams,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sys_log_operate");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("module = #{record.module,jdbcType=VARCHAR}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("req_uri = #{record.reqUri,jdbcType=VARCHAR}");
        SET("req_method = #{record.reqMethod,jdbcType=VARCHAR}");
        SET("ip = #{record.ip,jdbcType=VARCHAR}");
        SET("address = #{record.address,jdbcType=VARCHAR}");
        SET("user_agent = #{record.userAgent,jdbcType=VARCHAR}");
        SET("operate_type = #{record.operateType,jdbcType=TINYINT}");
        SET("duration = #{record.duration,jdbcType=INTEGER}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("user_id = #{record.userId,jdbcType=BIGINT}");
        SET("real_name = #{record.realName,jdbcType=VARCHAR}");
        SET("result_msg = #{record.resultMsg,jdbcType=VARCHAR}");
        SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("req_params = #{record.reqParams,jdbcType=LONGVARCHAR}");
        
        SysLogOperateExample example = (SysLogOperateExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sys_log_operate");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("module = #{record.module,jdbcType=VARCHAR}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("req_uri = #{record.reqUri,jdbcType=VARCHAR}");
        SET("req_method = #{record.reqMethod,jdbcType=VARCHAR}");
        SET("ip = #{record.ip,jdbcType=VARCHAR}");
        SET("address = #{record.address,jdbcType=VARCHAR}");
        SET("user_agent = #{record.userAgent,jdbcType=VARCHAR}");
        SET("operate_type = #{record.operateType,jdbcType=TINYINT}");
        SET("duration = #{record.duration,jdbcType=INTEGER}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("user_id = #{record.userId,jdbcType=BIGINT}");
        SET("real_name = #{record.realName,jdbcType=VARCHAR}");
        SET("result_msg = #{record.resultMsg,jdbcType=VARCHAR}");
        SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        SysLogOperateExample example = (SysLogOperateExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(SysLogOperate record) {
        BEGIN();
        UPDATE("sys_log_operate");
        
        if (record.getModule() != null) {
            SET("module = #{module,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getReqUri() != null) {
            SET("req_uri = #{reqUri,jdbcType=VARCHAR}");
        }
        
        if (record.getReqMethod() != null) {
            SET("req_method = #{reqMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            SET("ip = #{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAgent() != null) {
            SET("user_agent = #{userAgent,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateType() != null) {
            SET("operate_type = #{operateType,jdbcType=TINYINT}");
        }
        
        if (record.getDuration() != null) {
            SET("duration = #{duration,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRealName() != null) {
            SET("real_name = #{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getResultMsg() != null) {
            SET("result_msg = #{resultMsg,jdbcType=VARCHAR}");
        }
        
        if (record.getTenantId() != null) {
            SET("tenant_id = #{tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReqParams() != null) {
            SET("req_params = #{reqParams,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(SysLogOperateExample example, boolean includeExamplePhrase) {
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