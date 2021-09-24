package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class order_food extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    Button btn_edt;
    Button btn_dlt;

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
        btn_dlt=findViewById(R.id.btn_f);
        btn_dlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){ Del_food();}


        });

        btn_edt=findViewById(R.id.btn_f1);
        btn_edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Edt_food();}


        });
    }
//Back function
    public void Back(){
        Intent intent = new Intent(this, recipe_food.class);
        startActivity(intent);
    }
//Add function
    public void Add(){
        Intent intent = new Intent(this, add_food.class);
        startActivity(intent);
    }
    //Delete
    public void Del_food(){
        Intent intent = new Intent();
        startActivity(intent);
    }
    // Edit
    public void Edt_food() {
        Intent intent = new Intent();
        startActivity(intent);


    }



}