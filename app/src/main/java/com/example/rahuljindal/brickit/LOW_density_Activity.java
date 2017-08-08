package com.example.rahuljindal.brickit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LOW_density_Activity extends AppCompatActivity {
    Button[] buttons;
    Button[] text_buttons;
    int c=0;
    int[] bl;
    int color1=0xFF1B5E20;
    int color2=0xFFD32F2F;

//    EditText p1=(EditText)findViewById(R.id.editText_player1);
//    EditText p2=(EditText)findViewById(R.id.editText_player_2);

    public String Player1 ="d";// = "ri";//MainActivity.play1; //getIntent().getStringExtra(MainActivity.playe1);
    public String Player2 ="j" ;// = "gh";//MainActivity.play2;// getIntent().getStringExtra(MainActivity.playe2);
    int player1 = 0;
    int player2 = 0;

    public void checks(int l,int x ,int y ,int z,int g){
        if(bl[l]==0){
            if(c%2==0){
                buttons[l].setBackgroundColor(color1);
                c++;
                bl[l]=1;
                if((bl[x]!=0)&&(bl[y]!=0)&&(bl[z]!=0)){
                    text_buttons[g].setText(Player1);
                    player1++;
                    c--;
                }
            }
            else{
                buttons[l].setBackgroundColor(color2);
                c++;
                bl[l]=2;
                if((bl[x]!=0)&&(bl[y]!=0)&&(bl[z]!=0)){
                    text_buttons[g].setText(Player2);
                    player2++;
                    c--;
                }
            }
        if((player1+player2)==32){
            score();
        }
        }
    }

    public void checks(int l, int a, int b, int c1, int x, int y, int z, int g, int h){
        if(bl[l]==0){
            if(c%2==0){
                buttons[l].setBackgroundColor(color1);
                c++;
                bl[l]=1;
                if(((bl[a]!=0)&&(bl[b]!=0)&&(bl[c1]!=0))||((bl[x]!=0)&&(bl[y]!=0)&&(bl[z]!=0))){
                    c--;
                    if((bl[a]!=0)&&(bl[b]!=0)&&(bl[c1]!=0)){
                        text_buttons[g].setText(Player1);
                        player1++;
                    }
                    if((bl[x]!=0)&&(bl[y]!=0)&&(bl[z]!=0)){
                        text_buttons[h].setText(Player1);
                        player1++;
                    }
                }
            }
            else{
                buttons[l].setBackgroundColor(color2);
                c++;
                bl[l]=2;
                if(((bl[a]!=0)&&(bl[b]!=0)&&(bl[c1]!=0))||((bl[x]!=0)&&(bl[y]!=0)&&(bl[z]!=0))){
                    c--;
                    if((bl[a]!=0)&&(bl[b]!=0)&&(bl[c1]!=0)){
                        text_buttons[g].setText(Player2);
                        player2++;
                    }
                    if((bl[x]!=0)&&(bl[y]!=0)&&(bl[z]!=0)){
                        text_buttons[h].setText(Player2);
                        player2++;
                    }
                }}
            if((player1+player2)==32){
                score();
            }

        }}

    public void score(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("RESULT").setCancelable(false).setMessage(Player1.toUpperCase() + " Score = " + player1 + "\n" +
                Player2.toUpperCase() + " Score =" + player2 +
                "\nDo you want to play again");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void reset(){
        this.recreate();
    }

    public void button_line1(View view){
    checks(0,9,4,5,0);
    }
    public void button_line2(View view){
        checks(1,10,5,6,1);
    }
    public void button_line3(View view){
        checks(2,6,11,7,2);
    }
    public void button_line4(View view){
        checks(3,12,7,8,3);
    }
    public void button_line5(View view){
        checks(4,0,5,9,0);
    }
    public void button_line6(View view){
        checks(5, 4, 0, 9, 1, 6, 10, 0, 1);
    }
    public void button_line7(View view){
        checks(6, 5, 1, 10, 2, 7, 11, 1, 2);
    }
    public void button_line8(View view){
        checks(7, 2, 6, 11, 3, 8, 12, 2, 3);
    }
    public void button_line9(View view){
        checks(8, 3, 7, 12, 3);
    }
    public void button_line10(View view){
        checks(9, 0, 4, 5, 13, 18, 14, 0, 4);
    }
    public void button_line11(View view){
        checks(10, 1, 5, 6, 14, 19, 15, 1, 5);
    }
    public void button_line12(View view){
        checks(11, 2, 6, 7, 15, 20, 16, 2, 6);
    }
    public void button_line13(View view){
        checks(12, 3, 7, 8, 16, 21, 17, 3, 7);
    }
    public void button_line14(View view){
        checks(13, 14, 9, 18, 4);
    }
    public void button_line15(View view){
        checks(14, 13, 9, 18, 10, 15, 19, 4, 5);
    }
    public void button_line16(View view){
        checks(15, 14, 10, 19, 11, 16, 20, 5, 6);
    }
    public void button_line17(View view){
        checks(16, 11, 15, 20, 17, 12, 21, 6, 7);
    }
    public void button_line18(View view){
        checks(17, 12, 16, 21, 7);
    }
    public void button_line19(View view){
        checks(18, 9, 13, 14, 27, 22, 23, 4, 8);
    }
    public void button_line20(View view){
        checks(19, 10, 14, 15, 28, 23, 24, 5, 9);
    }
   public void button_line21(View view){
       checks(20, 11, 15, 16, 24, 25, 29, 6, 10);
   }
    public void button_line22(View view){
        checks(21, 12, 16, 17, 25, 30, 26, 7, 11);
    }
    public void button_line23(View view){
        checks(22, 18, 23, 27, 8);
    }
    public void button_line24(View view){
        checks(23, 22, 18, 27, 19, 24, 28, 8, 9);
    }
    public void button_line25(View view){
        checks(24, 19, 23, 28, 20, 25, 29, 9, 10);
    }
    public void button_line26(View view){
        checks(25, 20, 24, 29, 21, 26, 30, 10, 11);
    }
    public void button_line27(View view){
        checks(26, 21, 25, 30, 11);
    }
    public void button_line28(View view){
        checks(27, 18, 22, 23, 31, 36, 32, 8, 12);
    }
    public void button_line29(View view){
        checks(28, 19, 23, 24, 37, 32, 33, 9, 13);
    }
    public void button_line30(View view){
        checks(29, 20, 24, 25, 33, 38, 34, 10, 14);
    }
    public void button_line31(View view){
        checks(30, 21, 25, 26, 39, 34, 35, 11, 15);
    }
    public void button_line32(View view){
        checks(31, 27, 32, 36, 12);
    }
    public void button_line33(View view){
        checks(32, 31, 27, 36, 28, 33, 37, 12, 13);
    }
    public void button_line34(View view){
        checks(33, 32, 28, 37, 29, 34, 38, 13, 14);
    }
    public void button_line35(View view){
        checks(34, 33, 29, 38, 30, 35, 39, 14, 15);
    }
    public void button_line36(View view){
        checks(35, 34, 30, 39, 15);
    }
    public void button_line37(View view){
        checks(36, 27, 31, 32, 45, 40, 41, 12, 16);
    }
    public void button_line38(View view){
        checks(37, 28, 32, 33, 46, 41, 42, 13, 17);
    }
    public void button_line39(View view){
        checks(38, 29, 33, 34, 47, 42, 43, 14, 18);
    }
    public void button_line40(View view){
        checks(39, 30, 34, 35, 43, 48, 44, 15, 19);
    }
    public void button_line41(View view){
        checks(40, 41, 36, 45, 16);
    }
    public void button_line42(View view){
        checks(41, 40, 36, 45, 42, 37, 46, 16, 17);
    }
    public void button_line43(View view){
        checks(42, 41, 37, 46, 43, 38, 47, 17, 18);
    }
    public void button_line44(View view){
        checks(43, 42, 38, 47, 39, 44, 48, 18, 19);
    }
    public void button_line45(View view){
        checks(44, 39, 43, 48, 19);
    }
    public void button_line46(View view){
        checks(45, 36, 40, 41, 54, 49, 50, 16, 20);
    }
    public void button_line47(View view){
        checks(46, 37, 41, 42, 55, 50, 51, 17, 21);
    }
    public void button_line48(View view){
        checks(47, 38, 42, 43, 56, 51, 52, 18, 22);
    }
    public void button_line49(View view){
        checks(48, 39, 43, 44, 57, 52, 53, 19, 23);
    }
    public void button_line50(View view){
        checks(49, 50, 45, 54, 20);
    }
    public void button_line51(View view){
        checks(50, 49, 45, 54, 51, 46, 55, 20, 21);
    }
    public void button_line52(View view){
        checks(51, 50, 46, 55, 52, 47, 56, 21, 22);
    }
    public void button_line53(View view){
        checks(52, 51, 47, 56, 53, 48, 57, 22, 23);
    }
    public void button_line54(View view){
        checks(53, 52, 48, 57, 23);
    }
    public void button_line55(View view){
        checks(54, 45, 49, 50, 58, 63, 59, 20, 24);
    }
    public void button_line56(View view){
        checks(55, 46, 50, 51, 64, 59, 60, 21, 25);
    }
    public void button_line57(View view){
        checks(56, 47, 51, 52, 65, 60, 61, 22, 26);
    }
    public void button_line58(View view){
        checks(57, 48, 52, 53, 66, 61, 62, 23, 27);
    }
    public void button_line59(View view){
        checks(58, 59, 54, 63, 24);
    }
    public void button_line60(View view){
        checks(59, 58, 54, 63, 55, 60, 64, 24, 25);
    }
    public void button_line61(View view){
        checks(60, 59, 55, 64, 56, 61, 65, 25, 26);
    }
    public void button_line62(View view){
        checks(61, 60, 56, 65, 57, 62, 66, 26, 27);
    }
    public void button_line63(View view){
        checks(62, 61, 57, 66, 27);
    }
    public void button_line64(View view){
        checks(63, 54, 58, 59, 67, 72, 68, 24, 28);
    }
    public void button_line65(View view){
        checks(64, 55, 59, 60, 68, 73, 69, 25, 29);
    }
    public void button_line66(View view){
        checks(65, 56, 60, 61, 69, 74, 70, 26, 30);
    }
    public void button_line67(View view){
        checks(66, 57, 61, 62, 70, 75, 71, 27, 31);
    }
    public void button_line68(View view){
        checks(67, 63, 68, 72, 28);
    }
    public void button_line69(View view){
        checks(68, 63, 67, 72, 64, 69, 73, 28, 29);
    }
    public void button_line70(View view){
        checks(69, 68, 64, 73, 65, 74, 70, 29, 30);
    }
    public void button_line71(View view){
        checks(70, 69, 65, 74, 66, 71, 75, 30, 31);
    }
    public void button_line72(View view){
        checks(71, 66, 70, 75, 31);
    }
    public void button_line73(View view){
        checks(72,63,67,68,28);
    }
    public void button_line74(View view){
        checks(73,64,68,69,29);
    }
    public void button_line75(View view){
        checks(74,65,69,70,30);
    }
    public void button_line76(View view){
        checks(75,66,70,71,31);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_density_);

//        Bundle extras = getIntent().getExtras();
//        Player1 = extras.getString("PLAYER1NAME");
//        Player2 = extras.getString("PLAYER2NAME");

        buttons = new  Button[76];
        text_buttons =new Button[32];
        bl = new int[76];


        for(int i=0;i<buttons.length;i++){
        String buttonId = "button_line"+(i+1);

            int resID = getResources().getIdentifier(buttonId, "id", getPackageName());
            buttons[i] = ((Button) findViewById(resID));

        }
        for (int j=0;j<text_buttons.length;j++){

            String textbuttonID = "button_text"+(j+1);

            int resID1 = getResources().getIdentifier(textbuttonID,"id",getPackageName());
            text_buttons[j] = ((Button) findViewById(resID1));

        }
        for(int j=0;j<bl.length;j++){
            bl[j]=0;
        }
    }

}
