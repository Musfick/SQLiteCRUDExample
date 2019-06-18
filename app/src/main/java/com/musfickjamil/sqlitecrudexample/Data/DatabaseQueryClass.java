package com.musfickjamil.sqlitecrudexample.Data;

import android.content.Context;

import com.musfickjamil.sqlitecrudexample.Model.Grocery;

import java.util.Collections;
import java.util.List;

public class DatabaseQueryClass {

    private Context mContext;

    public DatabaseQueryClass(Context mContext) {
        this.mContext = mContext;
    }

    /**
     *  CRUD OPERATIONS: Create, Read, Update, Delete Methods
     */


    //Add Grocery
    public long addGrocery(Grocery grocery)
    {
        long id = -1;

        return id;
    }


    //Get All Groceries
    public List<Grocery> getAllGroceries()
    {
        return Collections.emptyList();
    }


    //Get Grocery By Code Number
    public Grocery getGroceryByCodeNumber(String code)
    {
        Grocery grocery = null;

        return grocery;
    }


    //Update Grocery Info
    public long updateGroceryInfo(Grocery grocery)
    {
        return 0;
    }


    //Delete Grocery By Code Number
    public long deleteStudentByCode(String code)
    {
        return 1;
    }


    //Delete All Groceries
    public boolean deleteAllGroceries()
    {
        return false;
    }





}
