package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzScheulerState;
import com.nativeapp.demo.dao.QrtzScheulerStateExample;
import com.nativeapp.demo.dao.QrtzScheulerStateKey;
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

public interface QrtzScheulerStateMapper {
    @SelectProvider(type=QrtzScheulerStateSqlProvider.class, method="countByExample")
    int countByExample(QrtzScheulerStateExample example);

    @DeleteProvider(type=QrtzScheulerStateSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzScheulerStateExample example);

    @Delete({
        "delete from qrtz_scheduler_state",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and instance_name = #{instanceName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzScheulerStateKey key);

    @Insert({
        "insert into qrtz_scheduler_state (sched_name, instance_name, ",
        "last_checkin_time, checkin_interval)",
        "values (#{schedName,jdbcType=VARCHAR}, #{instanceName,jdbcType=VARCHAR}, ",
        "#{lastCheckinTime,jdbcType=BIGINT}, #{checkinInterval,jdbcType=BIGINT})"
    })
    int insert(QrtzScheulerState record);

    @InsertProvider(type=QrtzScheulerStateSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzScheulerState record);

    @SelectProvider(type=QrtzScheulerStateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="instance_name", property="instanceName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="last_checkin_time", property="lastCheckinTime", jdbcType=JdbcType.BIGINT),
        @Result(column="checkin_interval", property="checkinInterval", jdbcType=JdbcType.BIGINT)
    })
    List<QrtzScheulerState> selectByExampleWithRowbounds(QrtzScheulerStateExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzScheulerStateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="instance_name", property="instanceName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="last_checkin_time", property="lastCheckinTime", jdbcType=JdbcType.BIGINT),
        @Result(column="checkin_interval", property="checkinInterval", jdbcType=JdbcType.BIGINT)
    })
    List<QrtzScheulerState> selectByExample(QrtzScheulerStateExample example);

    @Select({
        "select",
        "sched_name, instance_name, last_checkin_time, checkin_interval",
        "from qrtz_scheduler_state",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and instance_name = #{instanceName,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="instance_name", property="instanceName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="last_checkin_time", property="lastCheckinTime", jdbcType=JdbcType.BIGINT),
        @Result(column="checkin_interval", property="checkinInterval", jdbcType=JdbcType.BIGINT)
    })
    QrtzScheulerState selectByPrimaryKey(QrtzScheulerStateKey key);

    @UpdateProvider(type=QrtzScheulerStateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzScheulerState record, @Param("example") QrtzScheulerStateExample example);

    @UpdateProvider(type=QrtzScheulerStateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzScheulerState record, @Param("example") QrtzScheulerStateExample example);

    @UpdateProvider(type=QrtzScheulerStateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzScheulerState record);

    @Update({
        "update qrtz_scheduler_state",
        "set last_checkin_time = #{lastCheckinTime,jdbcType=BIGINT},",
          "checkin_interval = #{checkinInterval,jdbcType=BIGINT}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and instance_name = #{instanceName,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QrtzScheulerState record);
}