package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.ScheduleJobLog;
import com.nativeapp.demo.dao.ScheduleJobLogExample;
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

public interface ScheduleJobLogMapper {
    @SelectProvider(type=ScheduleJobLogSqlProvider.class, method="countByExample")
    int countByExample(ScheduleJobLogExample example);

    @DeleteProvider(type=ScheduleJobLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(ScheduleJobLogExample example);

    @Delete({
        "delete from schedule_job_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into schedule_job_log (job_id, job_name, ",
        "job_group, bean_name, ",
        "method, params, ",
        "status, error, times, ",
        "create_time)",
        "values (#{jobId,jdbcType=BIGINT}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{beanName,jdbcType=VARCHAR}, ",
        "#{method,jdbcType=VARCHAR}, #{params,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{error,jdbcType=VARCHAR}, #{times,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ScheduleJobLog record);

    @InsertProvider(type=ScheduleJobLogSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(ScheduleJobLog record);

    @SelectProvider(type=ScheduleJobLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="job_id", property="jobId", jdbcType=JdbcType.BIGINT),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="bean_name", property="beanName", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="error", property="error", jdbcType=JdbcType.VARCHAR),
        @Result(column="times", property="times", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ScheduleJobLog> selectByExampleWithRowbounds(ScheduleJobLogExample example, RowBounds rowBounds);

    @SelectProvider(type=ScheduleJobLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="job_id", property="jobId", jdbcType=JdbcType.BIGINT),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="bean_name", property="beanName", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="error", property="error", jdbcType=JdbcType.VARCHAR),
        @Result(column="times", property="times", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ScheduleJobLog> selectByExample(ScheduleJobLogExample example);

    @Select({
        "select",
        "id, job_id, job_name, job_group, bean_name, method, params, status, error, times, ",
        "create_time",
        "from schedule_job_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="job_id", property="jobId", jdbcType=JdbcType.BIGINT),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="bean_name", property="beanName", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="params", property="params", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="error", property="error", jdbcType=JdbcType.VARCHAR),
        @Result(column="times", property="times", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    ScheduleJobLog selectByPrimaryKey(Long id);

    @UpdateProvider(type=ScheduleJobLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ScheduleJobLog record, @Param("example") ScheduleJobLogExample example);

    @UpdateProvider(type=ScheduleJobLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ScheduleJobLog record, @Param("example") ScheduleJobLogExample example);

    @UpdateProvider(type=ScheduleJobLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ScheduleJobLog record);

    @Update({
        "update schedule_job_log",
        "set job_id = #{jobId,jdbcType=BIGINT},",
          "job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "bean_name = #{beanName,jdbcType=VARCHAR},",
          "method = #{method,jdbcType=VARCHAR},",
          "params = #{params,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "error = #{error,jdbcType=VARCHAR},",
          "times = #{times,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ScheduleJobLog record);
}