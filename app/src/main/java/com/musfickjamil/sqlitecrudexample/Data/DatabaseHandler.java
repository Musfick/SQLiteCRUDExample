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

        String CREATE_GROCERY_TABlE = "CREATE TABLE" + Constants.TABLE_NAME + "("
                +Constants.KEY_ID + "INTEGER PRIMARY KEY,"    //ID Column
                +Constants.KEY_GROCERY_ITEM + "TEXT,"         //Item Column
                +Constants.KEY_QTY_NUMBER + "TEXT,"           //Quantity Column
                +Constants.KEY_DATE_NAME + "LONG);";          //Date Column

        db.execSQL(CREATE_GROCERY_TABlE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS" + Constants.TABLE_NAME);
        onCreate(db);

    }

    /**
     *  CRUD OPERATIONS: Create, Read, Update, Delete Methods
     */


    //Add Grocery
    public void AddGrocery(Grocery grocery)
    {

    }


    //Get a Grocery
    public Grocery getGrocery(int id)
    {
        return null;
    }


    //Get all Groceries
    public List<Grocery> getAllGrocery()
    {
        return null;
    }


    //Update Grocery
    public  int updateGrocery(Grocery grocery)
    {
        return 0;
    }


    //Delete Grocery
    public  void deleteGrocery(int id)
    {

    }


    //Get count
    public int getGroceriesCount()
    {
        return 0;
    }







}
