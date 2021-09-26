package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

//    CardView cardView01;
//    CardView cardView02;

//    CardView cardView;
    TextView textView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //text
        textView =  findViewById(R.id.textView50);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cabin();
            }
        });
    }

    public void Cabin(){

        Intent intent = new Intent(this, cabin_choose.class);

        startActivity(intent);

    }


}