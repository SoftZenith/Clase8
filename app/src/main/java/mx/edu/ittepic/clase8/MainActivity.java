package mx.edu.ittepic.clase8;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionHelper conn = new ConexionHelper(this, "bd_tienda", null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("id", 1);
        values.put("nombre", "Bryan");
        values.put("apellido","Gutierrez");
        values.put("edad", 23);

        Long idRes = db.insert("persona","id", values);

        Toast.makeText(this, "id insertado: "+idRes, Toast.LENGTH_LONG).show();

    }
}
