package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    //BUTTON
    private Button Button01;
    private Button Button02;
    private Button button25;
    TextView textView;

    EditText EmailAddress, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

//        Button02 = (Button) findViewById(R.id.button24);
//        Button02.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Admin_HomeActivity();
//            }
//        });
//
//        textView = findViewById(R.id.textView5);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                RegisterActivity();
//            }
//        });
//
//        button25 = (Button)findViewById(R.id.button25);
//        button25.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ButtonLink();
//            }
//        });

        EmailAddress = findViewById(R.id.EmailAddress);
        Password = findViewById(R.id.Password);

        Button01 = (Button) findViewById(R.id.button);
        Button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EmailAddress.getText().toString().equals("admin@gmail.com") && Password.getText().toString().equals("admin@123")){
                    Intent intent = new Intent(MainActivity7.this, HomeActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainActivity7.this, MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void HomeActivity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

//    public void Admin_HomeActivity(){
//        Intent intent = new Intent(this, HomeActivity.class);
//        startActivity(intent);
//    }
//    public void RegisterActivity(){
//        Intent intent = new Intent(this, register.class);
//        startActivity(intent);
//    }
//    public void ButtonLink(){
//        Intent intent = new Intent(this, MainButtion.class);
//        startActivity(intent);
//    }
}