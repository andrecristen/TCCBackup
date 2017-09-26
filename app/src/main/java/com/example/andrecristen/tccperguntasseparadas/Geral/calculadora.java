package com.example.andrecristen.tccperguntasseparadas.Geral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.andrecristen.tccperguntasseparadas.R;

public class calculadora extends AppCompatActivity {
    ImageButton mais;
    ImageButton menos;
    ImageButton vezes;
    ImageButton dividido;
    TextView resultado;
    EditText valor1;
    EditText valor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        resultado = (TextView) findViewById(R.id.resultado);
        vezes = (ImageButton) findViewById(R.id.vezes);
        mais = (ImageButton) findViewById(R.id.mais);
        menos = (ImageButton) findViewById(R.id.menos);
        dividido = (ImageButton) findViewById(R.id.dividido);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux1 = valor1.getText().toString();
                String aux2 = valor2.getText().toString();
                double aux3 = Double.parseDouble(aux1);
                double aux4 = Double.parseDouble(aux2);

                double soma = aux3 + aux4;


                resultado.setText(soma + "");


            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux1 = valor1.getText().toString();
                String aux2 = valor2.getText().toString();
                double aux3 = Double.parseDouble(aux1);
                double aux4 = Double.parseDouble(aux2);

                double menos = aux3 - aux4;


                resultado.setText(menos + "");


            }
        });
        vezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux1 = valor1.getText().toString();
                String aux2 = valor2.getText().toString();
                double aux3 = Double.parseDouble(aux1);
                double aux4 = Double.parseDouble(aux2);

                double vezes = aux3 * aux4;


                resultado.setText(vezes + "");


            }
        });
        dividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux1 = valor1.getText().toString();
                String aux2 = valor2.getText().toString();
                double aux3 = Double.parseDouble(aux1);
                double aux4 = Double.parseDouble(aux2);

                double dividido = aux3 / aux4;


                resultado.setText(dividido + "");


            }
        });

    }
}
