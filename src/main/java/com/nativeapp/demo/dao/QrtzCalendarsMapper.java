package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzCalendars;
import com.nativeapp.demo.dao.QrtzCalendarsExample;
import com.nativeapp.demo.dao.QrtzCalendarsKey;
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

public interface QrtzCalendarsMapper {
    @SelectProvider(type=QrtzCalendarsSqlProvider.class, method="countByExample")
    int countByExample(QrtzCalendarsExample example);

    @DeleteProvider(type=QrtzCalendarsSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzCalendarsExample example);

    @Delete({
        "delete from qrtz_calendars",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and calendar_name = #{calendarName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzCalendarsKey key);

    @Insert({
        "insert into qrtz_calendars (sched_name, calendar_name, ",
        "calendar)",
        "values (#{schedName,jdbcType=VARCHAR}, #{calendarName,jdbcType=VARCHAR}, ",
        "#{calendar,jdbcType=LONGVARBINARY})"
    })
    int insert(QrtzCalendars record);

    @InsertProvider(type=QrtzCalendarsSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzCalendars record);

    @SelectProvider(type=QrtzCalendarsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar", property="calendar", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzCalendars> selectByExampleWithBLOBsWithRowbounds(QrtzCalendarsExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzCalendarsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar", property="calendar", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<QrtzCalendars> selectByExampleWithBLOBs(QrtzCalendarsExample example);

    @SelectProvider(type=QrtzCalendarsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzCalendars> selectByExampleWithRowbounds(QrtzCalendarsExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzCalendarsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<QrtzCalendars> selectByExample(QrtzCalendarsExample example);

    @Select({
        "select",
        "sched_name, calendar_name, calendar",
        "from qrtz_calendars",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and calendar_name = #{calendarName,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar_name", property="calendarName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendar", property="calendar", jdbcType=JdbcType.LONGVARBINARY)
    })
    QrtzCalendars selectByPrimaryKey(QrtzCalendarsKey key);

    @UpdateProvider(type=QrtzCalendarsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    @UpdateProvider(type=QrtzCalendarsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    @UpdateProvider(type=QrtzCalendarsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzCalendars record, @Param("example") QrtzCalendarsExample example);

    @UpdateProvider(type=QrtzCalendarsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzCalendars record);

    @Update({
        "update qrtz_calendars",
        "set calendar = #{calendar,jdbcType=LONGVARBINARY}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and calendar_name = #{calendarName,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(QrtzCalendars record);
}