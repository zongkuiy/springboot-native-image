package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.GenBaseClass;
import com.nativeapp.demo.dao.GenBaseClassExample;
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

public interface GenBaseClassMapper {
    @SelectProvider(type=GenBaseClassSqlProvider.class, method="countByExample")
    int countByExample(GenBaseClassExample example);

    @DeleteProvider(type=GenBaseClassSqlProvider.class, method="deleteByExample")
    int deleteByExample(GenBaseClassExample example);

    @Delete({
        "delete from gen_base_class",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into gen_base_class (package_name, code, ",
        "fields, remark, ",
        "create_time)",
        "values (#{packageName,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
        "#{fields,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GenBaseClass record);

    @InsertProvider(type=GenBaseClassSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GenBaseClass record);

    @SelectProvider(type=GenBaseClassSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="fields", property="fields", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenBaseClass> selectByExampleWithRowbounds(GenBaseClassExample example, RowBounds rowBounds);

    @SelectProvider(type=GenBaseClassSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="fields", property="fields", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenBaseClass> selectByExample(GenBaseClassExample example);

    @Select({
        "select",
        "id, package_name, code, fields, remark, create_time",
        "from gen_base_class",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="package_name", property="packageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="fields", property="fields", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GenBaseClass selectByPrimaryKey(Long id);

    @UpdateProvider(type=GenBaseClassSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GenBaseClass record, @Param("example") GenBaseClassExample example);

    @UpdateProvider(type=GenBaseClassSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GenBaseClass record, @Param("example") GenBaseClassExample example);

    @UpdateProvider(type=GenBaseClassSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GenBaseClass record);

    @Update({
        "update gen_base_class",
        "set package_name = #{packageName,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "fields = #{fields,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenBaseClass record);
}