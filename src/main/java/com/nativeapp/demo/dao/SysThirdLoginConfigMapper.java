package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysThirdLoginConfig;
import com.nativeapp.demo.dao.SysThirdLoginConfigExample;
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

public interface SysThirdLoginConfigMapper {
    @SelectProvider(type=SysThirdLoginConfigSqlProvider.class, method="countByExample")
    int countByExample(SysThirdLoginConfigExample example);

    @DeleteProvider(type=SysThirdLoginConfigSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysThirdLoginConfigExample example);

    @Delete({
        "delete from sys_third_login_config",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_third_login_config (open_type, client_id, ",
        "client_secret, redirect_uri, ",
        "agent_id, tenant_id, ",
        "version, deleted, ",
        "create_time)",
        "values (#{openType,jdbcType=VARCHAR}, #{clientId,jdbcType=VARCHAR}, ",
        "#{clientSecret,jdbcType=VARCHAR}, #{redirectUri,jdbcType=VARCHAR}, ",
        "#{agentId,jdbcType=VARCHAR}, #{tenantId,jdbcType=BIGINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysThirdLoginConfig record);

    @InsertProvider(type=SysThirdLoginConfigSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysThirdLoginConfig record);

    @SelectProvider(type=SysThirdLoginConfigSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="open_type", property="openType", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_secret", property="clientSecret", jdbcType=JdbcType.VARCHAR),
        @Result(column="redirect_uri", property="redirectUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysThirdLoginConfig> selectByExampleWithRowbounds(SysThirdLoginConfigExample example, RowBounds rowBounds);

    @SelectProvider(type=SysThirdLoginConfigSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="open_type", property="openType", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_secret", property="clientSecret", jdbcType=JdbcType.VARCHAR),
        @Result(column="redirect_uri", property="redirectUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysThirdLoginConfig> selectByExample(SysThirdLoginConfigExample example);

    @Select({
        "select",
        "id, open_type, client_id, client_secret, redirect_uri, agent_id, tenant_id, ",
        "version, deleted, create_time",
        "from sys_third_login_config",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="open_type", property="openType", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_secret", property="clientSecret", jdbcType=JdbcType.VARCHAR),
        @Result(column="redirect_uri", property="redirectUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysThirdLoginConfig selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysThirdLoginConfigSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysThirdLoginConfig record, @Param("example") SysThirdLoginConfigExample example);

    @UpdateProvider(type=SysThirdLoginConfigSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysThirdLoginConfig record, @Param("example") SysThirdLoginConfigExample example);

    @UpdateProvider(type=SysThirdLoginConfigSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysThirdLoginConfig record);

    @Update({
        "update sys_third_login_config",
        "set open_type = #{openType,jdbcType=VARCHAR},",
          "client_id = #{clientId,jdbcType=VARCHAR},",
          "client_secret = #{clientSecret,jdbcType=VARCHAR},",
          "redirect_uri = #{redirectUri,jdbcType=VARCHAR},",
          "agent_id = #{agentId,jdbcType=VARCHAR},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysThirdLoginConfig record);
}