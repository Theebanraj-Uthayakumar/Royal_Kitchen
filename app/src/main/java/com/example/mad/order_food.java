package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class order_food extends AppCompatActivity {

    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_order);

        textView =  findViewById(R.id.t8);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Back();
            }
        });

        textView2 =  findViewById(R.id.t9);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
    }

    public void Back(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void Add(){
        Intent intent = new Intent(this, add_food.class);
        startActivity(intent);
    }
}