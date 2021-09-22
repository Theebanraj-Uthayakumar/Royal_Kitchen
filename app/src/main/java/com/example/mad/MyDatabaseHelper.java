package com.example.mad;

import android.content.ContentValues;
import android.content.Context;
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
    private static final String COLUMN_DISCOUNT = "discount";
    private static final String COLUMN_FARE = "fare";


    public MyDatabaseHelper(@Nullable Context context ) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, check_in_date TEXT, check_in_time TEXT, number_of_cabins INTEGER, email_address TEXT, mobile_number INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    void Booking(String checkin_date, String checkin_time, int numberofcabin, String email, int number){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_CHECK_IN_DATE,checkin_date);
        cv.put(COLUMN_CHECK_IN_TIME,checkin_time);
        cv.put(COLUMN_NUMBER_OF_CABINS,numberofcabin);
        cv.put(COLUMN_EMAIL,email);
        cv.put(COLUMN_MOBILE_NUMBER,number);

        long result = db.insert(TABLE_NAME,null,cv);
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Your data successfully added!", Toast.LENGTH_SHORT).show();
        }
    }
}
