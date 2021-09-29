package com.example.mad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "ROYAL_KITCHEN.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "Cabin_booking";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_CHECK_IN_DATE = "check_in_date";
    private static final String COLUMN_CHECK_IN_TIME = "check_in_time";
    private static final String COLUMN_NUMBER_OF_CABINS = "number_of_cabins";
    private static final String COLUMN_EMAIL = "email_address";
    private static final String COLUMN_MOBILE_NUMBER = "mobile_number";
    private static final String COLUMN_CABIN_CATEGORY = "cabin_type";
    private static final String COLUMN_DISCOUNT = "discount";
    private static final String COLUMN_FARE = "fare";

    //foods
    private static final String TABLE_FOODNAME = "Add_foods";
    private static final String COLUMN_FOODID = "food_id";
    private static final String COLUMN_FOOD_NAME = "food_name";
    private static final String COLUMN_FOOD_TYPE = "food_type";
    private static final String COLUMN_FOOD_DESCRIPTION = "food_description";
    private static final String COLUMN_FOOD_PRICE = "food_price";


    MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    //Table Creating
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, check_in_date TEXT, check_in_time TEXT, number_of_cabins INTEGER, email_address TEXT, mobile_number INTEGER, cabin_type TEXT, discount INTEGER, fare INTEGER)");
        db.execSQL("create table " + TABLE_FOODNAME + "(COLUMN_FOODID INTEGER PRIMARY KEY AUTOINCREMENT, food_name TEXT, food_type TEXT, food_description TEXT, food_price TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FOODNAME);
        onCreate(db);
    }

    //Cabin Booking Data Add in Database
    void Booking(String checkin_date, String checkin_time, String numberofcabin, String email,
                 String number, String cabin_type, String discount, String fare){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_CHECK_IN_DATE,checkin_date);
        cv.put(COLUMN_CHECK_IN_TIME,checkin_time);
        cv.put(COLUMN_NUMBER_OF_CABINS,numberofcabin);
        cv.put(COLUMN_EMAIL,email);
        cv.put(COLUMN_MOBILE_NUMBER,number);
        cv.put(COLUMN_CABIN_CATEGORY,cabin_type);
        cv.put(COLUMN_DISCOUNT,discount);
        cv.put(COLUMN_FARE,fare);

        long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1) {
            Toast.makeText(context, "Booking Failed...", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "You have been successfully Booked...", Toast.LENGTH_SHORT).show();
        }
    }

    //foods
    void Adding(String foodname, String foodtype, String fooddescription, String foodprice) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_FOOD_NAME, foodname);
        cv.put(COLUMN_FOOD_TYPE, foodtype);
        cv.put(COLUMN_FOOD_DESCRIPTION, fooddescription);
        cv.put(COLUMN_FOOD_PRICE, foodprice);

        long result = db.insert(TABLE_FOODNAME, null, cv);
        if (result == -1) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Your data successfully added!", Toast.LENGTH_SHORT).show();
        }
    }

    //Cabin all data get from Database
    Cursor readAllData(){
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query,null);
        }
        return cursor;
    }


    //Cabin Update Function
    void updatedata(String Booking_id, String checkin_date, String checkin_time, String numberofcabin, String email, String number, String cabin_type, String discount, String fare ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_CHECK_IN_DATE,checkin_date);
        cv.put(COLUMN_CHECK_IN_TIME,checkin_time);
        cv.put(COLUMN_NUMBER_OF_CABINS,numberofcabin);
        cv.put(COLUMN_EMAIL,number);
        cv.put(COLUMN_MOBILE_NUMBER,cabin_type);
        cv.put(COLUMN_CABIN_CATEGORY,email);
        cv.put(COLUMN_DISCOUNT,discount);
        cv.put(COLUMN_FARE,fare);

        long result = db.update(TABLE_NAME, cv,"COLUMN_ID=?", new String[]{Booking_id});
        if (result == -1) {
            Toast.makeText(context,"Your data has not been Updated!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context,"Your data has been successfully Updated!", Toast.LENGTH_SHORT).show();
        }
    }

    //Cabin Delete Function
    void deleteOneRow(String Booking_id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_NAME, "COLUMN_ID=?", new String[]{Booking_id});
        if (result == -1) {
            Toast.makeText(context, "Your data has not been deleted!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context,"Your data has been successfully deleted!", Toast.LENGTH_SHORT).show();
        }
    }
}

