package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.rps.Check;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnRock = findViewById(R.id.rock);
        ImageButton btnPaper = findViewById(R.id.paper);
        ImageButton btnScissors = findViewById(R.id.scissors);





        btnRock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView tvP = findViewById(R.id.player);
                TextView tvC = findViewById(R.id.cpu);
                TextView tvN = findViewById(R.id.notification);
                if(Check.check("Rock").equals("Victory")){
                    tvP.setText(String.valueOf( 1 + Integer.parseInt((String) tvP.getText())));
                    tvN.setText("You Won!");
                }
                else if(Check.check("Rock").equals("Defeat")){
                    tvC.setText(String.valueOf( 1 + Integer.parseInt((String) tvC.getText())));
                    tvN.setText("You Lost!");
                }
                else {
                    tvN.setText("Draw!");
                }
            }
        });

        btnPaper.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView tvP = findViewById(R.id.player);
                TextView tvC = findViewById(R.id.cpu);
                TextView tvN = findViewById(R.id.notification);
                if(Check.check("Paper").equals("Victory")){
                    tvP.setText(String.valueOf( 1 + Integer.parseInt((String) tvP.getText())));
                    tvN.setText("You Won!");
                }
                else if(Check.check("Paper").equals("Defeat")){
                    tvC.setText(String.valueOf( 1 + Integer.parseInt((String) tvC.getText())));
                    tvN.setText("You Lost!");
                }
                else {
                    tvN.setText("Draw!");
                }
            }
        });

        btnScissors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView tvP = findViewById(R.id.player);
                TextView tvC = findViewById(R.id.cpu);
                TextView tvN = findViewById(R.id.notification);
                if(Check.check("Scissors").equals("Victory")){
                    tvP.setText(String.valueOf( 1 + Integer.parseInt((String) tvP.getText())));
                    tvN.setText("You Won!");
                }
                else if(Check.check("Scissors").equals("Defeat")){
                    tvC.setText(String.valueOf( 1 + Integer.parseInt((String) tvC.getText())));
                    tvN.setText("You Lost!");
                }
                else {
                    tvN.setText("Draw!");
                }
            }
        });


        }
    }

