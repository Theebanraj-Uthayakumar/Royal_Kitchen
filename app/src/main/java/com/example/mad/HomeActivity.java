package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;

public class HomeActivity extends AppCompatActivity {
    Timer timer;

    CardView cardView01;
    CardView cardView02;
    CardView cardView03;
    CardView cardView04;
    CardView cardView05;
    TextView textView29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardView01 =  findViewById(R.id.card01);
        cardView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CabinCategory();
            }
        });

        cardView02 =  findViewById(R.id.card02);
        cardView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cabin();
            }
        });

        cardView03 =  findViewById(R.id.card04);
        cardView03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Foods();
            }
        });

        cardView04 =  findViewById(R.id.card05);
        cardView04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking();
            }
        });

        cardView05 =  findViewById(R.id.card06);
        cardView05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Employee();
            }
        });
        textView29 =  findViewById(R.id.textView29);
        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logout();
            }
        });
    }

    public void CabinCategory(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void Cabin(){
        Intent intent = new Intent(this, cabin_admin.class);
        startActivity(intent);

    }
    public void Foods(){
        Intent intent = new Intent(this, profile_food.class);
        startActivity(intent);
    }
    public void Booking(){
        Intent intent = new Intent(this, View_Booking_Client.class);
        startActivity(intent);
    }
    public void Employee(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void Logout(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}