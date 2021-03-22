package com.example.layoutdesigns.playerviewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.layoutdesigns.entity.Player;
import com.example.layoutdesigns.repository.PlayerRepository;

import java.util.List;

public class PlayerViewModel extends ViewModel {

    private PlayerRepository playerRepository;
    public void initialiseRepository(Context context){
        playerRepository=new PlayerRepository(context.getApplicationContext());
    }

    public void addPlayerInDatabase(Player player) {
        playerRepository.addPlayerToDatabase(player);
    }

    public LiveData<List<Player>> getAllPlayers() {
        return playerRepository.getAllPlayers();
    }
}
