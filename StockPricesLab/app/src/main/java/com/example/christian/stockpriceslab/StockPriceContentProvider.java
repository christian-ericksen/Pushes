package com.example.christian.stockpriceslab;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

import java.net.URI;

/**
 * Created by Christian on 3/7/16.
 */
public class StockPriceContentProvider extends ContentProvider {
    public static final String AUTHORITY = "com.example.christian.stockpriceslab.StockPriceContentProvider";
    private static final String STOCK_PRICES_TABLE= StockDBHelper.TABLE_NAME;
    public static final Uri CONTENT_URI = Uri.parse("content://"+AUTHORITY+"/"+ STOCK_PRICES_TABLE);

    public static final int STOCK = 1;
    public static final int STOCK_ID = 2;

    private static final UriMatcher sURIMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static{
        sURIMatcher.addURI(AUTHORITY,StockDBHelper.TABLE_NAME,STOCK);
        sURIMatcher.addURI(AUTHORITY,StockDBHelper.TABLE_NAME+"/#",STOCK_ID);
    }

    private StockDBHelper mDbHelper;

    @Override
    public boolean onCreate() {
        mDbHelper = new StockDBHelper(getContext(),null,null,1);
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        int uriType = sURIMatcher.match(uri);

        Cursor cursor;

        switch(uriType){
            case STOCK:
                cursor = mDbHelper.getAllStocks();
                break;
            case STOCK_ID:
                cursor = mDbHelper.getStockById(uri.getLastPathSegment());
                break;
            default:
                throw new IllegalArgumentException("Unknown URI!");
        }

        cursor.setNotificationUri(getContext().getContentResolver(),uri);
        return cursor;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        int uriType = sURIMatcher.match(uri);

        long id = 0;
        switch (uriType){
            case STOCK:
              id = mDbHelper.addStock(values);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI");
        }
        getContext().getContentResolver().notifyChange(uri,null);
        return Uri.parse(uri+"/"+id);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        int uriType = sURIMatcher.match(uri);

        int rowsUpdated = 0;

        switch (uriType){
            case STOCK_ID:
                rowsUpdated = mDbHelper.updateStockById(uri.getLastPathSegment(),values);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI");
        }

        getContext().getContentResolver().notifyChange(uri,null);
        return rowsUpdated;
    }
}
