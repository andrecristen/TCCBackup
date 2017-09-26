package com.example.andrecristen.tccperguntasseparadas.OnzeATreze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.OnzeATreze.Desafios.QuizDesafiosOnzeATreze;
import com.example.andrecristen.tccperguntasseparadas.OnzeATreze.Logica.QuizLogicaOnzeATreze;
import com.example.andrecristen.tccperguntasseparadas.OnzeATreze.Raciocinio.QuizRaciocinioOnzeATreze;
import com.example.andrecristen.tccperguntasseparadas.R;

public class categoriasOnzeATreze extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_onze_a_treze);
    }
    public void startTelaDesafios(View view) {

        Intent telaDesafios = new Intent(this, QuizDesafiosOnzeATreze.class);
        startActivity(telaDesafios);
    }
    public void startTelaLogica(View view) {

        Intent telaLogica = new Intent(this, QuizLogicaOnzeATreze.class);
        startActivity(telaLogica);
    }
    public void startTelaRacicinio(View view) {

        Intent telaRaciocinio = new Intent(this, QuizRaciocinioOnzeATreze.class);
        startActivity(telaRaciocinio);
    }
}
