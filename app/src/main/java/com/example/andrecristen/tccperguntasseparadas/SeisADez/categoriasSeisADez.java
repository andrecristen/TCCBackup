package com.example.andrecristen.tccperguntasseparadas.SeisADez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;
import com.example.andrecristen.tccperguntasseparadas.SeisADez.Desafios.QuizDesafiosSeisADez;
import com.example.andrecristen.tccperguntasseparadas.SeisADez.Logica.QuizLogicaSeisADez;
import com.example.andrecristen.tccperguntasseparadas.SeisADez.Raciocinio.QuizRaciocinioSeisADez;

public class categoriasSeisADez extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_seis_a_dez);
    }
    public void startTelaDesafios(View view) {

        Intent telaDesafios = new Intent(this, QuizDesafiosSeisADez.class);
        startActivity(telaDesafios);
    }
    public void startTelaLogica(View view) {

        Intent telaLogica = new Intent(this, QuizLogicaSeisADez.class);
        startActivity(telaLogica);
    }
    public void startTelaRacicinio(View view) {

        Intent telaRaciocinio = new Intent(this, QuizRaciocinioSeisADez.class);
        startActivity(telaRaciocinio);
    }
}
