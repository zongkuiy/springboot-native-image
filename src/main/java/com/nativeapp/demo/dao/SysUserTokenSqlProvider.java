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

import com.nativeapp.demo.dao.SysUserToken;
import com.nativeapp.demo.dao.SysUserTokenExample.Criteria;
import com.nativeapp.demo.dao.SysUserTokenExample.Criterion;
import com.nativeapp.demo.dao.SysUserTokenExample;
import java.util.List;
import java.util.Map;

public class SysUserTokenSqlProvider {

    public String countByExample(SysUserTokenExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sys_user_token");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(SysUserTokenExample example) {
        BEGIN();
        DELETE_FROM("sys_user_token");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(SysUserToken record) {
        BEGIN();
        INSERT_INTO("sys_user_token");
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getAccessToken() != null) {
            VALUES("access_token", "#{accessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessTokenExpire() != null) {
            VALUES("access_token_expire", "#{accessTokenExpire,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefreshToken() != null) {
            VALUES("refresh_token", "#{refreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getRefreshTokenExpire() != null) {
            VALUES("refresh_token_expire", "#{refreshTokenExpire,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTenantId() != null) {
            VALUES("tenant_id", "#{tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(SysUserTokenExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("user_id");
        SELECT("access_token");
        SELECT("access_token_expire");
        SELECT("refresh_token");
        SELECT("refresh_token_expire");
        SELECT("tenant_id");
        SELECT("create_time");
        FROM("sys_user_token");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SysUserToken record = (SysUserToken) parameter.get("record");
        SysUserTokenExample example = (SysUserTokenExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sys_user_token");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getAccessToken() != null) {
            SET("access_token = #{record.accessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessTokenExpire() != null) {
            SET("access_token_expire = #{record.accessTokenExpire,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefreshToken() != null) {
            SET("refresh_token = #{record.refreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getRefreshTokenExpire() != null) {
            SET("refresh_token_expire = #{record.refreshTokenExpire,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTenantId() != null) {
            SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("sys_user_token");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("user_id = #{record.userId,jdbcType=BIGINT}");
        SET("access_token = #{record.accessToken,jdbcType=VARCHAR}");
        SET("access_token_expire = #{record.accessTokenExpire,jdbcType=TIMESTAMP}");
        SET("refresh_token = #{record.refreshToken,jdbcType=VARCHAR}");
        SET("refresh_token_expire = #{record.refreshTokenExpire,jdbcType=TIMESTAMP}");
        SET("tenant_id = #{record.tenantId,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        SysUserTokenExample example = (SysUserTokenExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(SysUserToken record) {
        BEGIN();
        UPDATE("sys_user_token");
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getAccessToken() != null) {
            SET("access_token = #{accessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessTokenExpire() != null) {
            SET("access_token_expire = #{accessTokenExpire,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRefreshToken() != null) {
            SET("refresh_token = #{refreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getRefreshTokenExpire() != null) {
            SET("refresh_token_expire = #{refreshTokenExpire,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTenantId() != null) {
            SET("tenant_id = #{tenantId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(SysUserTokenExample example, boolean includeExamplePhrase) {
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