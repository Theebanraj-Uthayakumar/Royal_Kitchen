package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity14 extends AppCompatActivity {

    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

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
        Intent intent = new Intent(this, MainActivity15.class);
        startActivity(intent);
    }
}