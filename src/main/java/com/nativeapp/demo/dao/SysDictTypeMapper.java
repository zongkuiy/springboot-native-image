package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysDictType;
import com.nativeapp.demo.dao.SysDictTypeExample;
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

public interface SysDictTypeMapper {
    @SelectProvider(type=SysDictTypeSqlProvider.class, method="countByExample")
    int countByExample(SysDictTypeExample example);

    @DeleteProvider(type=SysDictTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysDictTypeExample example);

    @Delete({
        "delete from sys_dict_type",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_dict_type (dict_type, dict_name, ",
        "dict_source, dict_sql, ",
        "remark, sort, tenant_id, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{dictType,jdbcType=VARCHAR}, #{dictName,jdbcType=VARCHAR}, ",
        "#{dictSource,jdbcType=TINYINT}, #{dictSql,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{sort,jdbcType=INTEGER}, #{tenantId,jdbcType=BIGINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysDictType record);

    @InsertProvider(type=SysDictTypeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysDictType record);

    @SelectProvider(type=SysDictTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dict_type", property="dictType", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_name", property="dictName", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_source", property="dictSource", jdbcType=JdbcType.TINYINT),
        @Result(column="dict_sql", property="dictSql", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysDictType> selectByExampleWithRowbounds(SysDictTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=SysDictTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dict_type", property="dictType", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_name", property="dictName", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_source", property="dictSource", jdbcType=JdbcType.TINYINT),
        @Result(column="dict_sql", property="dictSql", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysDictType> selectByExample(SysDictTypeExample example);

    @Select({
        "select",
        "id, dict_type, dict_name, dict_source, dict_sql, remark, sort, tenant_id, version, ",
        "deleted, creator, create_time, updater, update_time",
        "from sys_dict_type",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dict_type", property="dictType", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_name", property="dictName", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_source", property="dictSource", jdbcType=JdbcType.TINYINT),
        @Result(column="dict_sql", property="dictSql", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysDictType selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysDictTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

    @UpdateProvider(type=SysDictTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysDictType record, @Param("example") SysDictTypeExample example);

    @UpdateProvider(type=SysDictTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysDictType record);

    @Update({
        "update sys_dict_type",
        "set dict_type = #{dictType,jdbcType=VARCHAR},",
          "dict_name = #{dictName,jdbcType=VARCHAR},",
          "dict_source = #{dictSource,jdbcType=TINYINT},",
          "dict_sql = #{dictSql,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysDictType record);
}