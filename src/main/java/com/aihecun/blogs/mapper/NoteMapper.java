package com.aihecun.blogs.mapper;

import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.model.Note;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

public interface NoteMapper extends BaseDaoMybatisPGSQLImpl.MybatisMultiDao<Note> {

    /**
     *
     * @param model
     * @return
     */
    @Insert("INSERT INTO tb_notes (" +
            "\"idNote\", \"idUser\", title, contents, " +
            "\"flagAccess\", flag, \"timeCreated\") " +
            "VALUES ( #{idNote}, #{idUser}, #{title}, #{contents}, " +
            "#{flagAccess}, #{flag}, #{timeCreated} )")
    int createNewNote(Note model);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE tb_notes SET " +
            "title = #{title}, contents = #{contents}, " +
            "\"flagAccess\" = #{flagAccess}, flag = #{flag} " +
            "WHERE \"idNote\" = #{idNote}")
    int updateNote(Note model);


    /**
     *
     * @param model
     * @return
     */
    @Update("UPDATE tb_notes SET flag = false WHERE \"idNote\" = #{idNote}")
    int deleteNote(Note model);


    /**
     *
     * @param idNote
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE \"idNote\" = #{idNote}")
    Note  getNoteById(@Param("idNote") String idNote);


    /**
     *
     * @param idUser
     * @return
     */
    @Select("SELECT * FROM tb_users WHERE \"idUser\" = #{idUser}")
    List<Note> getNoteByUser(@Param("idUser") String idUser);
}
