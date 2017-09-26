package com.example.andrecristen.tccperguntasseparadas.Desafios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class desafio_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio_2);
    }
    public void startTelaDesafios3(View view) {
        kill_activity();
        Intent telaDesafios3 = new Intent(this, desafio_3.class);
        startActivity(telaDesafios3);
    }


    public void startTelaInicial(View view) {
        kill_activity();
        Intent telaInicial = new Intent(this, com.example.andrecristen.tccperguntasseparadas.Geral.telaInicial.class);
        startActivity(telaInicial);
    }
    void kill_activity(){
        finish();
    }
}
