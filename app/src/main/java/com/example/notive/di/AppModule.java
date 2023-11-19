package com.example.notive.di;

import android.content.Context;

import androidx.room.Room;

import com.example.notive.database.NoteDao;
import com.example.notive.database.NotiveDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Singleton
    @Provides
    public static NotiveDatabase provideRoomInstance(@ApplicationContext Context context) {
        return Room.databaseBuilder(
                context,
                NotiveDatabase.class,
                "notive_database"
        ).build();
    }

    @Singleton
    @Provides
    public static NoteDao provideAccountDao(NotiveDatabase db) {
        return db.noteDao();
    }

}
