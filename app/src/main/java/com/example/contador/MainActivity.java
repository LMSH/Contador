package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //componentes visuales
    private Button botonSumar;
    private Button botonRestar;
    private TextView textViewContador;

    //creo una variable contador
    private Integer contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //encuentro los componentes visuales
        botonSumar = findViewById(R.id.mainActivity_boton_sumar);
        botonRestar = findViewById(R.id.mainActivity_boton_restar);
        textViewContador = findViewById(R.id.mainActivity_textView_contador);

        //arranco mi contador
        contador = 300;


        //le creo al boton el on click listener
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                //agarro el valor de mi text view
                String valorDelTextView = textViewContador.getText().toString();
                //pasar mi String a Integer
                Integer contador = Integer.parseInt(valorDelTextView);
                //sumarle uno a mi contador
                contador = contador +1;
                //cargarle al textView este nuevo valor
                textViewContador.setText(contador.toString());*/
                contador = contador + 1;
                modificarVista();

            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = contador - 1;
                modificarVista();
            }
        });
    }

    //extraigo el metodo de modificar la vista acorde al contador
    private void modificarVista(){
        textViewContador.setText(contador.toString());
    }
}
