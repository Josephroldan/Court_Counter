package com.example.student.court_counter;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AlertDialog gameOverAlert;
    private MediaPlayer soundFXthing;
    private TextView textView1Variable;

    private TextView textView2Variable;

    public int a = 0;

    public int b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1Variable = (TextView)findViewById(R.id.textView1Name);
        textView1Variable.setText( String.valueOf(a)  );


        textView2Variable = (TextView)findViewById(R.id.textView2Name);
        textView2Variable.setText( String.valueOf(b)  );

        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();
        soundFXthing= MediaPlayer.create(this , R.raw.bannana);

    }

    public void clickFunction1(View view){
        soundFXthing.start();
   textView1Variable.setText("" + a);
        a++;





    }



    public void clickFunction2(View view) {
        soundFXthing.start();
        textView2Variable.setText("" + b);
        b++;


    }



    public void subtractFunction1(View view) {
        soundFXthing.start();
        a--;
        textView1Variable.setText("" + a);
    }
    public void subtractFunction2(View view) {
        soundFXthing.start();
        b--;
        textView1Variable.setText("" + b);

    }
    public void resetClick (View view){



        gameOverAlert.setTitle("Winner");



        if (a > b) {
            gameOverAlert.setMessage("Team Log Horizon wins");
        }else {
            gameOverAlert.setMessage("The Black Knights win");

        }

        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        gameOverAlert.show();

        a = 0;
        b = 0;

        textView2Variable.setText("" + b);
        textView1Variable.setText("" + a);


    }




}
