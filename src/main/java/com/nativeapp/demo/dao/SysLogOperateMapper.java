package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysLogOperate;
import com.nativeapp.demo.dao.SysLogOperateExample;
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

public interface SysLogOperateMapper {
    @SelectProvider(type=SysLogOperateSqlProvider.class, method="countByExample")
    int countByExample(SysLogOperateExample example);

    @DeleteProvider(type=SysLogOperateSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysLogOperateExample example);

    @Delete({
        "delete from sys_log_operate",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_log_operate (module, name, ",
        "req_uri, req_method, ",
        "ip, address, user_agent, ",
        "operate_type, duration, ",
        "status, user_id, real_name, ",
        "result_msg, tenant_id, ",
        "create_time, req_params)",
        "values (#{module,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{reqUri,jdbcType=VARCHAR}, #{reqMethod,jdbcType=VARCHAR}, ",
        "#{ip,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, #{userAgent,jdbcType=VARCHAR}, ",
        "#{operateType,jdbcType=TINYINT}, #{duration,jdbcType=INTEGER}, ",
        "#{status,jdbcType=TINYINT}, #{userId,jdbcType=BIGINT}, #{realName,jdbcType=VARCHAR}, ",
        "#{resultMsg,jdbcType=VARCHAR}, #{tenantId,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{reqParams,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysLogOperate record);

    @InsertProvider(type=SysLogOperateSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysLogOperate record);

    @SelectProvider(type=SysLogOperateSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="module", property="module", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_uri", property="reqUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_method", property="reqMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.TINYINT),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="result_msg", property="resultMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="req_params", property="reqParams", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SysLogOperate> selectByExampleWithBLOBsWithRowbounds(SysLogOperateExample example, RowBounds rowBounds);

    @SelectProvider(type=SysLogOperateSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="module", property="module", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_uri", property="reqUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_method", property="reqMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.TINYINT),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="result_msg", property="resultMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="req_params", property="reqParams", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SysLogOperate> selectByExampleWithBLOBs(SysLogOperateExample example);

    @SelectProvider(type=SysLogOperateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="module", property="module", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_uri", property="reqUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_method", property="reqMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.TINYINT),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="result_msg", property="resultMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysLogOperate> selectByExampleWithRowbounds(SysLogOperateExample example, RowBounds rowBounds);

    @SelectProvider(type=SysLogOperateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="module", property="module", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_uri", property="reqUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_method", property="reqMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.TINYINT),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="result_msg", property="resultMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysLogOperate> selectByExample(SysLogOperateExample example);

    @Select({
        "select",
        "id, module, name, req_uri, req_method, ip, address, user_agent, operate_type, ",
        "duration, status, user_id, real_name, result_msg, tenant_id, create_time, req_params",
        "from sys_log_operate",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="module", property="module", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_uri", property="reqUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="req_method", property="reqMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_type", property="operateType", jdbcType=JdbcType.TINYINT),
        @Result(column="duration", property="duration", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="result_msg", property="resultMsg", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="req_params", property="reqParams", jdbcType=JdbcType.LONGVARCHAR)
    })
    SysLogOperate selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysLogOperateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysLogOperate record, @Param("example") SysLogOperateExample example);

    @UpdateProvider(type=SysLogOperateSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") SysLogOperate record, @Param("example") SysLogOperateExample example);

    @UpdateProvider(type=SysLogOperateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysLogOperate record, @Param("example") SysLogOperateExample example);

    @UpdateProvider(type=SysLogOperateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysLogOperate record);

    @Update({
        "update sys_log_operate",
        "set module = #{module,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "req_uri = #{reqUri,jdbcType=VARCHAR},",
          "req_method = #{reqMethod,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "user_agent = #{userAgent,jdbcType=VARCHAR},",
          "operate_type = #{operateType,jdbcType=TINYINT},",
          "duration = #{duration,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "real_name = #{realName,jdbcType=VARCHAR},",
          "result_msg = #{resultMsg,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "req_params = #{reqParams,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(SysLogOperate record);

    @Update({
        "update sys_log_operate",
        "set module = #{module,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "req_uri = #{reqUri,jdbcType=VARCHAR},",
          "req_method = #{reqMethod,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "user_agent = #{userAgent,jdbcType=VARCHAR},",
          "operate_type = #{operateType,jdbcType=TINYINT},",
          "duration = #{duration,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "real_name = #{realName,jdbcType=VARCHAR},",
          "result_msg = #{resultMsg,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysLogOperate record);
}