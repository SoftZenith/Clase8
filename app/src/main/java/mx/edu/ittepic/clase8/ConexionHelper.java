package mx.edu.ittepic.clase8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionHelper extends SQLiteOpenHelper {


    final String CREAR_TABLA_PERSONA = "CREATE TABLE persona(id INTEGER, nombre TEXT, apellido TEXT, edad INTEGER)";

    public ConexionHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_PERSONA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS persona");
        onCreate(db);
    }
}
