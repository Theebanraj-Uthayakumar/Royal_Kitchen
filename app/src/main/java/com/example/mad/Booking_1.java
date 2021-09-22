package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Booking_1 extends AppCompatActivity {

    ImageButton imageButton9;
    //Add Button
    Button button;
    //Cancel Button
    Button button8;

    EditText checkin_date_input, chekin_time_input, numberof_cabin_input, email_input, mobile_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_1);

//        imageButton9 =  findViewById(R.id.imageButton9);
//        imageButton9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                back();
//            }
//        });

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

        checkin_date_input = (EditText) findViewById(R.id.editTextDate);
        chekin_time_input = (EditText) findViewById(R.id.editTextTime);
        numberof_cabin_input = (EditText) findViewById(R.id.editTextNumber);
        email_input = (EditText) findViewById(R.id.editTextTextPersonName);
        mobile_number = (EditText) findViewById(R.id.editTextTextPersonName1);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(Booking_1.this);
                myDB.Booking(
                        checkin_date_input.getText().toString().trim(),
                        chekin_time_input.getText().toString().trim(),
                        Integer.valueOf(numberof_cabin_input.getText().toString().trim()),
                        email_input.getText().toString().trim(),
                        Integer.valueOf(mobile_number.getText().toString().trim()));
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