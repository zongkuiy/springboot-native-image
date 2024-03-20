package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysUserToken;
import com.nativeapp.demo.dao.SysUserTokenExample;
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

public interface SysUserTokenMapper {
    @SelectProvider(type=SysUserTokenSqlProvider.class, method="countByExample")
    int countByExample(SysUserTokenExample example);

    @DeleteProvider(type=SysUserTokenSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysUserTokenExample example);

    @Delete({
        "delete from sys_user_token",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_user_token (user_id, access_token, ",
        "access_token_expire, refresh_token, ",
        "refresh_token_expire, tenant_id, ",
        "create_time)",
        "values (#{userId,jdbcType=BIGINT}, #{accessToken,jdbcType=VARCHAR}, ",
        "#{accessTokenExpire,jdbcType=TIMESTAMP}, #{refreshToken,jdbcType=VARCHAR}, ",
        "#{refreshTokenExpire,jdbcType=TIMESTAMP}, #{tenantId,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysUserToken record);

    @InsertProvider(type=SysUserTokenSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysUserToken record);

    @SelectProvider(type=SysUserTokenSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="access_token", property="accessToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_token_expire", property="accessTokenExpire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="refresh_token", property="refreshToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="refresh_token_expire", property="refreshTokenExpire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysUserToken> selectByExampleWithRowbounds(SysUserTokenExample example, RowBounds rowBounds);

    @SelectProvider(type=SysUserTokenSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="access_token", property="accessToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_token_expire", property="accessTokenExpire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="refresh_token", property="refreshToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="refresh_token_expire", property="refreshTokenExpire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysUserToken> selectByExample(SysUserTokenExample example);

    @Select({
        "select",
        "id, user_id, access_token, access_token_expire, refresh_token, refresh_token_expire, ",
        "tenant_id, create_time",
        "from sys_user_token",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="access_token", property="accessToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_token_expire", property="accessTokenExpire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="refresh_token", property="refreshToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="refresh_token_expire", property="refreshTokenExpire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysUserToken selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysUserTokenSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysUserToken record, @Param("example") SysUserTokenExample example);

    @UpdateProvider(type=SysUserTokenSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysUserToken record, @Param("example") SysUserTokenExample example);

    @UpdateProvider(type=SysUserTokenSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysUserToken record);

    @Update({
        "update sys_user_token",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "access_token = #{accessToken,jdbcType=VARCHAR},",
          "access_token_expire = #{accessTokenExpire,jdbcType=TIMESTAMP},",
          "refresh_token = #{refreshToken,jdbcType=VARCHAR},",
          "refresh_token_expire = #{refreshTokenExpire,jdbcType=TIMESTAMP},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysUserToken record);
}