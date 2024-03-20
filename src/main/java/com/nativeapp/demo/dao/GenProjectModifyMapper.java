package com.nativeapp.demo.dao;

import com.nativeapp.demo.dao.GenProjectModify;
import com.nativeapp.demo.dao.GenProjectModifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface GenProjectModifyMapper {
    @SelectProvider(type=GenProjectModifySqlProvider.class, method="countByExample")
    int countByExample(GenProjectModifyExample example);

    @DeleteProvider(type=GenProjectModifySqlProvider.class, method="deleteByExample")
    int deleteByExample(GenProjectModifyExample example);

    @Delete({
        "delete from gen_project_modify",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into gen_project_modify (project_name, project_code, ",
        "project_package, project_path, ",
        "modify_project_name, modify_project_code, ",
        "modify_project_package, exclusions, ",
        "modify_suffix, modify_tmp_path, ",
        "create_time)",
        "values (#{projectName,jdbcType=VARCHAR}, #{projectCode,jdbcType=VARCHAR}, ",
        "#{projectPackage,jdbcType=VARCHAR}, #{projectPath,jdbcType=VARCHAR}, ",
        "#{modifyProjectName,jdbcType=VARCHAR}, #{modifyProjectCode,jdbcType=VARCHAR}, ",
        "#{modifyProjectPackage,jdbcType=VARCHAR}, #{exclusions,jdbcType=VARCHAR}, ",
        "#{modifySuffix,jdbcType=VARCHAR}, #{modifyTmpPath,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GenProjectModify record);

    @InsertProvider(type=GenProjectModifySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GenProjectModify record);

    @SelectProvider(type=GenProjectModifySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_code", property="projectCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_package", property="projectPackage", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_path", property="projectPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_name", property="modifyProjectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_code", property="modifyProjectCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_package", property="modifyProjectPackage", jdbcType=JdbcType.VARCHAR),
        @Result(column="exclusions", property="exclusions", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_suffix", property="modifySuffix", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_tmp_path", property="modifyTmpPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenProjectModify> selectByExampleWithRowbounds(GenProjectModifyExample example, RowBounds rowBounds);

    @SelectProvider(type=GenProjectModifySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_code", property="projectCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_package", property="projectPackage", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_path", property="projectPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_name", property="modifyProjectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_code", property="modifyProjectCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_package", property="modifyProjectPackage", jdbcType=JdbcType.VARCHAR),
        @Result(column="exclusions", property="exclusions", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_suffix", property="modifySuffix", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_tmp_path", property="modifyTmpPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GenProjectModify> selectByExample(GenProjectModifyExample example);

    @Select({
        "select",
        "id, project_name, project_code, project_package, project_path, modify_project_name, ",
        "modify_project_code, modify_project_package, exclusions, modify_suffix, modify_tmp_path, ",
        "create_time",
        "from gen_project_modify",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_code", property="projectCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_package", property="projectPackage", jdbcType=JdbcType.VARCHAR),
        @Result(column="project_path", property="projectPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_name", property="modifyProjectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_code", property="modifyProjectCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_project_package", property="modifyProjectPackage", jdbcType=JdbcType.VARCHAR),
        @Result(column="exclusions", property="exclusions", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_suffix", property="modifySuffix", jdbcType=JdbcType.VARCHAR),
        @Result(column="modify_tmp_path", property="modifyTmpPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GenProjectModify selectByPrimaryKey(Long id);

    @UpdateProvider(type=GenProjectModifySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GenProjectModify record, @Param("example") GenProjectModifyExample example);

    @UpdateProvider(type=GenProjectModifySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GenProjectModify record, @Param("example") GenProjectModifyExample example);

    @UpdateProvider(type=GenProjectModifySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GenProjectModify record);

    @Update({
        "update gen_project_modify",
        "set project_name = #{projectName,jdbcType=VARCHAR},",
          "project_code = #{projectCode,jdbcType=VARCHAR},",
          "project_package = #{projectPackage,jdbcType=VARCHAR},",
          "project_path = #{projectPath,jdbcType=VARCHAR},",
          "modify_project_name = #{modifyProjectName,jdbcType=VARCHAR},",
          "modify_project_code = #{modifyProjectCode,jdbcType=VARCHAR},",
          "modify_project_package = #{modifyProjectPackage,jdbcType=VARCHAR},",
          "exclusions = #{exclusions,jdbcType=VARCHAR},",
          "modify_suffix = #{modifySuffix,jdbcType=VARCHAR},",
          "modify_tmp_path = #{modifyTmpPath,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GenProjectModify record);
}