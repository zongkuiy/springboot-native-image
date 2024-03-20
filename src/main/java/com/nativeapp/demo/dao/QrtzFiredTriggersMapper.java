package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzFiredTriggers;
import com.nativeapp.demo.dao.QrtzFiredTriggersExample;
import com.nativeapp.demo.dao.QrtzFiredTriggersKey;
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

public interface QrtzFiredTriggersMapper {
    @SelectProvider(type=QrtzFiredTriggersSqlProvider.class, method="countByExample")
    int countByExample(QrtzFiredTriggersExample example);

    @DeleteProvider(type=QrtzFiredTriggersSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzFiredTriggersExample example);

    @Delete({
        "delete from qrtz_fired_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and entry_id = #{entryId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzFiredTriggersKey key);

    @Insert({
        "insert into qrtz_fired_triggers (sched_name, entry_id, ",
        "trigger_name, trigger_group, ",
        "instance_name, fired_time, ",
        "sched_time, priority, ",
        "state, job_name, ",
        "job_group, is_nonconcurrent, ",
        "requests_recovery)",
        "values (#{schedName,jdbcType=VARCHAR}, #{entryId,jdbcType=VARCHAR}, ",
        "#{triggerName,jdbcType=VARCHAR}, #{triggerGroup,jdbcType=VARCHAR}, ",
        "#{instanceName,jdbcType=VARCHAR}, #{firedTime,jdbcType=BIGINT}, ",
        "#{schedTime,jdbcType=BIGINT}, #{priority,jdbcType=INTEGER}, ",
        "#{state,jdbcType=VARCHAR}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{isNonconcurrent,jdbcType=VARCHAR}, ",
        "#{requestsRecovery,jdbcType=VARCHAR})"
    })
    int insert(QrtzFiredTriggers record);

    @InsertProvider(type=QrtzFiredTriggersSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzFiredTriggers record);

    @SelectProvider(type=QrtzFiredTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="entry_id", property="entryId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="instance_name", property="instanceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fired_time", property="firedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="sched_time", property="schedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzFiredTriggers> selectByExampleWithRowbounds(QrtzFiredTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzFiredTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="entry_id", property="entryId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="instance_name", property="instanceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fired_time", property="firedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="sched_time", property="schedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzFiredTriggers> selectByExample(QrtzFiredTriggersExample example);

    @Select({
        "select",
        "sched_name, entry_id, trigger_name, trigger_group, instance_name, fired_time, ",
        "sched_time, priority, state, job_name, job_group, is_nonconcurrent, requests_recovery",
        "from qrtz_fired_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and entry_id = #{entryId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="entry_id", property="entryId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="instance_name", property="instanceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fired_time", property="firedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="sched_time", property="schedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR)
    })
    QrtzFiredTriggers selectByPrimaryKey(QrtzFiredTriggersKey key);

    @UpdateProvider(type=QrtzFiredTriggersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    @UpdateProvider(type=QrtzFiredTriggersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    @UpdateProvider(type=QrtzFiredTriggersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    @Update({
        "update qrtz_fired_triggers",
        "set trigger_name = #{triggerName,jdbcType=VARCHAR},",
          "trigger_group = #{triggerGroup,jdbcType=VARCHAR},",
          "instance_name = #{instanceName,jdbcType=VARCHAR},",
          "fired_time = #{firedTime,jdbcType=BIGINT},",
          "sched_time = #{schedTime,jdbcType=BIGINT},",
          "priority = #{priority,jdbcType=INTEGER},",
          "state = #{state,jdbcType=VARCHAR},",
          "job_name = #{jobName,jdbcType=VARCHAR},",
          "job_group = #{jobGroup,jdbcType=VARCHAR},",
          "is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR},",
          "requests_recovery = #{requestsRecovery,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and entry_id = #{entryId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QrtzFiredTriggers record);
}