package com.example.andrecristen.tccperguntasseparadas.Desafios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class desafio_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio_8);
    }
    public void startTelaDesafios9(View view) {
        kill_activity();
        Intent telaDesafios9 = new Intent(this, desafio_9.class);
        startActivity(telaDesafios9);
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
