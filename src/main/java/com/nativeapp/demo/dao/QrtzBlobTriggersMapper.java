package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzBlobTriggers;
import com.nativeapp.demo.dao.QrtzBlobTriggersExample;
import com.nativeapp.demo.dao.QrtzBlobTriggersKey;
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

public interface QrtzBlobTriggersMapper {
    @SelectProvider(type=QrtzBlobTriggersSqlProvider.class, method="countByExample")
    int countByExample(QrtzBlobTriggersExample example);

    @DeleteProvider(type=QrtzBlobTriggersSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzBlobTriggersExample example);

    @Delete({
        "delete from qrtz_blob_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzBlobTriggersKey key);

    @Insert({
        "insert into qrtz_blob_triggers (sched_name, trigger_name, ",
        "trigger_group, blob_data)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{blobData,jdbcType=LONGVARBINARY})"
    })
    int insert(QrtzBlobTriggers record);

    @InsertProvider(type=QrtzBlobTriggersSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzBlobTriggers record);

    @SelectProvider(type=QrtzBlobTriggersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="blob_data", property="blobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzBlobTriggers> selectByExampleWithBLOBsWithRowbounds(QrtzBlobTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzBlobTriggersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="blob_data", property="blobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzBlobTriggers> selectByExampleWithBLOBs(QrtzBlobTriggersExample example);

    @SelectProvider(type=QrtzBlobTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzBlobTriggers> selectByExampleWithRowbounds(QrtzBlobTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzBlobTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzBlobTriggers> selectByExample(QrtzBlobTriggersExample example);

    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, blob_data",
        "from qrtz_blob_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="blob_data", property="blobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    QrtzBlobTriggers selectByPrimaryKey(QrtzBlobTriggersKey key);

    @UpdateProvider(type=QrtzBlobTriggersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    @UpdateProvider(type=QrtzBlobTriggersSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    @UpdateProvider(type=QrtzBlobTriggersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzBlobTriggers record, @Param("example") QrtzBlobTriggersExample example);

    @UpdateProvider(type=QrtzBlobTriggersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    @Update({
        "update qrtz_blob_triggers",
        "set blob_data = #{blobData,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(QrtzBlobTriggers record);
}