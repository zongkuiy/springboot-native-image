package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SmsLog;
import com.nativeapp.demo.dao.SmsLogExample;
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

public interface SmsLogMapper {
    @SelectProvider(type=SmsLogSqlProvider.class, method="countByExample")
    int countByExample(SmsLogExample example);

    @DeleteProvider(type=SmsLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(SmsLogExample example);

    @Delete({
        "delete from sms_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sms_log (platform_id, platform, ",
        "mobile, params, ",
        "status, error, create_time)",
        "values (#{platformId,jdbcType=BIGINT}, #{platform,jdbcType=TINYINT}, ",
        "#{mobile,jdbcType=VARCHAR}, #{params,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{error,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SmsLog record);

    @InsertProvider(type=SmsLogSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SmsLog record);

    @SelectProvider(type=SmsLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="error", property="error", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsLog> selectByExampleWithRowbounds(SmsLogExample example, RowBounds rowBounds);

    @SelectProvider(type=SmsLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="error", property="error", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsLog> selectByExample(SmsLogExample example);

    @Select({
        "select",
        "id, platform_id, platform, mobile, params, status, error, create_time",
        "from sms_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="error", property="error", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SmsLog selectByPrimaryKey(Long id);

    @UpdateProvider(type=SmsLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SmsLog record, @Param("example") SmsLogExample example);

    @UpdateProvider(type=SmsLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SmsLog record, @Param("example") SmsLogExample example);

    @UpdateProvider(type=SmsLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SmsLog record);

    @Update({
        "update sms_log",
        "set platform_id = #{platformId,jdbcType=BIGINT},",
          "platform = #{platform,jdbcType=TINYINT},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "params = #{params,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "error = #{error,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SmsLog record);
}