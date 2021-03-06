package jp.mirageworld.spring.fileupload.mapper;

import java.util.List;
import jp.mirageworld.spring.fileupload.entity.FilesExample;
import jp.mirageworld.spring.fileupload.entity.FilesKey;
import jp.mirageworld.spring.fileupload.entity.FilesWithBLOBs;
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
import org.apache.ibatis.type.JdbcType;

public interface FilesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @SelectProvider(type=FilesSqlProvider.class, method="countByExample")
    long countByExample(FilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @DeleteProvider(type=FilesSqlProvider.class, method="deleteByExample")
    int deleteByExample(FilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @Delete({
        "delete from files",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(FilesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @Insert({
        "insert into files (id, file)",
        "values (#{id,jdbcType=INTEGER}, #{file,jdbcType=BINARY})"
    })
    int insert(FilesWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @InsertProvider(type=FilesSqlProvider.class, method="insertSelective")
    int insertSelective(FilesWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @SelectProvider(type=FilesSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="file", property="file", jdbcType=JdbcType.BINARY)
    })
    List<FilesWithBLOBs> selectByExampleWithBLOBs(FilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @SelectProvider(type=FilesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<FilesKey> selectByExample(FilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, file",
        "from files",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="file", property="file", jdbcType=JdbcType.BINARY)
    })
    FilesWithBLOBs selectByPrimaryKey(FilesKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @UpdateProvider(type=FilesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FilesWithBLOBs record, @Param("example") FilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @UpdateProvider(type=FilesSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") FilesWithBLOBs record, @Param("example") FilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @UpdateProvider(type=FilesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FilesKey record, @Param("example") FilesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @UpdateProvider(type=FilesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FilesWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files
     *
     * @mbg.generated
     */
    @Update({
        "update files",
        "set file = #{file,jdbcType=BINARY}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(FilesWithBLOBs record);
}