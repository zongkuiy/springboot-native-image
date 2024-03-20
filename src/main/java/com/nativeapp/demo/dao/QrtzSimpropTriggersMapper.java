package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.QrtzSimpropTriggers;
import com.nativeapp.demo.dao.QrtzSimpropTriggersExample;
import com.nativeapp.demo.dao.QrtzSimpropTriggersKey;
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

public interface QrtzSimpropTriggersMapper {
    @SelectProvider(type=QrtzSimpropTriggersSqlProvider.class, method="countByExample")
    int countByExample(QrtzSimpropTriggersExample example);

    @DeleteProvider(type=QrtzSimpropTriggersSqlProvider.class, method="deleteByExample")
    int deleteByExample(QrtzSimpropTriggersExample example);

    @Delete({
        "delete from qrtz_simprop_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(QrtzSimpropTriggersKey key);

    @Insert({
        "insert into qrtz_simprop_triggers (sched_name, trigger_name, ",
        "trigger_group, str_prop_1, ",
        "str_prop_2, str_prop_3, ",
        "int_prop_1, int_prop_2, ",
        "long_prop_1, long_prop_2, ",
        "dec_prop_1, dec_prop_2, ",
        "bool_prop_1, bool_prop_2)",
        "values (#{schedName,jdbcType=VARCHAR}, #{triggerName,jdbcType=VARCHAR}, ",
        "#{triggerGroup,jdbcType=VARCHAR}, #{strProp1,jdbcType=VARCHAR}, ",
        "#{strProp2,jdbcType=VARCHAR}, #{strProp3,jdbcType=VARCHAR}, ",
        "#{intProp1,jdbcType=INTEGER}, #{intProp2,jdbcType=INTEGER}, ",
        "#{longProp1,jdbcType=BIGINT}, #{longProp2,jdbcType=BIGINT}, ",
        "#{decProp1,jdbcType=DECIMAL}, #{decProp2,jdbcType=DECIMAL}, ",
        "#{boolProp1,jdbcType=VARCHAR}, #{boolProp2,jdbcType=VARCHAR})"
    })
    int insert(QrtzSimpropTriggers record);

    @InsertProvider(type=QrtzSimpropTriggersSqlProvider.class, method="insertSelective")
    int insertSelective(QrtzSimpropTriggers record);

    @SelectProvider(type=QrtzSimpropTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="str_prop_1", property="strProp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="str_prop_2", property="strProp2", jdbcType=JdbcType.VARCHAR),
        @Result(column="str_prop_3", property="strProp3", jdbcType=JdbcType.VARCHAR),
        @Result(column="int_prop_1", property="intProp1", jdbcType=JdbcType.INTEGER),
        @Result(column="int_prop_2", property="intProp2", jdbcType=JdbcType.INTEGER),
        @Result(column="long_prop_1", property="longProp1", jdbcType=JdbcType.BIGINT),
        @Result(column="long_prop_2", property="longProp2", jdbcType=JdbcType.BIGINT),
        @Result(column="dec_prop_1", property="decProp1", jdbcType=JdbcType.DECIMAL),
        @Result(column="dec_prop_2", property="decProp2", jdbcType=JdbcType.DECIMAL),
        @Result(column="bool_prop_1", property="boolProp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="bool_prop_2", property="boolProp2", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzSimpropTriggers> selectByExampleWithRowbounds(QrtzSimpropTriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=QrtzSimpropTriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="str_prop_1", property="strProp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="str_prop_2", property="strProp2", jdbcType=JdbcType.VARCHAR),
        @Result(column="str_prop_3", property="strProp3", jdbcType=JdbcType.VARCHAR),
        @Result(column="int_prop_1", property="intProp1", jdbcType=JdbcType.INTEGER),
        @Result(column="int_prop_2", property="intProp2", jdbcType=JdbcType.INTEGER),
        @Result(column="long_prop_1", property="longProp1", jdbcType=JdbcType.BIGINT),
        @Result(column="long_prop_2", property="longProp2", jdbcType=JdbcType.BIGINT),
        @Result(column="dec_prop_1", property="decProp1", jdbcType=JdbcType.DECIMAL),
        @Result(column="dec_prop_2", property="decProp2", jdbcType=JdbcType.DECIMAL),
        @Result(column="bool_prop_1", property="boolProp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="bool_prop_2", property="boolProp2", jdbcType=JdbcType.VARCHAR)
    })
    List<QrtzSimpropTriggers> selectByExample(QrtzSimpropTriggersExample example);

    @Select({
        "select",
        "sched_name, trigger_name, trigger_group, str_prop_1, str_prop_2, str_prop_3, ",
        "int_prop_1, int_prop_2, long_prop_1, long_prop_2, dec_prop_1, dec_prop_2, bool_prop_1, ",
        "bool_prop_2",
        "from qrtz_simprop_triggers",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="sched_name", property="schedName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_name", property="triggerName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="trigger_group", property="triggerGroup", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="str_prop_1", property="strProp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="str_prop_2", property="strProp2", jdbcType=JdbcType.VARCHAR),
        @Result(column="str_prop_3", property="strProp3", jdbcType=JdbcType.VARCHAR),
        @Result(column="int_prop_1", property="intProp1", jdbcType=JdbcType.INTEGER),
        @Result(column="int_prop_2", property="intProp2", jdbcType=JdbcType.INTEGER),
        @Result(column="long_prop_1", property="longProp1", jdbcType=JdbcType.BIGINT),
        @Result(column="long_prop_2", property="longProp2", jdbcType=JdbcType.BIGINT),
        @Result(column="dec_prop_1", property="decProp1", jdbcType=JdbcType.DECIMAL),
        @Result(column="dec_prop_2", property="decProp2", jdbcType=JdbcType.DECIMAL),
        @Result(column="bool_prop_1", property="boolProp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="bool_prop_2", property="boolProp2", jdbcType=JdbcType.VARCHAR)
    })
    QrtzSimpropTriggers selectByPrimaryKey(QrtzSimpropTriggersKey key);

    @UpdateProvider(type=QrtzSimpropTriggersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    @UpdateProvider(type=QrtzSimpropTriggersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") QrtzSimpropTriggers record, @Param("example") QrtzSimpropTriggersExample example);

    @UpdateProvider(type=QrtzSimpropTriggersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QrtzSimpropTriggers record);

    @Update({
        "update qrtz_simprop_triggers",
        "set str_prop_1 = #{strProp1,jdbcType=VARCHAR},",
          "str_prop_2 = #{strProp2,jdbcType=VARCHAR},",
          "str_prop_3 = #{strProp3,jdbcType=VARCHAR},",
          "int_prop_1 = #{intProp1,jdbcType=INTEGER},",
          "int_prop_2 = #{intProp2,jdbcType=INTEGER},",
          "long_prop_1 = #{longProp1,jdbcType=BIGINT},",
          "long_prop_2 = #{longProp2,jdbcType=BIGINT},",
          "dec_prop_1 = #{decProp1,jdbcType=DECIMAL},",
          "dec_prop_2 = #{decProp2,jdbcType=DECIMAL},",
          "bool_prop_1 = #{boolProp1,jdbcType=VARCHAR},",
          "bool_prop_2 = #{boolProp2,jdbcType=VARCHAR}",
        "where sched_name = #{schedName,jdbcType=VARCHAR}",
          "and trigger_name = #{triggerName,jdbcType=VARCHAR}",
          "and trigger_group = #{triggerGroup,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QrtzSimpropTriggers record);
}