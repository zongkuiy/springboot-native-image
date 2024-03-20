package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysDictData;
import com.nativeapp.demo.dao.SysDictDataExample;
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

public interface SysDictDataMapper {
    @SelectProvider(type=SysDictDataSqlProvider.class, method="countByExample")
    int countByExample(SysDictDataExample example);

    @DeleteProvider(type=SysDictDataSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysDictDataExample example);

    @Delete({
        "delete from sys_dict_data",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_dict_data (dict_type_id, dict_label, ",
        "dict_value, label_class, ",
        "remark, sort, tenant_id, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{dictTypeId,jdbcType=BIGINT}, #{dictLabel,jdbcType=VARCHAR}, ",
        "#{dictValue,jdbcType=VARCHAR}, #{labelClass,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{sort,jdbcType=INTEGER}, #{tenantId,jdbcType=BIGINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysDictData record);

    @InsertProvider(type=SysDictDataSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysDictData record);

    @SelectProvider(type=SysDictDataSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dict_type_id", property="dictTypeId", jdbcType=JdbcType.BIGINT),
        @Result(column="dict_label", property="dictLabel", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_value", property="dictValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="label_class", property="labelClass", jdbcType=JdbcType.VARCHAR),
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
    List<SysDictData> selectByExampleWithRowbounds(SysDictDataExample example, RowBounds rowBounds);

    @SelectProvider(type=SysDictDataSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dict_type_id", property="dictTypeId", jdbcType=JdbcType.BIGINT),
        @Result(column="dict_label", property="dictLabel", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_value", property="dictValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="label_class", property="labelClass", jdbcType=JdbcType.VARCHAR),
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
    List<SysDictData> selectByExample(SysDictDataExample example);

    @Select({
        "select",
        "id, dict_type_id, dict_label, dict_value, label_class, remark, sort, tenant_id, ",
        "version, deleted, creator, create_time, updater, update_time",
        "from sys_dict_data",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dict_type_id", property="dictTypeId", jdbcType=JdbcType.BIGINT),
        @Result(column="dict_label", property="dictLabel", jdbcType=JdbcType.VARCHAR),
        @Result(column="dict_value", property="dictValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="label_class", property="labelClass", jdbcType=JdbcType.VARCHAR),
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
    SysDictData selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysDictDataSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysDictData record, @Param("example") SysDictDataExample example);

    @UpdateProvider(type=SysDictDataSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysDictData record, @Param("example") SysDictDataExample example);

    @UpdateProvider(type=SysDictDataSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysDictData record);

    @Update({
        "update sys_dict_data",
        "set dict_type_id = #{dictTypeId,jdbcType=BIGINT},",
          "dict_label = #{dictLabel,jdbcType=VARCHAR},",
          "dict_value = #{dictValue,jdbcType=VARCHAR},",
          "label_class = #{labelClass,jdbcType=VARCHAR},",
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
    int updateByPrimaryKey(SysDictData record);
}