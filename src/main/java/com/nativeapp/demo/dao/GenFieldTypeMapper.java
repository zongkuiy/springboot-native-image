package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.GenFieldType;
import com.nativeapp.demo.dao.GenFieldTypeExample;
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

public interface GenFieldTypeMapper {
    @SelectProvider(type=GenFieldTypeSqlProvider.class, method="countByExample")
    int countByExample(GenFieldTypeExample example);

    @DeleteProvider(type=GenFieldTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(GenFieldTypeExample example);

    @Delete({
        "delete from gen_field_type",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into gen_field_type (column_type, attr_type, ",
        "package_name, create_time)",
        "values (#{columnType,jdbcType=VARCHAR}, #{attrType,jdbcType=VARCHAR}, ",
        "#{packageName,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GenFieldType record);

    @InsertProvider(type=GenFieldTypeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GenFieldType record);

    @SelectProvider(type=GenFieldTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="column_type", property="columnType", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_type", property="attrType", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenFieldType> selectByExampleWithRowbounds(GenFieldTypeExample example, RowBounds rowBounds);

    @SelectProvider(type=GenFieldTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="column_type", property="columnType", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_type", property="attrType", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenFieldType> selectByExample(GenFieldTypeExample example);

    @Select({
        "select",
        "id, column_type, attr_type, package_name, create_time",
        "from gen_field_type",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="column_type", property="columnType", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_type", property="attrType", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GenFieldType selectByPrimaryKey(Long id);

    @UpdateProvider(type=GenFieldTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GenFieldType record, @Param("example") GenFieldTypeExample example);

    @UpdateProvider(type=GenFieldTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GenFieldType record, @Param("example") GenFieldTypeExample example);

    @UpdateProvider(type=GenFieldTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GenFieldType record);

    @Update({
        "update gen_field_type",
        "set column_type = #{columnType,jdbcType=VARCHAR},",
          "attr_type = #{attrType,jdbcType=VARCHAR},",
          "package_name = #{packageName,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenFieldType record);
}