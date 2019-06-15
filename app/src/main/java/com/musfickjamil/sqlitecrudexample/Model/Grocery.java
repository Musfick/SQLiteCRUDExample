package com.musfickjamil.sqlitecrudexample.Model;

public class Grocery {


    private String mName;
    private String mQuantity;
    private String mDateItemAdded;
    private int id;

    //Empty Constructor
    public Grocery(){
    }

    public Grocery(String mName, String mQuantity, String mDateItemAdded, int id) {
        this.mName = mName;
        this.mQuantity = mQuantity;
        this.mDateItemAdded = mDateItemAdded;
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(String mQuantity) {
        this.mQuantity = mQuantity;
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
