package com.utcl95.suministro.data;

import android.provider.BaseColumns;

/**
 * (c) utcl95
 */

public final class SuministroContract {
    public static final class PetEntry implements BaseColumns {

        public final static String TABLE_NAME = "lecturas.db";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_SUMINISTRO = "suministro";

        public final static String COLUMN_LECTURA = "lectura";

        public final static String COLUMN_OBSERVACION = "observacion";

        public final static String COLUMN_DIA_HORA = "date";

        public final static String COLUMN_GPS_LATITUD = "latitud";

        public final static String COLUMN_GPS_LONGITUD = "longitud";

    }
}
