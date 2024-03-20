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

import com.nativeapp.demo.dao.SmsPlatform;
import com.nativeapp.demo.dao.SmsPlatformExample.Criteria;
import com.nativeapp.demo.dao.SmsPlatformExample.Criterion;
import com.nativeapp.demo.dao.SmsPlatformExample;
import java.util.List;
import java.util.Map;

public class SmsPlatformSqlProvider {

    public String countByExample(SmsPlatformExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("sms_platform");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(SmsPlatformExample example) {
        BEGIN();
        DELETE_FROM("sms_platform");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(SmsPlatform record) {
        BEGIN();
        INSERT_INTO("sms_platform");
        
        if (record.getPlatform() != null) {
            VALUES("platform", "#{platform,jdbcType=TINYINT}");
        }
        
        if (record.getSignName() != null) {
            VALUES("sign_name", "#{signName,jdbcType=VARCHAR}");
        }
        
        if (record.getTemplateId() != null) {
            VALUES("template_id", "#{templateId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            VALUES("app_id", "#{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderId() != null) {
            VALUES("sender_id", "#{senderId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessKey() != null) {
            VALUES("access_key", "#{accessKey,jdbcType=VARCHAR}");
        }
        
        if (record.getSecretKey() != null) {
            VALUES("secret_key", "#{secretKey,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=TINYINT}");
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

    public String selectByExample(SmsPlatformExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("platform");
        SELECT("sign_name");
        SELECT("template_id");
        SELECT("app_id");
        SELECT("sender_id");
        SELECT("url");
        SELECT("access_key");
        SELECT("secret_key");
        SELECT("status");
        SELECT("version");
        SELECT("deleted");
        SELECT("creator");
        SELECT("create_time");
        SELECT("updater");
        SELECT("update_time");
        FROM("sms_platform");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SmsPlatform record = (SmsPlatform) parameter.get("record");
        SmsPlatformExample example = (SmsPlatformExample) parameter.get("example");
        
        BEGIN();
        UPDATE("sms_platform");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getPlatform() != null) {
            SET("platform = #{record.platform,jdbcType=TINYINT}");
        }
        
        if (record.getSignName() != null) {
            SET("sign_name = #{record.signName,jdbcType=VARCHAR}");
        }
        
        if (record.getTemplateId() != null) {
            SET("template_id = #{record.templateId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderId() != null) {
            SET("sender_id = #{record.senderId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("url = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessKey() != null) {
            SET("access_key = #{record.accessKey,jdbcType=VARCHAR}");
        }
        
        if (record.getSecretKey() != null) {
            SET("secret_key = #{record.secretKey,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=TINYINT}");
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
        UPDATE("sms_platform");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("platform = #{record.platform,jdbcType=TINYINT}");
        SET("sign_name = #{record.signName,jdbcType=VARCHAR}");
        SET("template_id = #{record.templateId,jdbcType=VARCHAR}");
        SET("app_id = #{record.appId,jdbcType=VARCHAR}");
        SET("sender_id = #{record.senderId,jdbcType=VARCHAR}");
        SET("url = #{record.url,jdbcType=VARCHAR}");
        SET("access_key = #{record.accessKey,jdbcType=VARCHAR}");
        SET("secret_key = #{record.secretKey,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=TINYINT}");
        SET("version = #{record.version,jdbcType=INTEGER}");
        SET("deleted = #{record.deleted,jdbcType=TINYINT}");
        SET("creator = #{record.creator,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("updater = #{record.updater,jdbcType=BIGINT}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        SmsPlatformExample example = (SmsPlatformExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(SmsPlatform record) {
        BEGIN();
        UPDATE("sms_platform");
        
        if (record.getPlatform() != null) {
            SET("platform = #{platform,jdbcType=TINYINT}");
        }
        
        if (record.getSignName() != null) {
            SET("sign_name = #{signName,jdbcType=VARCHAR}");
        }
        
        if (record.getTemplateId() != null) {
            SET("template_id = #{templateId,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            SET("app_id = #{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderId() != null) {
            SET("sender_id = #{senderId,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("url = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessKey() != null) {
            SET("access_key = #{accessKey,jdbcType=VARCHAR}");
        }
        
        if (record.getSecretKey() != null) {
            SET("secret_key = #{secretKey,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=TINYINT}");
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

    protected void applyWhere(SmsPlatformExample example, boolean includeExamplePhrase) {
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