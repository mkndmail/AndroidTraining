package com.example.layoutdesigns.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.layoutdesigns.R;

public class ScoreCardActivity extends AppCompatActivity {
    int a, b;
    public int count_a, count_b;
    private TextView teamA;
    private TextView teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_card);
        teamA = findViewById(R.id.team_a);
        teamB = findViewById(R.id.team_b);
        Button BtnOneTeamA = findViewById(R.id.team_a_btn1);
        Button BtnTwoTeamA = findViewById(R.id.team_a_btn2);
        Button BtnThreeTeamA = findViewById(R.id.team_a_btn3);
        Button BtnFourTeamA = findViewById(R.id.team_a_btn4);
        Button BtnOneTeamB = findViewById(R.id.team_b_btn1);
        Button BtnTwoTeamB = findViewById(R.id.team_b_btn2);
        Button BtnThreeTeamB = findViewById(R.id.team_b_btn3);
        Button BtnFourTeamB = findViewById(R.id.team_b_btn4);
        Button Reset = findViewById(R.id.reset);
        Button Result = findViewById(R.id.result_button);

        count_a = 0;
        count_b = 0;

        BtnOneTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count_a <= 9) {
                    int b = 5;
                    a = Integer.parseInt(teamA.getText().toString());

                    int c = a + b;
                    String str2 = String.valueOf(c);
                    teamA.setText(str2);
                    count_a++;
                } else {
                    BtnOneTeamA.setVisibility(View.INVISIBLE);

                }

            }
        });
        BtnTwoTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count_a <= 9) {

                    int b = 10;
                    a = Integer.parseInt(teamA.getText().toString());
                    int c = a + b;
                    String st = String.valueOf(c);
                    teamA.setText(st);
                    count_a++;
                } else {
                    BtnTwoTeamA.setVisibility(View.INVISIBLE);
                }


            }
        });

        BtnThreeTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count_a <= 9) {
                    int b = 15;
                    a = Integer.parseInt(teamA.getText().toString());
                    int c = a + b;
                    String st = String.valueOf(c);
                    teamA.setText(st);
                    count_a++;
                } else {
                    BtnThreeTeamA.setVisibility(View.INVISIBLE);
                }

            }
        });

        BtnFourTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count_a <= 9) {
                    int b = 20;
                    a = Integer.parseInt(teamA.getText().toString());
                    int c = a + b;
                    String st = String.valueOf(c);
                    teamA.setText(st);
                    count_a++;
                } else {
                    BtnFourTeamA.setVisibility(View.INVISIBLE);
                }
            }

        });


        BtnOneTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count_b<=9) {
                    int a = 5;
                    b = Integer.parseInt(teamB.getText().toString());

                    int c = a + b;
                    String str2 = String.valueOf(c);
                    teamB.setText(str2);
                    count_b++;
                }else{
                    BtnOneTeamB.setVisibility(View.INVISIBLE);
                }

            }
        });

        BtnTwoTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count_b<=9) {
                    int a = 10;
                    b = Integer.parseInt(teamB.getText().toString());
                    int c = a + b;
                    String str2 = String.valueOf(c);
                    teamB.setText(str2);
                    count_b++;
                }else{
                    BtnTwoTeamB.setVisibility(View.INVISIBLE);
                }
            }
        });
        BtnThreeTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count_b<=9) {
                    int a = 15;
                    b = Integer.parseInt(teamB.getText().toString());
                    int c = a + b;
                    String str2 = String.valueOf(c);
                    teamB.setText(str2);
                    count_b++;
                }else{
                    BtnThreeTeamB.setVisibility(View.INVISIBLE);
                }
            }
        });

        BtnFourTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count_b<=9) {
                    int a = 20;
                    b = Integer.parseInt(teamB.getText().toString());
                    int c = a + b;
                    String str2 = String.valueOf(c);
                    teamB.setText(str2);
                    count_b++;
                }else{
                    BtnFourTeamB.setVisibility(View.INVISIBLE);
                }
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA.setText("0");
                teamB.setText("0");
                BtnOneTeamA.setVisibility(View.VISIBLE);
                BtnOneTeamB.setVisibility(View.VISIBLE);
                BtnTwoTeamA.setVisibility(View.VISIBLE);
                BtnTwoTeamB.setVisibility(View.VISIBLE);
                BtnThreeTeamA.setVisibility(View.VISIBLE);
                BtnThreeTeamB.setVisibility(View.VISIBLE);
                BtnFourTeamA.setVisibility(View.VISIBLE);
                BtnFourTeamB.setVisibility(View.VISIBLE);
            }
        });

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="";
                one=teamA.getText().toString();
                String two="";
                two=teamB.getText().toString();
                int a =Integer.parseInt(one);
                int b= Integer.parseInt(two);

                if(a<b){
                    Toast.makeText(getApplicationContext(),"Team B Is Winner",Toast.LENGTH_LONG).show();
                }

                if(a>b){
                    Toast.makeText(getApplicationContext(),"Team A Is Winner",Toast.LENGTH_LONG).show();
                }

                if(a == b){
                    Toast.makeText(getApplicationContext(),"Tie Between Both Teams",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("frst", teamA.getText().toString());
        myEdit.putString("scnd", teamB.getText().toString());
        myEdit.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //super.onRestart();
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String frstTeam = sh.getString("frst", "");
        String scndTeam = sh.getString("scnd", "");
        teamA.setText(frstTeam);
        teamB.setText(scndTeam);
    }
}