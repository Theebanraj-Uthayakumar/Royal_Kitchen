package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recipe_food extends AppCompatActivity {
    private Button btn_next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_recipe);

        //button hotdeals to receipe
        btn_next = (Button) findViewById(R.id.btn_25);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recepbtn();
            }

        });
    }

            public void recepbtn(){
                Intent intent=new Intent(this,order_food.class);
                startActivity(intent);
            }


}