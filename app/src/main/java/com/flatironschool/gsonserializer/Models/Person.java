package com.flatironschool.gsonserializer.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by spangler on 11/10/14.
 */
public class Person {

    private boolean mIsMarried;
    private boolean mHasDog;
    private String mName;
    private String mFavoriteColor;
    private int mAge;

    public Person(boolean mIsMarried, boolean mHasDog, String mName, String mFavoriteColor, int mAge) {
        this.mIsMarried = mIsMarried;
        this.mHasDog = mHasDog;
        this.mName = mName;
        this.mFavoriteColor = mFavoriteColor;
        this.mAge = mAge;
    }

    public static Gson sGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }

    public Person(String jsonString){
        Person person = sGson().fromJson(jsonString, Person.class);
        mName = person.mName;
        mFavoriteColor = person.mFavoriteColor;
        mAge = person.mAge;
        mHasDog = person.mHasDog;
        mIsMarried = person.mIsMarried;
    }

    public boolean ismIsMarried() {
        return mIsMarried;
    }

    public boolean ismHasDog() {
        return mHasDog;
    }

    public String getmName() {
        return mName;
    }

    public String getmFavoriteColor() {
        return mFavoriteColor;
    }

    public int getmAge() {
        return mAge;
    }
}