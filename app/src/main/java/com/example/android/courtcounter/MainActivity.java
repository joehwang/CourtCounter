package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int totalscorefora=0;
    private int totalscoreforb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score){
      TextView tx=(TextView) findViewById(R.id.score_tag);
        totalscorefora+=score;
      tx.setText( String.valueOf(totalscorefora));
    }
    public void displayForTeamB(int score){
        TextView tx=(TextView) findViewById(R.id.score_tagb);
        totalscoreforb+=score;
        tx.setText( String.valueOf(totalscoreforb));
    }
    public void scoreSet3(View v){

        Log.d("dd",v.toString());
        switch (v.getId()){
            case R.id.set1_btn:
                displayForTeamA(1);
            break;

            case R.id.set2_btn:
                displayForTeamA(2);
            break;

            case R.id.set3_btn:
                displayForTeamA(3);
            break;
            case R.id.set1_btnb:
                displayForTeamB(1);
                break;

            case R.id.set2_btnb:
                displayForTeamB(2);
                break;

            case R.id.set3_btnb:
                displayForTeamB(3);
                break;
        }


    }
}
