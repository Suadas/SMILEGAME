package com.example.suada.smiletosmilegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by suada on 06.01.2017..
 */

public class hint extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hint);

        Button you = (Button) findViewById(R.id.you);
        you.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(hint.this, you.class);
                startActivityForResult(intent, 0);
            }
        });
        Button oponent = (Button) findViewById(R.id.oponent);
        oponent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(hint.this, oponent.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
