package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.GenTable;
import com.nativeapp.demo.dao.GenTableExample;
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

public interface GenTableMapper {
    @SelectProvider(type=GenTableSqlProvider.class, method="countByExample")
    int countByExample(GenTableExample example);

    @DeleteProvider(type=GenTableSqlProvider.class, method="deleteByExample")
    int deleteByExample(GenTableExample example);

    @Delete({
        "delete from gen_table",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into gen_table (table_name, class_name, ",
        "table_comment, author, ",
        "email, package_name, ",
        "version, generator_type, ",
        "backend_path, frontend_path, ",
        "module_name, function_name, ",
        "form_layout, datasource_id, ",
        "baseclass_id, create_time)",
        "values (#{tableName,jdbcType=VARCHAR}, #{className,jdbcType=VARCHAR}, ",
        "#{tableComment,jdbcType=VARCHAR}, #{author,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{packageName,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=VARCHAR}, #{generatorType,jdbcType=TINYINT}, ",
        "#{backendPath,jdbcType=VARCHAR}, #{frontendPath,jdbcType=VARCHAR}, ",
        "#{moduleName,jdbcType=VARCHAR}, #{functionName,jdbcType=VARCHAR}, ",
        "#{formLayout,jdbcType=TINYINT}, #{datasourceId,jdbcType=BIGINT}, ",
        "#{baseclassId,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GenTable record);

    @InsertProvider(type=GenTableSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GenTable record);

    @SelectProvider(type=GenTableSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_comment", property="tableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="generator_type", property="generatorType", jdbcType=JdbcType.TINYINT),
        @Result(column="backend_path", property="backendPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="frontend_path", property="frontendPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="function_name", property="functionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_layout", property="formLayout", jdbcType=JdbcType.TINYINT),
        @Result(column="datasource_id", property="datasourceId", jdbcType=JdbcType.BIGINT),
        @Result(column="baseclass_id", property="baseclassId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenTable> selectByExampleWithRowbounds(GenTableExample example, RowBounds rowBounds);

    @SelectProvider(type=GenTableSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_comment", property="tableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="generator_type", property="generatorType", jdbcType=JdbcType.TINYINT),
        @Result(column="backend_path", property="backendPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="frontend_path", property="frontendPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="function_name", property="functionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_layout", property="formLayout", jdbcType=JdbcType.TINYINT),
        @Result(column="datasource_id", property="datasourceId", jdbcType=JdbcType.BIGINT),
        @Result(column="baseclass_id", property="baseclassId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenTable> selectByExample(GenTableExample example);

    @Select({
        "select",
        "id, table_name, class_name, table_comment, author, email, package_name, version, ",
        "generator_type, backend_path, frontend_path, module_name, function_name, form_layout, ",
        "datasource_id, baseclass_id, create_time",
        "from gen_table",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_comment", property="tableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="generator_type", property="generatorType", jdbcType=JdbcType.TINYINT),
        @Result(column="backend_path", property="backendPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="frontend_path", property="frontendPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="function_name", property="functionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="form_layout", property="formLayout", jdbcType=JdbcType.TINYINT),
        @Result(column="datasource_id", property="datasourceId", jdbcType=JdbcType.BIGINT),
        @Result(column="baseclass_id", property="baseclassId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GenTable selectByPrimaryKey(Long id);

    @UpdateProvider(type=GenTableSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GenTable record, @Param("example") GenTableExample example);

    @UpdateProvider(type=GenTableSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GenTable record, @Param("example") GenTableExample example);

    @UpdateProvider(type=GenTableSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GenTable record);

    @Update({
        "update gen_table",
        "set table_name = #{tableName,jdbcType=VARCHAR},",
          "class_name = #{className,jdbcType=VARCHAR},",
          "table_comment = #{tableComment,jdbcType=VARCHAR},",
          "author = #{author,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "package_name = #{packageName,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=VARCHAR},",
          "generator_type = #{generatorType,jdbcType=TINYINT},",
          "backend_path = #{backendPath,jdbcType=VARCHAR},",
          "frontend_path = #{frontendPath,jdbcType=VARCHAR},",
          "module_name = #{moduleName,jdbcType=VARCHAR},",
          "function_name = #{functionName,jdbcType=VARCHAR},",
          "form_layout = #{formLayout,jdbcType=TINYINT},",
          "datasource_id = #{datasourceId,jdbcType=BIGINT},",
          "baseclass_id = #{baseclassId,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenTable record);
}