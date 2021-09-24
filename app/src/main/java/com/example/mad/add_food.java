package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_food extends AppCompatActivity {

    //submit
    Button btn_submit;

    EditText foodname_input, foodtype_input, fooddescription_input, foodprice_input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_add);

        foodname_input = (EditText) findViewById(R.id.fname);
                                foodtype_input = (EditText) findViewById(R.id.ftype);
                                        fooddescription_input = (EditText)  findViewById(R.id.fdesc);
                                        foodprice_input = (EditText) findViewById(R.id.fprice);
                                             btn_submit = (Button) findViewById(R.id.sub1);


         btn_submit =  (Button) findViewById(R.id.sub1);
         btn_submit.setOnClickListener(new View.OnClickListener() {



         @Override
     public void onClick(View view) {
             MyDatabaseHelper myDB = new MyDatabaseHelper(add_food.this);
                             myDB.Adding(
                                     foodname_input.getText().toString().trim(),
                                    foodtype_input .getText().toString().trim(),
                                     fooddescription_input .getText().toString().trim(),
                                     foodprice_input .getText().toString().trim());
         }




                                     });





}

}



