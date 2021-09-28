package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity9 extends AppCompatActivity {

//    ImageButton imageButton676;
        Button button173;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


//        button173


        button173 = (Button) findViewById(R.id.button173);
        button173.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, Booking_1.class);
                startActivity(intent);
            }
        });
//        Intent intent = new Intent(MainActivity9.this, Booking_1.class);
//        startActivity(intent);
//        imageButton676=(ImageButton)  findViewById(R.id.imageButton676);
//        imageButton676.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {MainActivity9();}
//
//        });




    }
//    public void MainActivity9() {
//        Intent intent = new Intent(this, cabin_choose.class);
//        startActivity(intent);
//
//    }
}