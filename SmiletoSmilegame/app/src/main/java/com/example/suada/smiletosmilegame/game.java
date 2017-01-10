package com.example.suada.smiletosmilegame;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.Color.RED;
import static com.example.suada.smiletosmilegame.R.id.end;
import static com.example.suada.smiletosmilegame.R.id.start;


public class game extends Activity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int turn;

    String name1;
    String name2;
    Boolean isPlay = false;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Bundle taking = getIntent().getExtras();
        name1 = taking.getString("player1");
        name2 = taking.getString("player2");
        Button home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(game.this, MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        Button playagain = (Button) findViewById(R.id.playagain);
        playagain.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(game.this, game.class);
                intent.putExtra("player1",name1);
                intent.putExtra("player2",name2);
                startActivityForResult(intent, 0);
            }
        });

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b1.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b1.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b1.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b2.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b2.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b2.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b3.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b3.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b3.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b4.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b4.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b4.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b5.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b5.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b5.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b6.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b6.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b6.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b7.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b7.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b7.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay==false) {
                    if (b8.getText().toString().equals("")) {
                        if (turn == 1) {
                            turn = 2;
                            b8.setText("X");
                        } else if (turn == 2) {
                            turn = 1;
                            b8.setText("O");
                        }
                    }
                    isPlay = endGame();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if(isPlay==false) {
               if (b9.getText().toString().equals("")) {
                   if (turn == 1) {
                       turn = 2;
                       b9.setText("X");
                   } else if (turn == 2) {
                       turn = 1;
                       b9.setText("O");
                   }
               }
               isPlay = endGame();
           }
            }
        });
}

public Boolean  endGame(){
    String a, b, c, d, e, f, g, h, i;
    a = b1.getText().toString();
    b = b2.getText().toString();
    c = b3.getText().toString();

    d = b4.getText().toString();
    e = b5.getText().toString();
    f = b6.getText().toString();

    g = b7.getText().toString();
    h = b8.getText().toString();
    i = b9.getText().toString();

    //bellow row
    if(a.equals(b)&&a.equals(c)){
        if(a.equals("X")) {msg(name1 + " is winner!");setColorBtn(b1,b2,b3);return true;}
        else
        if(a.equals("O")) {msg(name2 + " is winner!");setColorBtn(b1,b2,b3);return true;}

    }
    //mid row
    if(d.equals(e)&&d.equals(f)){
        if(d.equals("X")) {msg(name1 + " is winner!");setColorBtn(b4,b5,b6);return true;}
        else
        if(d.equals("O")) {msg(name2 + " is winner!");setColorBtn(b4,b5,b6);return true;}
    }
    //up row
    if(g.equals(h)&&g.equals(i)){
        if(g.equals("X")) {msg(name1 + " is winner!");setColorBtn(b7,b8,b9);return true;}
        else
        if(g.equals("O")) {msg(name2 + " is winner!");setColorBtn(b7,b8,b9);return true;}
    }
    //colom 1
    if(a.equals(g)&&a.equals(d)){
        if(a.equals("X")) {msg(name1 + " is winner!");setColorBtn(b1,b7,b4);return true;}
        if(a.equals("O")) {msg(name2 + " is winner!");setColorBtn(b1,b7,b4);return true;}
    }
    //colom 2
    if(b.equals(e)&&b.equals(h)){
        if(b.equals("X")) {msg(name1 + "is winner!");setColorBtn(b2,b5,b8);return true;}
        if(b.equals("O")) {msg(name2 + "is winner!");setColorBtn(b2,b5,b8);return true;}
    }
    //colom 3
    if(c.equals(i)&&c.equals(f)){
        if(c.equals("X")) {msg(name1 + " is winner!");setColorBtn(b3,b9,b6);return true;}
        if(c.equals("O")) {msg(name2 + " is winner!");setColorBtn(b3,b9,b6);return true;}
    }
    //cros1
    if(c.equals(d)&&c.equals(h)){
        if(c.equals("X")) {msg(name1 + " is winner!");setColorBtn(b3,b4,b8);return true;}
        if(c.equals("O")) {msg(name2 +" is winner!");setColorBtn(b3,b4,b8);return true;}
    }
    //cros2
    if(a.equals(f)&&a.equals(h)){
        if(a.equals("X")) {msg(name1 + " is winner!");setColorBtn(b1,b6,b8);return true;}
        if(a.equals("O")) {msg(name2 + " is winner!");setColorBtn(b1,b6,b8);return true;}
    }
    if(!a.equals("")&&!b.equals("")&&!c.equals("")&&!d.equals("")&&!e.equals("")&&!f.equals("")&&
            !g.equals("")&&!h.equals("")&&!i.equals("")){msg("DRAW !");return true;}


    return false;
}
    public void msg(String s){
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
    @Override
    public void onBackPressed(){
        Intent toUser = new Intent(game.this,userinput.class);
        startActivity(toUser);
    }
    public void setColorBtn(Button a,Button b,Button c){
        a.setTextColor(RED);
        b.setTextColor(RED);
        c.setTextColor(RED);
    }
}