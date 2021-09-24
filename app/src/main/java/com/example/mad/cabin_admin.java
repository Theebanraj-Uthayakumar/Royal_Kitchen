package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cabin_admin extends AppCompatActivity {


    TextView textView138;
    CardView card01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabin_admin);

        textView138 =  findViewById(R.id.textView138);
        textView138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        card01=(CardView) findViewById(R.id.card01) ;
        card01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {cabin_admin();}


        });


    }
    public void cabin_admin(){
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);

    }
    public void back(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }
}