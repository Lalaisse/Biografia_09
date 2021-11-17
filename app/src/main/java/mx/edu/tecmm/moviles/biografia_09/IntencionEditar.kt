package mx.edu.tecmm.moviles.biografia_09

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class IntencionEditar : AppCompatActivity() {
    lateinit var txtNombre: EditText;
    lateinit var txtCarrera: EditText;
    lateinit var txtNumControl: EditText;
    lateinit var txtHobbies: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intencion_editar)
        txtNombre=findViewById(R.id.txtN);
        txtCarrera=findViewById(R.id.txtC);
        txtNumControl=findViewById(R.id.txtNC);
        txtHobbies=findViewById(R.id.txtH);
    }
    fun guardarDatos(v: View){
        //Ya mende llamar mi ventana, en mi ventana puse mi interfalz y en el botón grabé de la siguiente manera:
        val preferencias= getSharedPreferences("misdatos", Context.MODE_PRIVATE);

        with(preferencias.edit()){
            putString("nombre", txtNombre.text.toString());//Aquí va el campo de texto en segundo parámetro
            putString("carrera", txtCarrera.text.toString());
            putString("hobbies", txtHobbies.text.toString());
            putString("nc", txtNumControl.text.toString());
            commit();

        }
        finish();
    }
}