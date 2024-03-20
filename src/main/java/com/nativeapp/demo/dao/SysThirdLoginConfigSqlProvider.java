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

import com.nativeapp.demo.dao.SysThirdLoginConfig;
import com.nativeapp.demo.dao.SysThirdLoginConfigExample.Criteria;
import com.nativeapp.demo.dao.SysThirdLoginConfigExample.Criterion;
import com.nativeapp.demo.dao.SysThirdLoginConfigExample;
import java.util.List;
import java.util.Map;

public class SysThirdLoginConfigSqlProvider {

    public String countByExample(SysThirdLoginConfigExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sys_third_login_config");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(SysThirdLoginConfigExample example) {
        BEGIN();
        DELETE_FROM("sys_third_login_config");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(SysThirdLoginConfig record) {
        BEGIN();
        INSERT_INTO("sys_third_login_config");
        
        if (record.getOpenType() != null) {
            VALUES("open_type", "#{openType,jdbcType=VARCHAR}");
        }
        
        if (record.getClientId() != null) {
            VALUES("client_id", "#{clientId,jdbcType=VARCHAR}");
        }
        
        if (record.getClientSecret() != null) {
            VALUES("client_secret", "#{clientSecret,jdbcType=VARCHAR}");
        }
        
        if (record.getRedirectUri() != null) {
            VALUES("redirect_uri", "#{redirectUri,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentId() != null) {
            VALUES("agent_id", "#{agentId,jdbcType=VARCHAR}");
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
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(SysThirdLoginConfigExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("open_type");
        SELECT("client_id");
        SELECT("client_secret");
        SELECT("redirect_uri");
        SELECT("agent_id");
        SELECT("tenant_id");
        SELECT("version");
        SELECT("deleted");
        SELECT("create_time");
        FROM("sys_third_login_config");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysThirdLoginConfig record = (SysThirdLoginConfig) parameter.get("record");
        SysThirdLoginConfigExample example = (SysThirdLoginConfigExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sys_third_login_config");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getOpenType() != null) {
            SET("open_type = #{record.openType,jdbcType=VARCHAR}");
        }
        
        if (record.getClientId() != null) {
            SET("client_id = #{record.clientId,jdbcType=VARCHAR}");
        }
        
        if (record.getClientSecret() != null) {
            SET("client_secret = #{record.clientSecret,jdbcType=VARCHAR}");
        }
        
        if (record.getRedirectUri() != null) {
            SET("redirect_uri = #{record.redirectUri,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentId() != null) {
            SET("agent_id = #{record.agentId,jdbcType=VARCHAR}");
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
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sys_third_login_config");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("open_type = #{record.openType,jdbcType=VARCHAR}");
        SET("client_id = #{record.clientId,jdbcType=VARCHAR}");
        SET("client_secret = #{record.clientSecret,jdbcType=VARCHAR}");
        SET("redirect_uri = #{record.redirectUri,jdbcType=VARCHAR}");
        SET("agent_id = #{record.agentId,jdbcType=VARCHAR}");
        SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        SET("version = #{record.version,jdbcType=INTEGER}");
        SET("deleted = #{record.deleted,jdbcType=TINYINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        SysThirdLoginConfigExample example = (SysThirdLoginConfigExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(SysThirdLoginConfig record) {
        BEGIN();
        UPDATE("sys_third_login_config");
        
        if (record.getOpenType() != null) {
            SET("open_type = #{openType,jdbcType=VARCHAR}");
        }
        
        if (record.getClientId() != null) {
            SET("client_id = #{clientId,jdbcType=VARCHAR}");
        }
        
        if (record.getClientSecret() != null) {
            SET("client_secret = #{clientSecret,jdbcType=VARCHAR}");
        }
        
        if (record.getRedirectUri() != null) {
            SET("redirect_uri = #{redirectUri,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentId() != null) {
            SET("agent_id = #{agentId,jdbcType=VARCHAR}");
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
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(SysThirdLoginConfigExample example, boolean includeExamplePhrase) {
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