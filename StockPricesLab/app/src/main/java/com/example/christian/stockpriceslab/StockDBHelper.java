package com.example.christian.stockpriceslab;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Christian on 3/7/16.
 */
public class StockDBHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "stock.db";
    public static final String TABLE_NAME = "stocks";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_STOCK_NAME = "stock_name";
    public static final String COLUMN_STOCK_SYMBOL = "stock_symbol";
    public static final String COLUMN_STOCK_PRICE = "price";



    public static final String[] ALL_COLUMNS = new String[]{COLUMN_ID,COLUMN_STOCK_NAME,COLUMN_STOCK_PRICE, COLUMN_STOCK_SYMBOL};

    public static final String sqlCreate = "CREATE TABLE" + TABLE_NAME
            +" ("
            +COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            +COLUMN_STOCK_SYMBOL + " TEXT,"
            +COLUMN_STOCK_NAME + " TEXT,"
            +COLUMN_STOCK_PRICE + " REAL)";

    public StockDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, DB_VERSION);
    }

    public long addStock(ContentValues values){
        SQLiteDatabase db = getWritableDatabase();
        long id = db.insert(TABLE_NAME,null,values);
        db.close();
        return id;
    }

    public Cursor getAllStocks(){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, ALL_COLUMNS, null, null, null, null, null);
        return cursor;
    }

    public Cursor getStockById(String id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME,ALL_COLUMNS,COLUMN_ID+" =?",new String[]{id}, null, null, null);
        return cursor;
    }

    int updateStockById(String id, ContentValues values){
        SQLiteDatabase db = getWritableDatabase();
        int rowsChanged = db.update(TABLE_NAME,values,COLUMN_ID+" =?",new String[]{id});
        db.close();
        return rowsChanged;

    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
