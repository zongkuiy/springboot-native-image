package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysLogLogin;
import com.nativeapp.demo.dao.SysLogLoginExample;
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

public interface SysLogLoginMapper {
    @SelectProvider(type=SysLogLoginSqlProvider.class, method="countByExample")
    int countByExample(SysLogLoginExample example);

    @DeleteProvider(type=SysLogLoginSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysLogLoginExample example);

    @Delete({
        "delete from sys_log_login",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_log_login (username, ip, ",
        "address, user_agent, ",
        "status, operation, ",
        "tenant_id, create_time)",
        "values (#{username,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{userAgent,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{operation,jdbcType=TINYINT}, ",
        "#{tenantId,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysLogLogin record);

    @InsertProvider(type=SysLogLoginSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysLogLogin record);

    @SelectProvider(type=SysLogLoginSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="operation", property="operation", jdbcType=JdbcType.TINYINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysLogLogin> selectByExampleWithRowbounds(SysLogLoginExample example, RowBounds rowBounds);

    @SelectProvider(type=SysLogLoginSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="operation", property="operation", jdbcType=JdbcType.TINYINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysLogLogin> selectByExample(SysLogLoginExample example);

    @Select({
        "select",
        "id, username, ip, address, user_agent, status, operation, tenant_id, create_time",
        "from sys_log_login",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="operation", property="operation", jdbcType=JdbcType.TINYINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysLogLogin selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysLogLoginSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysLogLogin record, @Param("example") SysLogLoginExample example);

    @UpdateProvider(type=SysLogLoginSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysLogLogin record, @Param("example") SysLogLoginExample example);

    @UpdateProvider(type=SysLogLoginSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysLogLogin record);

    @Update({
        "update sys_log_login",
        "set username = #{username,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "user_agent = #{userAgent,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "operation = #{operation,jdbcType=TINYINT},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysLogLogin record);
}