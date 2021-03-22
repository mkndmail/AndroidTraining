package com.example.layoutdesigns.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.layoutdesigns.entity.Player;

import java.util.List;

@Dao
public interface PlayerDao {
    final String TABLE_NAME = "player_details";

    @Query("SELECT * FROM player_details")
    LiveData<List<Player>> getAll();


    @Query("SELECT * FROM player_details WHERE playerID=:id")
    Player getPlayerByID(int id);

    @Insert
    void insertAll(Player... players);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertPlayerRecord(Player player);

    @Delete
    void delete(Player player);

    void deleteAll();
}
