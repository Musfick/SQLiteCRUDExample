package com.musfickjamil.sqlitecrudexample.Model;

public class Grocery {


    private String mName;
    private String mCode;
    private String mDateItemAdded;
    private int id;

    //Empty Constructor
    public Grocery(){
    }
    public Grocery(String mName, String mCode, String mDateItemAdded, int id) {
        this.mName = mName;
        this.mCode = mCode;
        this.mDateItemAdded = mDateItemAdded;
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode;
    }

    public String getmDateItemAdded() {
        return mDateItemAdded;
    }

    public void setmDateItemAdded(String mDateItemAdded) {
        this.mDateItemAdded = mDateItemAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
