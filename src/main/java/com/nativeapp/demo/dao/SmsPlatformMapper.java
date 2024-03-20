package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SmsPlatform;
import com.nativeapp.demo.dao.SmsPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface SmsPlatformMapper {
    @SelectProvider(type=SmsPlatformSqlProvider.class, method="countByExample")
    int countByExample(SmsPlatformExample example);

    @DeleteProvider(type=SmsPlatformSqlProvider.class, method="deleteByExample")
    int deleteByExample(SmsPlatformExample example);

    @Delete({
        "delete from sms_platform",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sms_platform (platform, sign_name, ",
        "template_id, app_id, ",
        "sender_id, url, access_key, ",
        "secret_key, status, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{platform,jdbcType=TINYINT}, #{signName,jdbcType=VARCHAR}, ",
        "#{templateId,jdbcType=VARCHAR}, #{appId,jdbcType=VARCHAR}, ",
        "#{senderId,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{accessKey,jdbcType=VARCHAR}, ",
        "#{secretKey,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SmsPlatform record);

    @InsertProvider(type=SmsPlatformSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SmsPlatform record);

    @SelectProvider(type=SmsPlatformSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="sign_name", property="signName", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sender_id", property="senderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_key", property="accessKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="secret_key", property="secretKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsPlatform> selectByExampleWithRowbounds(SmsPlatformExample example, RowBounds rowBounds);

    @SelectProvider(type=SmsPlatformSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="sign_name", property="signName", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sender_id", property="senderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_key", property="accessKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="secret_key", property="secretKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsPlatform> selectByExample(SmsPlatformExample example);

    @Select({
        "select",
        "id, platform, sign_name, template_id, app_id, sender_id, url, access_key, secret_key, ",
        "status, version, deleted, creator, create_time, updater, update_time",
        "from sms_platform",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="sign_name", property="signName", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="sender_id", property="senderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_key", property="accessKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="secret_key", property="secretKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SmsPlatform selectByPrimaryKey(Long id);

    @UpdateProvider(type=SmsPlatformSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SmsPlatform record, @Param("example") SmsPlatformExample example);

    @UpdateProvider(type=SmsPlatformSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SmsPlatform record, @Param("example") SmsPlatformExample example);

    @UpdateProvider(type=SmsPlatformSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SmsPlatform record);

    @Update({
        "update sms_platform",
        "set platform = #{platform,jdbcType=TINYINT},",
          "sign_name = #{signName,jdbcType=VARCHAR},",
          "template_id = #{templateId,jdbcType=VARCHAR},",
          "app_id = #{appId,jdbcType=VARCHAR},",
          "sender_id = #{senderId,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "access_key = #{accessKey,jdbcType=VARCHAR},",
          "secret_key = #{secretKey,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SmsPlatform record);
}