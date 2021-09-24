package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity9 extends AppCompatActivity {

    ImageButton imageButton676;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        imageButton676=(ImageButton)  findViewById(R.id.imageButton676);
        imageButton676.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {MainActivity9();}


        });

    }
    public void MainActivity9() {
        Intent intent = new Intent(this, cabin_admin.class);
        startActivity(intent);
    }
}