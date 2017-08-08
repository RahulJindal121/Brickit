package com.example.rahuljindal.brickit;


import android.app.Activity;
import android.widget.EditText;


public class ViewHelper {

    private final Activity activity;

    public ViewHelper(Activity activity) {
        this.activity=activity;
    }

    public String player1(){
        EditText player1 = (EditText)activity.findViewById(R.id.editText_player1);
        String p1 =player1.getText().toString();
        return p1;
    }

    public String player2(){
        EditText player2 = (EditText)activity.findViewById(R.id.editText_player_2);
        String p2 =player2.getText().toString();
        return p2;
    }

}
