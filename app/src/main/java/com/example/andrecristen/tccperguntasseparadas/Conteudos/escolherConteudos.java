package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class escolherConteudos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_conteudos);
    }
    public void startTelaAdicao(View view) {

        Intent telaAdicao = new Intent(this, telaAdicao.class);
        startActivity(telaAdicao);
    }
    public void startTelaSubtracao(View view) {

        Intent telaSubtracao = new Intent(this, telaSubtracao.class);
        startActivity(telaSubtracao);
    }
    public void startTelaMultiplicacao(View view) {

        Intent telaMultiplicacao = new Intent(this, telaMultiplicacao.class);
        startActivity(telaMultiplicacao);
    }
    public void startTelaDivisao(View view) {

        Intent telaDivisao = new Intent(this,telaDivisao.class);
        startActivity(telaDivisao);
    }
    public void startTelaComplementos(View view) {

        Intent telaComplementos = new Intent(this, telaComplementos.class);
        startActivity(telaComplementos);
    }
}
