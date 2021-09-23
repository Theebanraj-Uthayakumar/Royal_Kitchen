package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class profile_food extends AppCompatActivity {
    private Button btn_chk;
    private ImageButton img_bck;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_profile);

        //button profile to foodmenu
        btn_chk=(Button) findViewById(R.id.btd_22);
        btn_chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {menubtn();}


        });

        img_bck=(ImageButton)  findViewById(R.id.imgbtn_1);
        img_bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {backimage();}


        });

    }
    public void menubtn(){
        Intent intent=new Intent(this,menu_food.class);
        startActivity(intent);
    }
    public void backimage() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
