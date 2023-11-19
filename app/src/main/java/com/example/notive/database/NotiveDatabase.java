package com.example.notive.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = NoteEntity.class, version = 1)
public abstract class NotiveDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
