package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzSimpleTriggers;
import com.nativeapp.demo.dao.QrtzSimpleTriggersExample;
import com.nativeapp.demo.dao.QrtzSimpleTriggersKey;
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

public interface QrtzSimpleTriggersMapper {
    @SelectProvider(type=QrtzSimpleTriggersSqlProvider.class, method="countByExample")
    int countByExample(QrtzSimpleTriggersExample example);

    @DeleteProvider(type=QrtzSimpleTriggersSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzSimpleTriggersExample example);

    @Delete({
        "delete from qrtz_simple_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzSimpleTriggersKey key);

    @Insert({
        "insert into qrtz_simple_triggers (sched_name, trigger_name, ",
        "trigger_group, repeat_count, ",
        "repeat_interval, times_triggered)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{repeatCount,jdbcType=BIGINT}, ",
        "#{repeatInterval,jdbcType=BIGINT}, #{timesTriggered,jdbcType=BIGINT})"
    })
    int insert(QrtzSimpleTriggers record);

    @InsertProvider(type=QrtzSimpleTriggersSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzSimpleTriggers record);

    @SelectProvider(type=QrtzSimpleTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="repeat_count", property="repeatCount", jdbcType=JdbcType.BIGINT),
        @Result(column="repeat_interval", property="repeatInterval", jdbcType=JdbcType.BIGINT),
        @Result(column="times_triggered", property="timesTriggered", jdbcType=JdbcType.BIGINT)
    })
    List<QrtzSimpleTriggers> selectByExampleWithRowbounds(QrtzSimpleTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzSimpleTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="repeat_count", property="repeatCount", jdbcType=JdbcType.BIGINT),
        @Result(column="repeat_interval", property="repeatInterval", jdbcType=JdbcType.BIGINT),
        @Result(column="times_triggered", property="timesTriggered", jdbcType=JdbcType.BIGINT)
    })
    List<QrtzSimpleTriggers> selectByExample(QrtzSimpleTriggersExample example);

    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, repeat_count, repeat_interval, times_triggered",
        "from qrtz_simple_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="repeat_count", property="repeatCount", jdbcType=JdbcType.BIGINT),
        @Result(column="repeat_interval", property="repeatInterval", jdbcType=JdbcType.BIGINT),
        @Result(column="times_triggered", property="timesTriggered", jdbcType=JdbcType.BIGINT)
    })
    QrtzSimpleTriggers selectByPrimaryKey(QrtzSimpleTriggersKey key);

    @UpdateProvider(type=QrtzSimpleTriggersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    @UpdateProvider(type=QrtzSimpleTriggersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzSimpleTriggers record, @Param("example") QrtzSimpleTriggersExample example);

    @UpdateProvider(type=QrtzSimpleTriggersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    @Update({
        "update qrtz_simple_triggers",
        "set repeat_count = #{repeatCount,jdbcType=BIGINT},",
          "repeat_interval = #{repeatInterval,jdbcType=BIGINT},",
          "times_triggered = #{timesTriggered,jdbcType=BIGINT}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QrtzSimpleTriggers record);
}