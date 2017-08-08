package com.example.rahuljindal.brickit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//    public static final String playe1 = "com.example.rahuljindal.brickit.play1";
//    public static final String playe2 = "com.example.rahuljindal.brickit.play2";

    public void play(View view){
        Intent intent = new Intent(MainActivity.this ,LOW_density_Activity.class);
      //  Bundle bundle = new Bundle();
        //bundle .putString("PLAYER1NAME",play1);
       // bundle .putString("PLAYER2NAME",play2);
       // intent.putExtras(bundle);
        startActivity(intent);
        new ViewHelper(this);

    }
    public Button button;
   // public EditText player1;
   // public EditText player2;
    public static String play1;
    public static String play2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button_play);
     //   player1 =(EditText)findViewById(R.id.editText_player1);
       // play1 = player1.getText().toString();
       // player2 =(EditText)findViewById(R.id.editText_player_2);
       // play2 = player2.getText().toString();
    }
}
