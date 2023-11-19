package com.example.notive.database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY noteID DESC")
    List<NoteEntity> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void createNote(NoteEntity noteEntity);

    @Delete
    void deleteNote(NoteEntity noteEntity);
}