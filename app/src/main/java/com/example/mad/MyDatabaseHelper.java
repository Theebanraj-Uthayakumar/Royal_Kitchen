package com.example.mad;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
        String query = "CREATE TABLE " + TABLE_NAME + "(" +
                COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_CHECK_IN_DATE + " TEXT, " +
                COLUMN_CHECK_IN_TIME + " TEXT, " +
                COLUMN_NUMBER_OF_CABINS + " INTEGER," +
                COLUMN_EMAIL + " TEXT, " +
                COLUMN_MOBILE_NUMBER + " INTEGER, " +
                COLUMN_DISCOUNT + " INTEGER, " +
                COLUMN_FARE + " INTEGER);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
