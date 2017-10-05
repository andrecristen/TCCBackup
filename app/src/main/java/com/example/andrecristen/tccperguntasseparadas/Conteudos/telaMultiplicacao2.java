package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaMultiplicacao2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_multiplicacao2);
    }
    public void startEscolherConteudos(View view) {
        kill_activity();
        Intent escolherConteudos = new Intent(this, escolherConteudos.class);
        startActivity(escolherConteudos);
    }
    public void startTelaMultiplicacao(View view) {
        kill_activity();
        Intent telaMultiplicacao = new Intent(this, telaMultiplicacao.class);
        startActivity(telaMultiplicacao);
    }
    void kill_activity(){
        finish();
    }
}
