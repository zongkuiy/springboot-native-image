package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzCronTriggers;
import com.nativeapp.demo.dao.QrtzCronTriggersExample;
import com.nativeapp.demo.dao.QrtzCronTriggersKey;
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

public interface QrtzCronTriggersMapper {
    @SelectProvider(type=QrtzCronTriggersSqlProvider.class, method="countByExample")
    int countByExample(QrtzCronTriggersExample example);

    @DeleteProvider(type=QrtzCronTriggersSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzCronTriggersExample example);

    @Delete({
        "delete from qrtz_cron_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzCronTriggersKey key);

    @Insert({
        "insert into qrtz_cron_triggers (sched_name, trigger_name, ",
        "trigger_group, cron_expression, ",
        "time_zone_id)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{cronExpression,jdbcType=VARCHAR}, ",
        "#{timeZoneId,jdbcType=VARCHAR})"
    })
    int insert(QrtzCronTriggers record);

    @InsertProvider(type=QrtzCronTriggersSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzCronTriggers record);

    @SelectProvider(type=QrtzCronTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="cron_expression", property="cronExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_zone_id", property="timeZoneId", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzCronTriggers> selectByExampleWithRowbounds(QrtzCronTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzCronTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="cron_expression", property="cronExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_zone_id", property="timeZoneId", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzCronTriggers> selectByExample(QrtzCronTriggersExample example);

    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, cron_expression, time_zone_id",
        "from qrtz_cron_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="cron_expression", property="cronExpression", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_zone_id", property="timeZoneId", jdbcType=JdbcType.VARCHAR)
    })
    QrtzCronTriggers selectByPrimaryKey(QrtzCronTriggersKey key);

    @UpdateProvider(type=QrtzCronTriggersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    @UpdateProvider(type=QrtzCronTriggersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    @UpdateProvider(type=QrtzCronTriggersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    @Update({
        "update qrtz_cron_triggers",
        "set cron_expression = #{cronExpression,jdbcType=VARCHAR},",
          "time_zone_id = #{timeZoneId,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QrtzCronTriggers record);
}