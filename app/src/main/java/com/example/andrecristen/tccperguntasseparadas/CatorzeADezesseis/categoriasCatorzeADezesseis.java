package com.example.andrecristen.tccperguntasseparadas.CatorzeADezesseis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.CatorzeADezesseis.Desafios.QuizDesafiosCatorzeADezesseis;
import com.example.andrecristen.tccperguntasseparadas.CatorzeADezesseis.Logica.QuizLogicaCatorzeADezesseis;
import com.example.andrecristen.tccperguntasseparadas.CatorzeADezesseis.Raciocinio.QuizRaciocinioCatorzeADezesseis;
import com.example.andrecristen.tccperguntasseparadas.R;

public class categoriasCatorzeADezesseis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_catorze_a_dezesseis);
    }
    public void startTelaDesafios(View view) {

        Intent telaDesafios = new Intent(this, QuizDesafiosCatorzeADezesseis.class);
        startActivity(telaDesafios);
    }
    public void startTelaLogica(View view) {

        Intent telaLogica = new Intent(this, QuizLogicaCatorzeADezesseis.class);
        startActivity(telaLogica);
    }
    public void startTelaRacicinio(View view) {

        Intent telaRaciocinio = new Intent(this, QuizRaciocinioCatorzeADezesseis.class);
        startActivity(telaRaciocinio);
    }
}
