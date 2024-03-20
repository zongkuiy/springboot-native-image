package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysParams;
import com.nativeapp.demo.dao.SysParamsExample;
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

public interface SysParamsMapper {
    @SelectProvider(type=SysParamsSqlProvider.class, method="countByExample")
    int countByExample(SysParamsExample example);

    @DeleteProvider(type=SysParamsSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysParamsExample example);

    @Delete({
        "delete from sys_params",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_params (param_name, param_type, ",
        "param_key, param_value, ",
        "remark, tenant_id, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{paramName,jdbcType=VARCHAR}, #{paramType,jdbcType=TINYINT}, ",
        "#{paramKey,jdbcType=VARCHAR}, #{paramValue,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{tenantId,jdbcType=BIGINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysParams record);

    @InsertProvider(type=SysParamsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysParams record);

    @SelectProvider(type=SysParamsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="param_name", property="paramName", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_type", property="paramType", jdbcType=JdbcType.TINYINT),
        @Result(column="param_key", property="paramKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysParams> selectByExampleWithRowbounds(SysParamsExample example, RowBounds rowBounds);

    @SelectProvider(type=SysParamsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="param_name", property="paramName", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_type", property="paramType", jdbcType=JdbcType.TINYINT),
        @Result(column="param_key", property="paramKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysParams> selectByExample(SysParamsExample example);

    @Select({
        "select",
        "id, param_name, param_type, param_key, param_value, remark, tenant_id, version, ",
        "deleted, creator, create_time, updater, update_time",
        "from sys_params",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="param_name", property="paramName", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_type", property="paramType", jdbcType=JdbcType.TINYINT),
        @Result(column="param_key", property="paramKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="param_value", property="paramValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysParams selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysParamsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysParams record, @Param("example") SysParamsExample example);

    @UpdateProvider(type=SysParamsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysParams record, @Param("example") SysParamsExample example);

    @UpdateProvider(type=SysParamsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysParams record);

    @Update({
        "update sys_params",
        "set param_name = #{paramName,jdbcType=VARCHAR},",
          "param_type = #{paramType,jdbcType=TINYINT},",
          "param_key = #{paramKey,jdbcType=VARCHAR},",
          "param_value = #{paramValue,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysParams record);
}