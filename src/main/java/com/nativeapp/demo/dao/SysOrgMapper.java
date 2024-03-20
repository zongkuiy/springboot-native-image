package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.SysOrg;
import com.nativeapp.demo.dao.SysOrgExample;
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

public interface SysOrgMapper {
    @SelectProvider(type=SysOrgSqlProvider.class, method="countByExample")
    int countByExample(SysOrgExample example);

    @DeleteProvider(type=SysOrgSqlProvider.class, method="deleteByExample")
    int deleteByExample(SysOrgExample example);

    @Delete({
        "delete from sys_org",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_org (pid, name, ",
        "sort, leader_id, tenant_id, ",
        "version, deleted, ",
        "creator, create_time, ",
        "updater, update_time)",
        "values (#{pid,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{sort,jdbcType=INTEGER}, #{leaderId,jdbcType=BIGINT}, #{tenantId,jdbcType=BIGINT}, ",
        "#{version,jdbcType=INTEGER}, #{deleted,jdbcType=TINYINT}, ",
        "#{creator,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updater,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysOrg record);

    @InsertProvider(type=SysOrgSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SysOrg record);

    @SelectProvider(type=SysOrgSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="leader_id", property="leaderId", jdbcType=JdbcType.BIGINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysOrg> selectByExampleWithRowbounds(SysOrgExample example, RowBounds rowBounds);

    @SelectProvider(type=SysOrgSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="leader_id", property="leaderId", jdbcType=JdbcType.BIGINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SysOrg> selectByExample(SysOrgExample example);

    @Select({
        "select",
        "id, pid, name, sort, leader_id, tenant_id, version, deleted, creator, create_time, ",
        "updater, update_time",
        "from sys_org",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="leader_id", property="leaderId", jdbcType=JdbcType.BIGINT),
        @Result(column="tenant_id", property="tenantId", jdbcType=JdbcType.BIGINT),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SysOrg selectByPrimaryKey(Long id);

    @UpdateProvider(type=SysOrgSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    @UpdateProvider(type=SysOrgSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    @UpdateProvider(type=SysOrgSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysOrg record);

    @Update({
        "update sys_org",
        "set pid = #{pid,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "leader_id = #{leaderId,jdbcType=BIGINT},",
          "tenant_id = #{tenantId,jdbcType=BIGINT},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SysOrg record);
}