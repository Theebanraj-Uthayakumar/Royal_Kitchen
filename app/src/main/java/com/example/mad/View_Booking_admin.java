package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class View_Booking_admin extends AppCompatActivity {

    TextView textView13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__booking_admin);

        textView13 =  findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking();
            }
        });
    }
    public void Booking(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}