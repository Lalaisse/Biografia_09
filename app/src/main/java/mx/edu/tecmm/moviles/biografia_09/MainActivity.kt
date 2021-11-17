package mx.edu.tecmm.moviles.biografia_09

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txtNombre: TextView;
    lateinit var txtCarrera: TextView;
    lateinit var txtNumControl: TextView;
    lateinit var txtHobbies: TextView;
    lateinit var btnEditar: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        txtNombre= findViewById(R.id.txtNombre);
        txtCarrera= findViewById(R.id.txtCarrera);
        txtNumControl= findViewById(R.id.txtNumControl);
        txtHobbies= findViewById(R.id.txtHobbies);
        //btnEditar= findViewById(R.id.btnEditar);

    }

    override fun onResume() {
        super.onResume()
        //Aquí voy a empezar:
        val misPreferencias= getSharedPreferences("misdatos",  Context.MODE_PRIVATE);


        with(misPreferencias){
            val nombre= getString("nombre", "No se ha guardado");//Para no tener null
            val numControl= getString("nc", "N/A");
            val hobbies= getString("hobbies", "N/A");
            val carrera= getString("carrera", "N/A");
            txtNombre.text= nombre;
            txtCarrera.text= carrera;
            txtNumControl.text=numControl;
            txtHobbies.text= hobbies;
        }

    }
    fun abrirIntencion(v: View){

    }

    fun editDatos(v: View){
        Toast.makeText(this, "Presionó", Toast.LENGTH_SHORT).show();
        val intent= Intent(this, IntencionEditar::class.java);
        startActivity(intent);
    }

    //En la parte del botón grabará los datos

}