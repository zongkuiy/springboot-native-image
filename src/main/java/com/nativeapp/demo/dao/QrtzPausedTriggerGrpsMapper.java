package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzPausedTriggerGrpsExample;
import com.nativeapp.demo.dao.QrtzPausedTriggerGrpsKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface QrtzPausedTriggerGrpsMapper {
    @SelectProvider(type=QrtzPausedTriggerGrpsSqlProvider.class, method="countByExample")
    int countByExample(QrtzPausedTriggerGrpsExample example);

    @DeleteProvider(type=QrtzPausedTriggerGrpsSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzPausedTriggerGrpsExample example);

    @Delete({
        "delete from qrtz_paused_trigger_grps",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzPausedTriggerGrpsKey key);

    @Insert({
        "insert into qrtz_paused_trigger_grps (sched_name, trigger_group)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerGroup,jdbcType=VARCHAR})"
    })
    int insert(QrtzPausedTriggerGrpsKey record);

    @InsertProvider(type=QrtzPausedTriggerGrpsSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzPausedTriggerGrpsKey record);

    @SelectProvider(type=QrtzPausedTriggerGrpsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzPausedTriggerGrpsKey> selectByExampleWithRowbounds(QrtzPausedTriggerGrpsExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzPausedTriggerGrpsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzPausedTriggerGrpsKey> selectByExample(QrtzPausedTriggerGrpsExample example);

    @UpdateProvider(type=QrtzPausedTriggerGrpsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzPausedTriggerGrpsKey record, @Param("example") QrtzPausedTriggerGrpsExample example);

    @UpdateProvider(type=QrtzPausedTriggerGrpsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzPausedTriggerGrpsKey record, @Param("example") QrtzPausedTriggerGrpsExample example);
}