package com.aihecun.blogs.dao.impl;

import com.aihecun.blogs.dao.NoteDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.mapper.NoteMapper;
import com.aihecun.blogs.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Repository
public class NoteDaoImpl extends BaseDaoImpl<Note> implements NoteDao {

    @Autowired
    NoteMapper mapper;

    @Override
    public int createNewNote(Note model) throws Exception {
        return mapper.createNewNote(model);
    }

    @Override
    public int updateNote(Note model) throws Exception {
        return mapper.updateNote(model);
    }

    @Override
    public int deleteNote(Note model) throws Exception {
        return mapper.deleteNote(model);
    }

    @Override
    public Note getNoteById(String idNote) throws Exception {
        return mapper.getNoteById(idNote);
    }

    @Override
    public List<Note> getNoteByUser(String idUser) throws Exception {
        return mapper.getNoteByUser(idUser);
    }
}
