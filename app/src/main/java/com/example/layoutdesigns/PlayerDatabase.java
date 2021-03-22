package com.example.layoutdesigns;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.layoutdesigns.dao.PlayerDao;
import com.example.layoutdesigns.entity.Player;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Player.class}, version = 1, exportSchema = false)
public abstract class PlayerDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "players_db";
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public abstract PlayerDao playerDao();

    private static volatile PlayerDatabase playerDatabase;

    public static PlayerDatabase getDataBaseInstance(Context context) {
        if (playerDatabase == null) {
            synchronized (PlayerDatabase.class) {
                playerDatabase = Room.databaseBuilder(context,
                        PlayerDatabase.class, DATABASE_NAME)
                        .addCallback(sRoomDatabaseCallback)
                        .allowMainThreadQueries()
                        .build();
            }
        }
        return playerDatabase;
    }

    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            // If you want to keep data through app restarts,
            // comment out the following block
            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.

            });
        }
    };
}
