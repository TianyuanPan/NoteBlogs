package com.aihecun.blogs.service;

import com.aihecun.blogs.model.Note;
import com.aihecun.blogs.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc-*.xml")
public class NoteServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    NoteService noteService;

    @Test
    public void testCreateNewNote() throws Exception {

        User user = userService.login("1002016", "admin");
        Note note = new Note();
        if (user != null){
            note.setIdUser(user.getIdUser());
            note.setIdNote(new Long(new java.util.Date().getTime()).toString());
            note.setTitle("note title " + new java.util.Date().toString());
            note.setContents("contents is " + new java.util.Date().getTime());
            note.setTimeCreated(new java.util.Date());

            if ( noteService.createNewNote(note) > 0)
                System.out.println("create note return code: > 0");
            else
                System.out.println("create note return code: <= 0");

        }else
            System.out.println("userService.login(...) return is NULL.");

    }

    @Test
    public void testUpdateNote() throws Exception {

        List<Note> notes = noteService.getNoteByUser("123456");
        if (notes != null){
            for (Note n : notes) {

                n.setContents("update --> " + n.getContents());
                n.setTitle("update --> " + n.getTitle());
                n.setFlag(!n.isFlag());
                n.setFlagAccess(!n.isFlagAccess());
                if (noteService.updateNote(n) > 0)
                    System.out.println("create note return code: > 0");
                else
                    System.out.println("create note return code: <= 0");
            }

        }else
            System.out.println("noteService.getNoteByUser(\"123456\") return is NULL.");

    }

    @Test
    public void testDeleteNote() throws Exception {

    }

    @Test
    public void testGetNoteById() throws Exception {

    }

    @Test
    public void testGetNoteByUser() throws Exception {

    }
}