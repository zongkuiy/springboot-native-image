package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.GenTableField;
import com.nativeapp.demo.dao.GenTableFieldExample;
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

public interface GenTableFieldMapper {
    @SelectProvider(type=GenTableFieldSqlProvider.class, method="countByExample")
    int countByExample(GenTableFieldExample example);

    @DeleteProvider(type=GenTableFieldSqlProvider.class, method="deleteByExample")
    int deleteByExample(GenTableFieldExample example);

    @Delete({
        "delete from gen_table_field",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into gen_table_field (table_id, field_name, ",
        "field_type, field_comment, ",
        "attr_name, attr_type, ",
        "package_name, sort, ",
        "auto_fill, primary_pk, ",
        "base_field, form_item, ",
        "form_required, form_type, ",
        "form_dict, form_validator, ",
        "grid_item, grid_sort, ",
        "query_item, query_type, ",
        "query_form_type)",
        "values (#{tableId,jdbcType=BIGINT}, #{fieldName,jdbcType=VARCHAR}, ",
        "#{fieldType,jdbcType=VARCHAR}, #{fieldComment,jdbcType=VARCHAR}, ",
        "#{attrName,jdbcType=VARCHAR}, #{attrType,jdbcType=VARCHAR}, ",
        "#{packageName,jdbcType=VARCHAR}, #{sort,jdbcType=INTEGER}, ",
        "#{autoFill,jdbcType=VARCHAR}, #{primaryPk,jdbcType=TINYINT}, ",
        "#{baseField,jdbcType=TINYINT}, #{formItem,jdbcType=TINYINT}, ",
        "#{formRequired,jdbcType=TINYINT}, #{formType,jdbcType=VARCHAR}, ",
        "#{formDict,jdbcType=VARCHAR}, #{formValidator,jdbcType=VARCHAR}, ",
        "#{gridItem,jdbcType=TINYINT}, #{gridSort,jdbcType=TINYINT}, ",
        "#{queryItem,jdbcType=TINYINT}, #{queryType,jdbcType=VARCHAR}, ",
        "#{queryFormType,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GenTableField record);

    @InsertProvider(type=GenTableFieldSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GenTableField record);

    @SelectProvider(type=GenTableFieldSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_id", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="field_name", property="fieldName", jdbcType=JdbcType.VARCHAR),
        @Result(column="field_type", property="fieldType", jdbcType=JdbcType.VARCHAR),
        @Result(column="field_comment", property="fieldComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_name", property="attrName", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_type", property="attrType", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="auto_fill", property="autoFill", jdbcType=JdbcType.VARCHAR),
        @Result(column="primary_pk", property="primaryPk", jdbcType=JdbcType.TINYINT),
        @Result(column="base_field", property="baseField", jdbcType=JdbcType.TINYINT),
        @Result(column="form_item", property="formItem", jdbcType=JdbcType.TINYINT),
        @Result(column="form_required", property="formRequired", jdbcType=JdbcType.TINYINT),
        @Result(column="form_type", property="formType", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_dict", property="formDict", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_validator", property="formValidator", jdbcType=JdbcType.VARCHAR),
        @Result(column="grid_item", property="gridItem", jdbcType=JdbcType.TINYINT),
        @Result(column="grid_sort", property="gridSort", jdbcType=JdbcType.TINYINT),
        @Result(column="query_item", property="queryItem", jdbcType=JdbcType.TINYINT),
        @Result(column="query_type", property="queryType", jdbcType=JdbcType.VARCHAR),
        @Result(column="query_form_type", property="queryFormType", jdbcType=JdbcType.VARCHAR)
    })
    List<GenTableField> selectByExampleWithRowbounds(GenTableFieldExample example, RowBounds rowBounds);

    @SelectProvider(type=GenTableFieldSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_id", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="field_name", property="fieldName", jdbcType=JdbcType.VARCHAR),
        @Result(column="field_type", property="fieldType", jdbcType=JdbcType.VARCHAR),
        @Result(column="field_comment", property="fieldComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_name", property="attrName", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_type", property="attrType", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="auto_fill", property="autoFill", jdbcType=JdbcType.VARCHAR),
        @Result(column="primary_pk", property="primaryPk", jdbcType=JdbcType.TINYINT),
        @Result(column="base_field", property="baseField", jdbcType=JdbcType.TINYINT),
        @Result(column="form_item", property="formItem", jdbcType=JdbcType.TINYINT),
        @Result(column="form_required", property="formRequired", jdbcType=JdbcType.TINYINT),
        @Result(column="form_type", property="formType", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_dict", property="formDict", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_validator", property="formValidator", jdbcType=JdbcType.VARCHAR),
        @Result(column="grid_item", property="gridItem", jdbcType=JdbcType.TINYINT),
        @Result(column="grid_sort", property="gridSort", jdbcType=JdbcType.TINYINT),
        @Result(column="query_item", property="queryItem", jdbcType=JdbcType.TINYINT),
        @Result(column="query_type", property="queryType", jdbcType=JdbcType.VARCHAR),
        @Result(column="query_form_type", property="queryFormType", jdbcType=JdbcType.VARCHAR)
    })
    List<GenTableField> selectByExample(GenTableFieldExample example);

    @Select({
        "select",
        "id, table_id, field_name, field_type, field_comment, attr_name, attr_type, package_name, ",
        "sort, auto_fill, primary_pk, base_field, form_item, form_required, form_type, ",
        "form_dict, form_validator, grid_item, grid_sort, query_item, query_type, query_form_type",
        "from gen_table_field",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_id", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="field_name", property="fieldName", jdbcType=JdbcType.VARCHAR),
        @Result(column="field_type", property="fieldType", jdbcType=JdbcType.VARCHAR),
        @Result(column="field_comment", property="fieldComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_name", property="attrName", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr_type", property="attrType", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="auto_fill", property="autoFill", jdbcType=JdbcType.VARCHAR),
        @Result(column="primary_pk", property="primaryPk", jdbcType=JdbcType.TINYINT),
        @Result(column="base_field", property="baseField", jdbcType=JdbcType.TINYINT),
        @Result(column="form_item", property="formItem", jdbcType=JdbcType.TINYINT),
        @Result(column="form_required", property="formRequired", jdbcType=JdbcType.TINYINT),
        @Result(column="form_type", property="formType", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_dict", property="formDict", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_validator", property="formValidator", jdbcType=JdbcType.VARCHAR),
        @Result(column="grid_item", property="gridItem", jdbcType=JdbcType.TINYINT),
        @Result(column="grid_sort", property="gridSort", jdbcType=JdbcType.TINYINT),
        @Result(column="query_item", property="queryItem", jdbcType=JdbcType.TINYINT),
        @Result(column="query_type", property="queryType", jdbcType=JdbcType.VARCHAR),
        @Result(column="query_form_type", property="queryFormType", jdbcType=JdbcType.VARCHAR)
    })
    GenTableField selectByPrimaryKey(Long id);

    @UpdateProvider(type=GenTableFieldSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GenTableField record, @Param("example") GenTableFieldExample example);

    @UpdateProvider(type=GenTableFieldSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GenTableField record, @Param("example") GenTableFieldExample example);

    @UpdateProvider(type=GenTableFieldSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GenTableField record);

    @Update({
        "update gen_table_field",
        "set table_id = #{tableId,jdbcType=BIGINT},",
          "field_name = #{fieldName,jdbcType=VARCHAR},",
          "field_type = #{fieldType,jdbcType=VARCHAR},",
          "field_comment = #{fieldComment,jdbcType=VARCHAR},",
          "attr_name = #{attrName,jdbcType=VARCHAR},",
          "attr_type = #{attrType,jdbcType=VARCHAR},",
          "package_name = #{packageName,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "auto_fill = #{autoFill,jdbcType=VARCHAR},",
          "primary_pk = #{primaryPk,jdbcType=TINYINT},",
          "base_field = #{baseField,jdbcType=TINYINT},",
          "form_item = #{formItem,jdbcType=TINYINT},",
          "form_required = #{formRequired,jdbcType=TINYINT},",
          "form_type = #{formType,jdbcType=VARCHAR},",
          "form_dict = #{formDict,jdbcType=VARCHAR},",
          "form_validator = #{formValidator,jdbcType=VARCHAR},",
          "grid_item = #{gridItem,jdbcType=TINYINT},",
          "grid_sort = #{gridSort,jdbcType=TINYINT},",
          "query_item = #{queryItem,jdbcType=TINYINT},",
          "query_type = #{queryType,jdbcType=VARCHAR},",
          "query_form_type = #{queryFormType,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenTableField record);
}