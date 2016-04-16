package com.aihecun.blogs.dao;

import com.aihecun.blogs.dao.base.BaseDao;
import com.aihecun.blogs.model.Note;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */
public interface NoteDao extends BaseDao<Note> {

    /**
     *
     * @param model
     * @return
     */
    int createNewNote(Note model) throws Exception;


    /**
     *
     * @param model
     * @return
     */
    int updateNote(Note model) throws Exception;


    /**
     *
     * @param model
     * @return
     */
    int deleteNote(Note model) throws Exception;


    /**
     *
     * @param idNote
     * @return
     */
    Note  getNoteById(String idNote) throws Exception;


    /**
     *
     * @param idUser
     * @return
     */
    List<Note> getNoteByUser(String idUser) throws Exception;
}
