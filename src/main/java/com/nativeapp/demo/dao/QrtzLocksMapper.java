package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzLocksExample;
import com.nativeapp.demo.dao.QrtzLocksKey;
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

public interface QrtzLocksMapper {
    @SelectProvider(type=QrtzLocksSqlProvider.class, method="countByExample")
    int countByExample(QrtzLocksExample example);

    @DeleteProvider(type=QrtzLocksSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzLocksExample example);

    @Delete({
        "delete from qrtz_locks",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and lock_name = #{lockName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzLocksKey key);

    @Insert({
        "insert into qrtz_locks (sched_name, lock_name)",
        "values (#{schedName,jdbcType=VARCHAR}, #{lockName,jdbcType=VARCHAR})"
    })
    int insert(QrtzLocksKey record);

    @InsertProvider(type=QrtzLocksSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzLocksKey record);

    @SelectProvider(type=QrtzLocksSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="lock_name", property="lockName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzLocksKey> selectByExampleWithRowbounds(QrtzLocksExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzLocksSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="lock_name", property="lockName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzLocksKey> selectByExample(QrtzLocksExample example);

    @UpdateProvider(type=QrtzLocksSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);

    @UpdateProvider(type=QrtzLocksSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzLocksKey record, @Param("example") QrtzLocksExample example);
}