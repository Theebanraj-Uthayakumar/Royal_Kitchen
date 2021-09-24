package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class cabin_choose extends AppCompatActivity {

     TextView textView138;
     CardView card01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabin_choose);

        textView138 =  findViewById(R.id.textView138);
        textView138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cabin_choose();
            }
        });

        card01=(CardView) findViewById(R.id.card01) ;
        card01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {cabin_choose();}


        });
    }
    public void cabin_choose(){
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }
}