package com.example.user.sampledatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.user.sampledatabase.R;


class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "asus";
    private static final int DB_VERSION = 2;

    DatabaseHelper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        if(oldVersion < 1)
        {
            db.execSQL("CREATE TABLE PRODUCT (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "NAME TEXT," + "DESCRIPTION TEXT," + "IMAGE_RESOURCE_ID INTEGER);");
            insertProd(db, "ZenBook Pro UX501", "ZenBook Pro UX501 (description)", R.drawable.a);
            insertProd(db, "ASUS ZENBOOK UX303LN", "ASUS ZENBOOK UX303LN (description)", R.drawable.b);
            insertProd(db, "ASUS ZENBOOK UX305FA", "ASUS ZENBOOK UX305FA (description)", R.drawable.c);
        }

        if(oldVersion < 2)
        {
            db.execSQL("ALTER TABLE PRODUCT ADD COLUMN FAVORITE NUMERIC;");
        }
    }

    private static void insertProd(SQLiteDatabase db, String name, String description, int resourceId)
    {
        ContentValues prodValues = new ContentValues();
        prodValues.put("NAME", name);
        prodValues.put("DESCRIPTION", description);
        prodValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("PRODUCT", null, prodValues);
    }
}
