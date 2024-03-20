package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysUserPost;
import com.nativeapp.demo.dao.SysUserPostExample;
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

public interface SysUserPostMapper {
    @SelectProvider(type=SysUserPostSqlProvider.class, method="countByExample")
    int countByExample(SysUserPostExample example);

    @DeleteProvider(type=SysUserPostSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysUserPostExample example);

    @Delete({
        "delete from sys_user_post",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_user_post (user_id, post_id, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{userId,jdbcType=BIGINT}, #{postId,jdbcType=BIGINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysUserPost record);

    @InsertProvider(type=SysUserPostSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysUserPost record);

    @SelectProvider(type=SysUserPostSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysUserPost> selectByExampleWithRowbounds(SysUserPostExample example, RowBounds rowBounds);

    @SelectProvider(type=SysUserPostSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysUserPost> selectByExample(SysUserPostExample example);

    @Select({
        "select",
        "id, user_id, post_id, version, deleted, creator, create_time, updater, update_time",
        "from sys_user_post",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysUserPost selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysUserPostSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysUserPost record, @Param("example") SysUserPostExample example);

    @UpdateProvider(type=SysUserPostSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysUserPost record, @Param("example") SysUserPostExample example);

    @UpdateProvider(type=SysUserPostSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysUserPost record);

    @Update({
        "update sys_user_post",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysUserPost record);
}