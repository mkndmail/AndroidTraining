package com.example.layoutdesigns.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "player_details")
public class Player {
    @PrimaryKey(autoGenerate = true)
    public int playerID;

    public String getPlayerName() {
        return playerName;
    }

    public String getRole() {
        return role;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    @ColumnInfo(name = "player_name")
    String playerName;

    @ColumnInfo(name = "role")
    String role;

    @ColumnInfo(name = "jersey_number")
    String jerseyNumber;


    public Player(String playerName, String role, String jerseyNumber) {
        this.playerName = playerName;
        this.role = role;
        this.jerseyNumber = jerseyNumber;
    }
}
