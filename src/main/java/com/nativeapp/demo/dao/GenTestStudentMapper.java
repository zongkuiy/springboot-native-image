package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.GenTestStudent;
import com.nativeapp.demo.dao.GenTestStudentExample;
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

public interface GenTestStudentMapper {
    @SelectProvider(type=GenTestStudentSqlProvider.class, method="countByExample")
    int countByExample(GenTestStudentExample example);

    @DeleteProvider(type=GenTestStudentSqlProvider.class, method="deleteByExample")
    int deleteByExample(GenTestStudentExample example);

    @Delete({
        "delete from gen_test_student",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into gen_test_student (name, gender, ",
        "age, class_name, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{name,jdbcType=VARCHAR}, #{gender,jdbcType=TINYINT}, ",
        "#{age,jdbcType=INTEGER}, #{className,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GenTestStudent record);

    @InsertProvider(type=GenTestStudentSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GenTestStudent record);

    @SelectProvider(type=GenTestStudentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.TINYINT),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenTestStudent> selectByExampleWithRowbounds(GenTestStudentExample example, RowBounds rowBounds);

    @SelectProvider(type=GenTestStudentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.TINYINT),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenTestStudent> selectByExample(GenTestStudentExample example);

    @Select({
        "select",
        "id, name, gender, age, class_name, version, deleted, creator, create_time, updater, ",
        "update_time",
        "from gen_test_student",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.TINYINT),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GenTestStudent selectByPrimaryKey(Long id);

    @UpdateProvider(type=GenTestStudentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GenTestStudent record, @Param("example") GenTestStudentExample example);

    @UpdateProvider(type=GenTestStudentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GenTestStudent record, @Param("example") GenTestStudentExample example);

    @UpdateProvider(type=GenTestStudentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GenTestStudent record);

    @Update({
        "update gen_test_student",
        "set name = #{name,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=TINYINT},",
          "age = #{age,jdbcType=INTEGER},",
          "class_name = #{className,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenTestStudent record);
}