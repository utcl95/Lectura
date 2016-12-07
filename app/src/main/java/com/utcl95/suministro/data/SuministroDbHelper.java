package com.utcl95.suministro.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.utcl95.suministro.data.SuministroContract.SuministroEntry;


/**
 * (c) utcl95
 */

public class SuministroDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "LecturaSuministro.db";

    private static final int DATABASE_VERSION = 1;

    private static final String TEXT_TYPE = " TEXT";
    private static final String REAL_TYPE = " REAL";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + SuministroEntry.TABLE_NAME + " (" +
                    SuministroEntry._ID + " INTEGER PRIMARY KEY," +
                    SuministroEntry.COLUMN_SUMINISTRO + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_ZONA + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_NOMBRE + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_DIRECCION + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_SERIE + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_LECTURA_ANTERIOR + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_LECTURA_PROMEDIO + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_LECTURA_ACTUAL + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_OBSERVACION + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_DIA_HORA + TEXT_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_GPS_LATITUD + REAL_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_GPS_LONGITUD + REAL_TYPE + COMMA_SEP +
                    SuministroEntry.COLUMN_PHOTO + TEXT_TYPE + " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + SuministroContract.SuministroEntry.TABLE_NAME;

    public SuministroDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

}
