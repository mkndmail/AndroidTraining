package com.example.layoutdesigns.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.layoutdesigns.PlayerDatabase;
import com.example.layoutdesigns.dao.PlayerDao;
import com.example.layoutdesigns.entity.Player;

import java.util.List;

public class PlayerRepository {

    private PlayerDao playerDao;

    public PlayerRepository(Context context) {
        PlayerDatabase playerDatabase = PlayerDatabase.getDataBaseInstance(context);
        playerDao = playerDatabase.playerDao();
    }


    public void addPlayerToDatabase(Player player) {
        PlayerDatabase.databaseWriteExecutor.execute(() -> {
            playerDao.insertPlayerRecord(player);
        });
    }

    public LiveData<List<Player>> getAllPlayers() {
        return playerDao.getAll();

    }
}
