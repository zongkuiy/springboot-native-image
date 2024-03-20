package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysThirdLogin;
import com.nativeapp.demo.dao.SysThirdLoginExample;
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

public interface SysThirdLoginMapper {
    @SelectProvider(type=SysThirdLoginSqlProvider.class, method="countByExample")
    int countByExample(SysThirdLoginExample example);

    @DeleteProvider(type=SysThirdLoginSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysThirdLoginExample example);

    @Delete({
        "delete from sys_third_login",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_third_login (open_type, open_id, ",
        "username, user_id, ",
        "tenant_id, version, ",
        "deleted, create_time)",
        "values (#{openType,jdbcType=VARCHAR}, #{openId,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{tenantId,jdbcType=BIGINT}, #{version,jdbcType=INTEGER}, ",
        "#{deleted,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysThirdLogin record);

    @InsertProvider(type=SysThirdLoginSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysThirdLogin record);

    @SelectProvider(type=SysThirdLoginSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="open_type", property="openType", jdbcType=JdbcType.VARCHAR),
        @Result(column="open_id", property="openId", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysThirdLogin> selectByExampleWithRowbounds(SysThirdLoginExample example, RowBounds rowBounds);

    @SelectProvider(type=SysThirdLoginSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="open_type", property="openType", jdbcType=JdbcType.VARCHAR),
        @Result(column="open_id", property="openId", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysThirdLogin> selectByExample(SysThirdLoginExample example);

    @Select({
        "select",
        "id, open_type, open_id, username, user_id, tenant_id, version, deleted, create_time",
        "from sys_third_login",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="open_type", property="openType", jdbcType=JdbcType.VARCHAR),
        @Result(column="open_id", property="openId", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysThirdLogin selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysThirdLoginSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysThirdLogin record, @Param("example") SysThirdLoginExample example);

    @UpdateProvider(type=SysThirdLoginSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysThirdLogin record, @Param("example") SysThirdLoginExample example);

    @UpdateProvider(type=SysThirdLoginSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysThirdLogin record);

    @Update({
        "update sys_third_login",
        "set open_type = #{openType,jdbcType=VARCHAR},",
          "open_id = #{openId,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysThirdLogin record);
}