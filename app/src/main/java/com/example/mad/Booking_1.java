package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Booking_1 extends AppCompatActivity {

    ImageButton imageButton9;
    Button button;
    Button button8;

//    Theeban

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_1);

        imageButton9 =  findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        button =  (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookNow();
            }
        });

        button8 =  (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cancel();
            }
        });
    }

    public void back(){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }

    public void BookNow(){
        Intent intent = new Intent(this, Payment_1.class);
        startActivity(intent);
    }

    public void Cancel(){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}