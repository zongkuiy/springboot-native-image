package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.GenDatasource;
import com.nativeapp.demo.dao.GenDatasourceExample;
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

public interface GenDatasourceMapper {
    @SelectProvider(type=GenDatasourceSqlProvider.class, method="countByExample")
    int countByExample(GenDatasourceExample example);

    @DeleteProvider(type=GenDatasourceSqlProvider.class, method="deleteByExample")
    int deleteByExample(GenDatasourceExample example);

    @Delete({
        "delete from gen_datasource",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into gen_datasource (db_type, conn_name, ",
        "conn_url, username, ",
        "password, create_time)",
        "values (#{dbType,jdbcType=VARCHAR}, #{connName,jdbcType=VARCHAR}, ",
        "#{connUrl,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GenDatasource record);

    @InsertProvider(type=GenDatasourceSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GenDatasource record);

    @SelectProvider(type=GenDatasourceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="db_type", property="dbType", jdbcType=JdbcType.VARCHAR),
        @Result(column="conn_name", property="connName", jdbcType=JdbcType.VARCHAR),
        @Result(column="conn_url", property="connUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenDatasource> selectByExampleWithRowbounds(GenDatasourceExample example, RowBounds rowBounds);

    @SelectProvider(type=GenDatasourceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="db_type", property="dbType", jdbcType=JdbcType.VARCHAR),
        @Result(column="conn_name", property="connName", jdbcType=JdbcType.VARCHAR),
        @Result(column="conn_url", property="connUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenDatasource> selectByExample(GenDatasourceExample example);

    @Select({
        "select",
        "id, db_type, conn_name, conn_url, username, password, create_time",
        "from gen_datasource",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="db_type", property="dbType", jdbcType=JdbcType.VARCHAR),
        @Result(column="conn_name", property="connName", jdbcType=JdbcType.VARCHAR),
        @Result(column="conn_url", property="connUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GenDatasource selectByPrimaryKey(Long id);

    @UpdateProvider(type=GenDatasourceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GenDatasource record, @Param("example") GenDatasourceExample example);

    @UpdateProvider(type=GenDatasourceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GenDatasource record, @Param("example") GenDatasourceExample example);

    @UpdateProvider(type=GenDatasourceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GenDatasource record);

    @Update({
        "update gen_datasource",
        "set db_type = #{dbType,jdbcType=VARCHAR},",
          "conn_name = #{connName,jdbcType=VARCHAR},",
          "conn_url = #{connUrl,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenDatasource record);
}