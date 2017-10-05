package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaSubtracao2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_subtracao2);
    }
    public void startTelaConteudos(View view) {
        kill_activity();
        Intent telaConteudos = new Intent(this, escolherConteudos.class);
        startActivity(telaConteudos);
    }
    public void startTelaSubtracao(View view) {
        kill_activity();
        Intent telaSubtracao = new Intent(this, telaSubtracao.class);
        startActivity(telaSubtracao);
    }
    void kill_activity(){
        finish();
    }
}
