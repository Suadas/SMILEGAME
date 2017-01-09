package com.example.suada.smiletosmilegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by suada on 06.01.2017..
 */

public class oponent extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oponent);


        Button oponentcenter = (Button) findViewById(R.id.oponentcenter);
        oponentcenter.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(oponent.this, oponentcenter.class);
                startActivityForResult(intent, 0);
            }
        });
        Button oponentcorner = (Button) findViewById(R.id.oponentcorner);
        oponentcorner.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(oponent.this, oponentcorner.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
