package com.example.suada.smiletosmilegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by suada on 06.01.2017..
 */

public class userinput extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userinput);
        final EditText player1 = (EditText)findViewById(R.id.editText2);
        final EditText player2 = (EditText)findViewById(R.id.editText3);


        Button play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            if(!player1.getText().toString().equals("")){
                if(!player2.getText().toString().equals("")) {
                Intent intent = new Intent(userinput.this, game.class);
                String p1 = player1.getText().toString();
                String p2 = player2.getText().toString();
                intent.putExtra("player1", p1);
                intent.putExtra("player2", p2);
                startActivityForResult(intent, 0);
            }else
                    Toast.makeText(getApplicationContext(),"PUT THE PLAYER 2 NAME PLEASE!",Toast.LENGTH_LONG).show();
            }else
                Toast.makeText(getApplicationContext(),"PUT THE PLAYER 1 NAME PLEASE!",Toast.LENGTH_LONG).show();
            }
        });
}}
