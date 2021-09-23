package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Booking_1 extends AppCompatActivity {

    ImageButton imageButton9;
    //Add Button
    Button button;
    //Cancel Button
    Button button8;

    private Spinner spnBrand;
    private EditText txtQuantity;
    private TextView txtdiscount;
    private TextView txttotal;

    String[] brands = {"Le Bernardin","City Grocery","Belcanto","Piazza Duomo","Odette"};

    double value;
    int quantity;
    double totalValue;
    double discountValue;


    String selectedBrand;

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

//        spnBrand = findViewById(R.id.spnBrand);
//        txtQuantity = findViewById(R.id.txtquantity);
//        txtdiscount = findViewById(R.id.txtdiscount);
//        txttotal  = findViewById(R.id.txttotal);

        checkin_date_input = (EditText) findViewById(R.id.editTextDate);
        chekin_time_input = (EditText) findViewById(R.id.editTextTime);
        numberof_cabin_input = (EditText) findViewById(R.id.editTextNumber);
        email_input = (EditText) findViewById(R.id.editTextTextPersonName);
        mobile_number = (EditText) findViewById(R.id.editTextTextPersonName1);
        spnBrand = (Spinner) findViewById(R.id.spnBrand);
        txtQuantity = (EditText) findViewById(R.id.txtquantity);
        txtdiscount = (TextView) findViewById(R.id.txtdiscount);
        txttotal  = (TextView) findViewById(R.id.txttotal);
        button = (Button) findViewById(R.id.button);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,brands);

        spnBrand.setAdapter(adapter);

        spnBrand.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedBrand = brands[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        txtQuantity.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    Log.d("onItemSelected:", selectedBrand);
                    quantity = Integer.parseInt(txtQuantity.getText().toString());
                    if (selectedBrand.equals("Le Bernardin")) {
                        value = 5000;
                        if (quantity > 5) {
                            discountValue = (value * 0.05);
                            totalValue = (value * quantity) - discountValue;
                        } else {
                            totalValue = (value * quantity);
                        }
                    } else if (selectedBrand.equals("City Grocery")) {
                        value = 3000;
                        if (quantity > 5) {
                            discountValue = (value * 0.05);
                            totalValue = (value * quantity) - discountValue;
                        } else {
                            totalValue = (value * quantity);
                        }
                    } else if (selectedBrand.equals("Belcanto")) {
                        value = 2000;
                        if (quantity > 5) {
                            discountValue = (value * 0.05);
                            totalValue = (value * quantity) - discountValue;
                        } else {
                            totalValue = (value * quantity);
                        }
                    } else if (selectedBrand.equals("Piazza Duomo")) {
                        value = 1000;
                        if (quantity > 5) {
                            discountValue = (value * 0.05);
                            totalValue = (value * quantity) - discountValue;
                        } else {
                            totalValue = (value * quantity);
                        }
                    } else if (selectedBrand.equals("Odette")) {
                        value = 4000;
                        if (quantity > 5) {
                            discountValue = (value * 0.05);
                            totalValue = (value * quantity) - discountValue;
                        } else {
                            totalValue = (value * quantity);
                        }
                    } else {
                        try {
                            throw new Exception("user not selected");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    txtdiscount.setText(String.valueOf(discountValue));
                    txttotal.setText(String.valueOf(totalValue));
                    return true;
                }
                return false;
            }
        });

        button =  (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                BookNow();
                System.out.println(checkin_date_input.getText().toString().trim());
                System.out.println(chekin_time_input.getText().toString().trim());
                System.out.println(txtQuantity.getText().toString().trim());
                System.out.println(email_input.getText().toString().trim());
                System.out.println(mobile_number.getText().toString().trim());
                System.out.println(spnBrand.getSelectedItem().toString());
                System.out.println(txtdiscount.getText().toString().trim());
                System.out.println(txttotal.getText().toString().trim());

                MyDatabaseHelper myDB = new MyDatabaseHelper(Booking_1.this);
                myDB.Booking(
                        checkin_date_input.getText().toString().trim(),
                        chekin_time_input.getText().toString().trim(),
                        txtQuantity.getText().toString().trim(),
                        email_input.getText().toString().trim(),
                        mobile_number.getText().toString().trim(),
                        spnBrand.getSelectedItem().toString(),
                        txtdiscount.getText().toString().trim(),
                        txttotal.getText().toString().trim()
                );
            }
        });

        button8 =  (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cancel();
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