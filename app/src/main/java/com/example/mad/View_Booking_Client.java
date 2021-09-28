package com.example.mad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class View_Booking_Client extends AppCompatActivity {

    RecyclerView recyclearView;
    MyDatabaseHelper myDB;
    ArrayList<String > Booking_id, check_date, check_time, cabin_type, number_of_cabin, email, cnumber, discount, fare;
    CustomAdapter customAdapter;
    EditText searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__booking__client);
        recyclearView = findViewById(R.id.recyclerview);

        myDB = new MyDatabaseHelper(View_Booking_Client.this);
        Booking_id = new ArrayList<>();
        check_date = new ArrayList<>();
        check_time = new ArrayList<>();
        cabin_type = new ArrayList<>();
        number_of_cabin = new ArrayList<>();
        email = new ArrayList<>();
        cnumber = new ArrayList<>();
        discount = new ArrayList<>();
        fare = new ArrayList<>();

        storeDataInArrays();

        customAdapter = new CustomAdapter(View_Booking_Client.this,this ,Booking_id, check_date,
                check_time, cabin_type, number_of_cabin, email, cnumber, discount, fare);
        recyclearView.setAdapter(customAdapter);
        recyclearView.setLayoutManager(new LinearLayoutManager(View_Booking_Client.this));

        searchBar = findViewById(R.id.search_field);
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                
            }

            @Override
            public void afterTextChanged(Editable s) {
//                filter(s.toString());
            }
        });

    }

//    private void filter(String text){
//        ArrayList<ExampleItem> filteredList = new ArrayList<ExampleItem>();
//
//        for(ExampleItem item : mExampleList){
//            if(item.get)
//        }
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            recreate();
        }
    }

    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
        if(cursor.getCount() == 0){
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }else{
            while (cursor.moveToNext()){
                Booking_id.add(cursor.getString(0));
                check_date.add(cursor.getString(1));
                check_time.add(cursor.getString(2));
                cabin_type.add(cursor.getString(3));
                number_of_cabin.add(cursor.getString(4));
                email.add(cursor.getString(5));
                cnumber.add(cursor.getString(6));
                discount.add(cursor.getString(7));
                fare.add(cursor.getString(8));
            }
        }
    }
}