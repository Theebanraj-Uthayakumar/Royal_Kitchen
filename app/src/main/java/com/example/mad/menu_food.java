package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu_food extends AppCompatActivity {
    private TextView btn_back;
    private CardView food_card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_menu);

        btn_back=(TextView) findViewById(R.id.bck_1);
        btn_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {functionback();}



            });
        food_card1=(CardView) findViewById(R.id.foodcard1) ;
        food_card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {foodcardone();}


        });
        }

        public void functionback(){
            Intent intent=new Intent(this,profile_food.class);
            startActivity(intent);

    }
    public void foodcardone(){
        Intent intent=new Intent(this,recipe_food.class);
        startActivity(intent);
    }


}