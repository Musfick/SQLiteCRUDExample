package com.musfickjamil.sqlitecrudexample.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.musfickjamil.sqlitecrudexample.Model.Grocery;
import com.musfickjamil.sqlitecrudexample.Util.Constants;

import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    private Context ctx;

    public DatabaseHandler(Context context) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
        this.ctx= context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_GROCERY_TABlE = "CREATE TABLE "  + Constants.TABLE_NAME + "("
                +Constants.KEY_ID + "INTEGER PRIMARY KEY,"    //ID Column
                +Constants.KEY_GROCERY_ITEM + "TEXT,"         //Item Column
                +Constants.KEY_GROCERY_CODE + "TEXT,"           //Quantity Column
                +Constants.KEY_DATE_NAME + "LONG);";          //Date Column

        db.execSQL(CREATE_GROCERY_TABlE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "  + Constants.TABLE_NAME);
        onCreate(db);

    }

}
