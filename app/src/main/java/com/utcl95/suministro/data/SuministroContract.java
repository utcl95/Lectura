package com.utcl95.suministro.data;

import android.provider.BaseColumns;

/**
 * (c) utcl95
 */

public final class SuministroContract {

    private SuministroContract() {}

    static final class SuministroEntry implements BaseColumns {

        // Nombre de la tabla que contiene las lecturas de los suministros.
        final static String TABLE_NAME = "lecturas";

        // Identificador unico.
        final static String _ID = BaseColumns._ID;

        // Suministro,
        final static String COLUMN_SUMINISTRO = "suministro";

        // Zona de ubicacion.
        final static String COLUMN_ZONA = "zona";

        // Nombre, direccion del cliente.
        final static String COLUMN_NOMBRE = "nombre";
        final static String COLUMN_DIRECCION = "direccion";

        // Serie del suministro.
        final static String COLUMN_SERIE = "serie";

        // Consumo anterior y promedio, para la validacion de la lectura actual
        final static String COLUMN_LECTURA_ANTERIOR = "lectura_anterior";
        final static String COLUMN_LECTURA_PROMEDIO = "lectura_promedio";

        // Lectura del consumo actual.
        final static String COLUMN_LECTURA_ACTUAL = "lectura_actual";

        // Observacion si la hubiera al realizar la lectura.
        final static String COLUMN_OBSERVACION = "observacion";

        // Fecha en la que se tomo la lectura.
        final static String COLUMN_DIA_HORA = "date";

        // TODO: Posicion GPS en la que se tomo la lectura (si hubiera).
        final static String COLUMN_GPS_LATITUD = "latitud";
        final static String COLUMN_GPS_LONGITUD = "longitud";

        // TODO: Por implementar.
        final static String COLUMN_PHOTO = "photo";
    }




}
