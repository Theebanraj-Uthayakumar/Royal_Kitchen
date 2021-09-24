package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class cabin_admin extends AppCompatActivity {


    TextView textView138;

    ImageButton imageButton4567;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabin_admin);

        textView138 =  findViewById(R.id.textView138);
        textView138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back1();
            }
        });




        imageButton4567=(ImageButton)  findViewById(R.id.imageButton4567) ;
        imageButton4567.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {next();}


        });




    }
    public void back1(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }
    public void next(){
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);


    }
}