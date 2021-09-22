package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainButtion extends AppCompatActivity {


//    Buttons
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buttion);

        button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });

        button2 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBooking();
            }
        });

        button3 = (Button) findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPayment();
            }
        });

        button4 = (Button) findViewById(R.id.button6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBooking_C();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBooking_A();
            }
        });

        button6 = (Button) findViewById(R.id.button7);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shothiri01();
            }
        });

        button7 = (Button) findViewById(R.id.button9);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shothiri02();
            }
        });

        button8 = (Button) findViewById(R.id.button10);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shothiri03();
            }
        });

        button9 = (Button) findViewById(R.id.button11);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shothiri04();
            }
        });

        button10 = (Button) findViewById(R.id.button12);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shothiri05();
            }
        });

        button11 = (Button) findViewById(R.id.button13);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shothiri06();
            }
        });

        button12 = (Button) findViewById(R.id.button14);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jerry01();
            }
        });

        button13 = (Button) findViewById(R.id.button15);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jerry02();
            }
        });

        button14 = (Button) findViewById(R.id.button16);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jerry03();
            }
        });

        button15 = (Button) findViewById(R.id.button17);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jerry04();
            }
        });

        button16 = (Button) findViewById(R.id.button18);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jerry05();
            }
        });
        button17 = (Button) findViewById(R.id.button19);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Abi01();
            }
        });
        button18 = (Button) findViewById(R.id.button20);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Abi02();
            }
        });
        button19 = (Button) findViewById(R.id.button21);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Abi03();
            }
        });
        button20 = (Button) findViewById(R.id.button22);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Abi04();
            }
        });
        button21 = (Button) findViewById(R.id.button23);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Abi05();
            }
        });
    }

    public void openHomeActivity(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openBooking(){
        Intent intent = new Intent(this, Booking_1.class);
        startActivity(intent);
    }
    public void openPayment(){
        Intent intent = new Intent(this, Payment_1.class);
        startActivity(intent);
    }
    public void openBooking_C(){
        Intent intent = new Intent(this, View_Booking_Client.class);
        startActivity(intent);
    }
    public void openBooking_A(){
        Intent intent = new Intent(this, View_Booking_admin.class);
        startActivity(intent);
    }
    public void shothiri01(){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
    public void shothiri02(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void shothiri03(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void shothiri04(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void shothiri05(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void shothiri06(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void jerry01(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void jerry02(){
        Intent intent = new Intent(this, cabin_choose.class);
        startActivity(intent);
    }
    public void jerry03(){
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }
    public void jerry04(){
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);
    }
    public void jerry05(){
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);
    }
    public void Abi01(){
        Intent intent = new Intent(this, menu_food.class);
        startActivity(intent);
    }
    public void Abi02(){
        Intent intent = new Intent(this, recipe_food.class);
        startActivity(intent);
    }
    public void Abi03(){
        Intent intent = new Intent(this, order_food.class);
        startActivity(intent);
    }
    public void Abi04(){
        Intent intent = new Intent(this, add_food.class);
        startActivity(intent);
    }
    public void Abi05(){
        Intent intent = new Intent(this, profile_food.class);
        startActivity(intent);
    }
}