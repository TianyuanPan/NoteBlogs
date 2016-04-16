package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.NoteDao;
import com.aihecun.blogs.model.Note;
import com.aihecun.blogs.service.NoteService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Service
public class NoteServiceImpl extends BaseServiceImpl<Note> implements NoteService {

    @Autowired
    NoteDao  dao;

    @Override
    public int createNewNote(Note model) throws Exception {
        return dao.createNewNote(model);
    }

    @Override
    public int updateNote(Note model) throws Exception {
        return dao.updateNote(model);
    }

    @Override
    public int deleteNote(Note model) throws Exception {
        return dao.deleteNote(model);
    }

    @Override
    public Note getNoteById(String idNote) throws Exception {
        return dao.getNoteById(idNote);
    }

    @Override
    public List<Note> getNoteByUser(String idUser) throws Exception {
        return dao.getNoteByUser(idUser);
    }
}
