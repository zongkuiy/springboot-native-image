package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.ScheduleJob;
import com.nativeapp.demo.dao.ScheduleJobExample;
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

public interface ScheduleJobMapper {
    @SelectProvider(type=ScheduleJobSqlProvider.class, method="countByExample")
    int countByExample(ScheduleJobExample example);

    @DeleteProvider(type=ScheduleJobSqlProvider.class, method="deleteByExample")
    int deleteByExample(ScheduleJobExample example);

    @Delete({
        "delete from schedule_job",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into schedule_job (job_name, job_group, ",
        "bean_name, method, ",
        "params, cron_expression, ",
        "status, concurrent, ",
        "remark, version, ",
        "deleted, creator, ",
        "create_time, updater, ",
        "update_time)",
        "values (#{jobName,jdbcType=VARCHAR}, #{jobGroup,jdbcType=VARCHAR}, ",
        "#{beanName,jdbcType=VARCHAR}, #{method,jdbcType=VARCHAR}, ",
        "#{params,jdbcType=VARCHAR}, #{cronExpression,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{concurrent,jdbcType=TINYINT}, ",
        "#{remark,jdbcType=VARCHAR}, #{version,jdbcType=INTEGER}, ",
        "#{deleted,jdbcType=TINYINT}, #{creator,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updater,jdbcType=BIGINT}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ScheduleJob record);

    @InsertProvider(type=ScheduleJobSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(ScheduleJob record);

    @SelectProvider(type=ScheduleJobSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="bean_name", property="beanName", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="cron_expression", property="cronExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="concurrent", property="concurrent", jdbcType=JdbcType.TINYINT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ScheduleJob> selectByExampleWithRowbounds(ScheduleJobExample example, RowBounds rowBounds);

    @SelectProvider(type=ScheduleJobSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="bean_name", property="beanName", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="cron_expression", property="cronExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="concurrent", property="concurrent", jdbcType=JdbcType.TINYINT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ScheduleJob> selectByExample(ScheduleJobExample example);

    @Select({
        "select",
        "id, job_name, job_group, bean_name, method, params, cron_expression, status, ",
        "concurrent, remark, version, deleted, creator, create_time, updater, update_time",
        "from schedule_job",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="bean_name", property="beanName", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="cron_expression", property="cronExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="concurrent", property="concurrent", jdbcType=JdbcType.TINYINT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="creator", property="creator", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updater", property="updater", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    ScheduleJob selectByPrimaryKey(Long id);

    @UpdateProvider(type=ScheduleJobSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    @UpdateProvider(type=ScheduleJobSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ScheduleJob record, @Param("example") ScheduleJobExample example);

    @UpdateProvider(type=ScheduleJobSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ScheduleJob record);

    @Update({
        "update schedule_job",
        "set job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "bean_name = #{beanName,jdbcType=VARCHAR},",
          "method = #{method,jdbcType=VARCHAR},",
          "params = #{params,jdbcType=VARCHAR},",
          "cron_expression = #{cronExpression,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "concurrent = #{concurrent,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=INTEGER},",
          "deleted = #{deleted,jdbcType=TINYINT},",
          "creator = #{creator,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updater = #{updater,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ScheduleJob record);
}