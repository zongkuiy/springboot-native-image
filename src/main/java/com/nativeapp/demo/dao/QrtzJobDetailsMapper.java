package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzJobDetails;
import com.nativeapp.demo.dao.QrtzJobDetailsExample;
import com.nativeapp.demo.dao.QrtzJobDetailsKey;
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

public interface QrtzJobDetailsMapper {
    @SelectProvider(type=QrtzJobDetailsSqlProvider.class, method="countByExample")
    int countByExample(QrtzJobDetailsExample example);

    @DeleteProvider(type=QrtzJobDetailsSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzJobDetailsExample example);

    @Delete({
        "delete from qrtz_job_details",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzJobDetailsKey key);

    @Insert({
        "insert into qrtz_job_details (sched_name, job_name, ",
        "job_group, description, ",
        "job_class_name, is_durable, ",
        "is_nonconcurrent, is_update_data, ",
        "requests_recovery, job_data)",
        "values (#{schedName,jdbcType=VARCHAR}, #{jobName,jdbcType=VARCHAR}, ",
        "#{jobGroup,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{jobClassName,jdbcType=VARCHAR}, #{isDurable,jdbcType=VARCHAR}, ",
        "#{isNonconcurrent,jdbcType=VARCHAR}, #{isUpdateData,jdbcType=VARCHAR}, ",
        "#{requestsRecovery,jdbcType=VARCHAR}, #{jobData,jdbcType=LONGVARBINARY})"
    })
    int insert(QrtzJobDetails record);

    @InsertProvider(type=QrtzJobDetailsSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzJobDetails record);

    @SelectProvider(type=QrtzJobDetailsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_class_name", property="jobClassName", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_durable", property="isDurable", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_update_data", property="isUpdateData", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_data", property="jobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzJobDetails> selectByExampleWithBLOBsWithRowbounds(QrtzJobDetailsExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzJobDetailsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_class_name", property="jobClassName", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_durable", property="isDurable", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_update_data", property="isUpdateData", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_data", property="jobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzJobDetails> selectByExampleWithBLOBs(QrtzJobDetailsExample example);

    @SelectProvider(type=QrtzJobDetailsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_class_name", property="jobClassName", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_durable", property="isDurable", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_update_data", property="isUpdateData", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzJobDetails> selectByExampleWithRowbounds(QrtzJobDetailsExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzJobDetailsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_class_name", property="jobClassName", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_durable", property="isDurable", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_update_data", property="isUpdateData", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzJobDetails> selectByExample(QrtzJobDetailsExample example);

    @Select({
        "select",
        "sched_name, job_name, job_group, description, job_class_name, is_durable, is_nonconcurrent, ",
        "is_update_data, requests_recovery, job_data",
        "from qrtz_job_details",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_name", property="jobName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="job_group", property="jobGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_class_name", property="jobClassName", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_durable", property="isDurable", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_nonconcurrent", property="isNonconcurrent", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_update_data", property="isUpdateData", jdbcType=JdbcType.VARCHAR),
        @Result(column="requests_recovery", property="requestsRecovery", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_data", property="jobData", jdbcType=JdbcType.LONGVARBINARY)
    })
    QrtzJobDetails selectByPrimaryKey(QrtzJobDetailsKey key);

    @UpdateProvider(type=QrtzJobDetailsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    @UpdateProvider(type=QrtzJobDetailsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    @UpdateProvider(type=QrtzJobDetailsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    @UpdateProvider(type=QrtzJobDetailsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzJobDetails record);

    @Update({
        "update qrtz_job_details",
        "set description = #{description,jdbcType=VARCHAR},",
          "job_class_name = #{jobClassName,jdbcType=VARCHAR},",
          "is_durable = #{isDurable,jdbcType=VARCHAR},",
          "is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR},",
          "is_update_data = #{isUpdateData,jdbcType=VARCHAR},",
          "requests_recovery = #{requestsRecovery,jdbcType=VARCHAR},",
          "job_data = #{jobData,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(QrtzJobDetails record);

    @Update({
        "update qrtz_job_details",
        "set description = #{description,jdbcType=VARCHAR},",
          "job_class_name = #{jobClassName,jdbcType=VARCHAR},",
          "is_durable = #{isDurable,jdbcType=VARCHAR},",
          "is_nonconcurrent = #{isNonconcurrent,jdbcType=VARCHAR},",
          "is_update_data = #{isUpdateData,jdbcType=VARCHAR},",
          "requests_recovery = #{requestsRecovery,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and job_name = #{jobName,jdbcType=VARCHAR}",
          "and job_group = #{jobGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QrtzJobDetails record);
}