package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysPost;
import com.nativeapp.demo.dao.SysPostExample;
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

public interface SysPostMapper {
    @SelectProvider(type=SysPostSqlProvider.class, method="countByExample")
    int countByExample(SysPostExample example);

    @DeleteProvider(type=SysPostSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysPostExample example);

    @Delete({
        "delete from sys_post",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_post (post_code, post_name, ",
        "sort, status, tenant_id, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{postCode,jdbcType=VARCHAR}, #{postName,jdbcType=VARCHAR}, ",
        "#{sort,jdbcType=INTEGER}, #{status,jdbcType=TINYINT}, #{tenantId,jdbcType=BIGINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysPost record);

    @InsertProvider(type=SysPostSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysPost record);

    @SelectProvider(type=SysPostSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="post_code", property="postCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="post_name", property="postName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysPost> selectByExampleWithRowbounds(SysPostExample example, RowBounds rowBounds);

    @SelectProvider(type=SysPostSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="post_code", property="postCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="post_name", property="postName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysPost> selectByExample(SysPostExample example);

    @Select({
        "select",
        "id, post_code, post_name, sort, status, tenant_id, version, deleted, creator, ",
        "create_time, updater, update_time",
        "from sys_post",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="post_code", property="postCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="post_name", property="postName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysPost selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysPostSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysPost record, @Param("example") SysPostExample example);

    @UpdateProvider(type=SysPostSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysPost record, @Param("example") SysPostExample example);

    @UpdateProvider(type=SysPostSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysPost record);

    @Update({
        "update sys_post",
        "set post_code = #{postCode,jdbcType=VARCHAR},",
          "post_name = #{postName,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysPost record);
}