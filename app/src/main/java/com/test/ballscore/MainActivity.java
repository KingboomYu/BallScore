package com.test.ballscore;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ShowScorea;
    TextView ShowScoreb;
    int scorea = 0;
    int scoreb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowScorea = (TextView) findViewById(R.id.scorea);
        ShowScoreb = (TextView) findViewById(R.id.scoreb);
    }

    public void click(View btn) {

        if(btn.getId() == R.id.button3){
            scorea += 3;
        }else if(btn.getId() == R.id.button2){
            scorea += 2;
        }else if(btn.getId() == R.id.button1){
            scorea ++;
        }
        ShowScorea.setText(String.valueOf(scorea));
        if(btn.getId() == R.id.buttonb3){
            scoreb += 3;
        }else if(btn.getId() == R.id.buttonb2){
            scoreb += 2;
        }else if(btn.getId() == R.id.buttonb1){
            scoreb ++;
        }
        ShowScoreb.setText(String.valueOf(scoreb));
        if(btn.getId() == R.id.reset){
            scorea = 0;
            scoreb = 0;
            ShowScorea.setText(String.valueOf(0));
        }
    }
}