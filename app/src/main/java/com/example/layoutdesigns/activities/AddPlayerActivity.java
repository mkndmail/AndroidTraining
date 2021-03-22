package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.layoutdesigns.PlayerDatabase;
import com.example.layoutdesigns.R;
import com.example.layoutdesigns.entity.Player;
import com.example.layoutdesigns.playerviewmodel.MyViewModelFactory;
import com.example.layoutdesigns.playerviewmodel.PlayerViewModel;

import java.util.List;

public class AddPlayerActivity extends AppCompatActivity {
    private EditText edtPlayer,
            edtPlayerRole,
            edtJerseyNumber;
    private Button btnSavePlayerDetails;
    private PlayerViewModel playerViewModel;
    private LinearLayout llPlayerSaved;

    public AddPlayerActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);
        playerViewModel = new ViewModelProvider(this).get(PlayerViewModel.class);
        playerViewModel.initialiseRepository(this);
        edtPlayer = findViewById(R.id.edt_player);
        edtPlayerRole = findViewById(R.id.edt_player_role);
        edtJerseyNumber = findViewById(R.id.edt_jersey_number);
        btnSavePlayerDetails = findViewById(R.id.btn_save_player_details);
        llPlayerSaved = findViewById(R.id.ll_players_saved);
        btnSavePlayerDetails.setOnClickListener(v -> {
            String playerName = getTextFromView(edtPlayer);
            String role = getTextFromView(edtPlayerRole);
            String jerseyNumber = getTextFromView(edtJerseyNumber);
            if (!playerName.isEmpty() && !role.isEmpty() && !jerseyNumber.isEmpty()) {
                saveDataIntoDatabase(new Player(playerName, role, jerseyNumber));
                clearAllFields();
            }
            else {
                edtPlayer.setError("Name is required");
                edtPlayerRole.setError("Role is required");
                edtJerseyNumber.setError("Jersey number is required");
            }
        });

        playerViewModel.getAllPlayers().observe(this, players -> {
            for (Player player1 : players) {
                TextView textView = new TextView(AddPlayerActivity.this);
                textView.setText(getString(R.string.player_details, player1.getPlayerName(), player1.getRole(), player1.getJerseyNumber()));
                llPlayerSaved.addView(textView);
            }
        });
    }

    private void clearAllFields() {
        edtPlayer.setText("");
        edtJerseyNumber.setText("");
        edtPlayerRole.setText("");
    }

    private void saveDataIntoDatabase(Player player) {
        playerViewModel.addPlayerInDatabase(player);
    }

    private String getTextFromView(EditText editText) {
        return editText.getText().toString().trim();
    }
}