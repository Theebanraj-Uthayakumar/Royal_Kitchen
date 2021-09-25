package com.example.mad;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update_Booking extends AppCompatActivity {

    EditText Booking_id, check_date, check_time, cabin_type, number_of_cabin, email, cnumber, discount, fare;
    Button update_button;

    String id, checkdate, checktime, cabintype, numberofcabin, e_mail, c_number, discount_2, fare_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__booking);

        check_date = findViewById(R.id.editTextDate_2);
        check_time = findViewById(R.id.editTextTime_2);
        cabin_type = findViewById(R.id.spnBrand_2);
        number_of_cabin = findViewById(R.id.txtquantity_2);
        email = findViewById(R.id.editTextTextPersonName_2);
        cnumber = findViewById(R.id.editTextTextPersonName1_2);
        discount = findViewById(R.id.txtdiscount_2);
        fare = findViewById(R.id.txttotal_2);
        update_button = findViewById(R.id.button_2);
        //First we call this
        getAndSetIntentData();

//        ActionBar ab = getSupportActionBar();
//        if (ab != null) {
//            ab.setTitle(e_mail);
//        }

        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //And only then we call this
                MyDatabaseHelper myDB = new MyDatabaseHelper(Update_Booking.this);
                myDB.updatedata(id, checkdate, checktime, cabintype, numberofcabin, e_mail, c_number, discount_2, fare_2);
            }
        });
    }

//    && getIntent().hasExtra("cabintype")
    void getAndSetIntentData(){
        if(getIntent().hasExtra("id") && getIntent().hasExtra("checkdate") && getIntent().hasExtra("checktime") && getIntent().hasExtra("cabintype")
                && getIntent().hasExtra("numberofcabin") && getIntent().hasExtra("email") && getIntent().hasExtra("cnumber") && getIntent().hasExtra("discount")
                && getIntent().hasExtra("fare")){
            //Getting Data from Intent
            id = getIntent().getStringExtra("id");
            checkdate = getIntent().getStringExtra("checkdate");
            checktime = getIntent().getStringExtra("checktime");
            cabintype = getIntent().getStringExtra("cnumber");
            numberofcabin = getIntent().getStringExtra("cabintype");
            e_mail = getIntent().getStringExtra("numberofcabin");
            c_number = getIntent().getStringExtra("email");
            discount_2 = getIntent().getStringExtra("discount");
            fare_2 = getIntent().getStringExtra("fare");

            //Setting Intent Data
            check_date.setText(checkdate);
            check_time.setText(checktime);
            number_of_cabin.setText(numberofcabin);
            email.setText(e_mail);
            cnumber.setText(c_number);
            cabin_type.setText(cabintype);
            discount.setText(discount_2);
            fare.setText(fare_2);

        }else{
            Toast.makeText(this, "No data...",Toast.LENGTH_SHORT).show();
        }
    }
}