package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity11 extends AppCompatActivity {
    ImageButton imageButton67;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        imageButton67=(ImageButton)  findViewById(R.id.imageButton67);
        imageButton67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {back12();}


        });

    }
    public void back12() {
        Intent intent = new Intent(this, cabin_admin.class);
        startActivity(intent);
    }
}