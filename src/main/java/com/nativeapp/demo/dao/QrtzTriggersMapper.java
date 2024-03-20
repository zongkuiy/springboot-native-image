package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzTriggers;
import com.nativeapp.demo.dao.QrtzTriggersExample;
import com.nativeapp.demo.dao.QrtzTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface QrtzTriggersMapper {
    @SelectProvider(type=QrtzTriggersSqlProvider.class, method="countByExample")
    int countByExample(QrtzTriggersExample example);

    @DeleteProvider(type=QrtzTriggersSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzTriggersExample example);

    @Delete({
        "delete from qrtz_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzTriggersKey key);

    @Insert({
        "insert into qrtz_triggers (sched_name, trigger_name, ",
        "trigger_group, job_name, ",
        "job_group, description, ",
        "next_fire_time, prev_fire_time, ",
        "priority, trigger_state, ",
        "trigger_type, start_time, ",
        "end_time, calendar_name, ",
        "misfire_instr, job_data)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{nextFireTime,jdbcType=BIGINT}, #{prevFireTime,jdbcType=BIGINT}, ",
        "#{priority,jdbcType=INTEGER}, #{triggerState,jdbcType=VARCHAR}, ",
        "#{triggerType,jdbcType=VARCHAR}, #{startTime,jdbcType=BIGINT}, ",
        "#{endTime,jdbcType=BIGINT}, #{calendarName,jdbcType=VARCHAR}, ",
        "#{misfireInstr,jdbcType=SMALLINT}, #{jobData,jdbcType=LONGVARBINARY})"
    })
    int insert(QrtzTriggers record);

    @InsertProvider(type=QrtzTriggersSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzTriggers record);

    @SelectProvider(type=QrtzTriggersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="next_fire_time", property="nextFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="prev_fire_time", property="prevFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="trigger_state", property="triggerState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_type", property="triggerType", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.BIGINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.BIGINT),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR),
        @Result(column="misfire_instr", property="misfireInstr", jdbcType=JdbcType.SMALLINT),
        @Result(column="job_data", property="jobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzTriggers> selectByExampleWithBLOBsWithRowbounds(QrtzTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzTriggersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="next_fire_time", property="nextFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="prev_fire_time", property="prevFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="trigger_state", property="triggerState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_type", property="triggerType", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.BIGINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.BIGINT),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR),
        @Result(column="misfire_instr", property="misfireInstr", jdbcType=JdbcType.SMALLINT),
        @Result(column="job_data", property="jobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzTriggers> selectByExampleWithBLOBs(QrtzTriggersExample example);

    @SelectProvider(type=QrtzTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="next_fire_time", property="nextFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="prev_fire_time", property="prevFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="trigger_state", property="triggerState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_type", property="triggerType", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.BIGINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.BIGINT),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR),
        @Result(column="misfire_instr", property="misfireInstr", jdbcType=JdbcType.SMALLINT)
    })
    List<QrtzTriggers> selectByExampleWithRowbounds(QrtzTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="next_fire_time", property="nextFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="prev_fire_time", property="prevFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="trigger_state", property="triggerState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_type", property="triggerType", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.BIGINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.BIGINT),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR),
        @Result(column="misfire_instr", property="misfireInstr", jdbcType=JdbcType.SMALLINT)
    })
    List<QrtzTriggers> selectByExample(QrtzTriggersExample example);

    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, job_name, job_group, description, next_fire_time, ",
        "prev_fire_time, priority, trigger_state, trigger_type, start_time, end_time, ",
        "calendar_name, misfire_instr, job_data",
        "from qrtz_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="next_fire_time", property="nextFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="prev_fire_time", property="prevFireTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="trigger_state", property="triggerState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_type", property="triggerType", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.BIGINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.BIGINT),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR),
        @Result(column="misfire_instr", property="misfireInstr", jdbcType=JdbcType.SMALLINT),
        @Result(column="job_data", property="jobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    QrtzTriggers selectByPrimaryKey(QrtzTriggersKey key);

    @UpdateProvider(type=QrtzTriggersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    @UpdateProvider(type=QrtzTriggersSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    @UpdateProvider(type=QrtzTriggersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    @UpdateProvider(type=QrtzTriggersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzTriggers record);

    @Update({
        "update qrtz_triggers",
        "set job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "next_fire_time = #{nextFireTime,jdbcType=BIGINT},",
          "prev_fire_time = #{prevFireTime,jdbcType=BIGINT},",
          "priority = #{priority,jdbcType=INTEGER},",
          "trigger_state = #{triggerState,jdbcType=VARCHAR},",
          "trigger_type = #{triggerType,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=BIGINT},",
          "end_time = #{endTime,jdbcType=BIGINT},",
          "calendar_name = #{calendarName,jdbcType=VARCHAR},",
          "misfire_instr = #{misfireInstr,jdbcType=SMALLINT},",
          "job_data = #{jobData,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    @Update({
        "update qrtz_triggers",
        "set job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "next_fire_time = #{nextFireTime,jdbcType=BIGINT},",
          "prev_fire_time = #{prevFireTime,jdbcType=BIGINT},",
          "priority = #{priority,jdbcType=INTEGER},",
          "trigger_state = #{triggerState,jdbcType=VARCHAR},",
          "trigger_type = #{triggerType,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=BIGINT},",
          "end_time = #{endTime,jdbcType=BIGINT},",
          "calendar_name = #{calendarName,jdbcType=VARCHAR},",
          "misfire_instr = #{misfireInstr,jdbcType=SMALLINT}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QrtzTriggers record);
}