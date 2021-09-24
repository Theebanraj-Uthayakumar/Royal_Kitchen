package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class cabin_choose extends AppCompatActivity {
    CardView card014;
    TextView textView1389;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabin_choose);

        card014=(CardView) findViewById(R.id.card014) ;
        card014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {choose();}


        });
        textView1389 =  findViewById(R.id.textView1389);
        textView1389.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back7();
            }
        });

    }
    public void choose(){
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);

    }
    public void back7(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}