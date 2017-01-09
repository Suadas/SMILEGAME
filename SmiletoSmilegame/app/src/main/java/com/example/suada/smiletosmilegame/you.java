package com.example.suada.smiletosmilegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by suada on 06.01.2017..
 */

public class you extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you);


        Button youcenter = (Button) findViewById(R.id.youcenter);
        youcenter.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(you.this, youcenter.class);
                startActivityForResult(intent, 0);
            }
        });
        Button youcorner = (Button) findViewById(R.id.youcorner);
        youcorner.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(you.this, youcorner.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
