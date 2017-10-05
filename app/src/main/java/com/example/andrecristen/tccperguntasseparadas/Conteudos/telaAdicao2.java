package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaAdicao2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adicao2);
    }
    public void startTelaAdicao3(View view) {
        kill_activity();
        Intent telaAdicao = new Intent(this, telaAdicao3.class);
        startActivity(telaAdicao);
    }
    public void startTelaAdicao(View view) {
        kill_activity();
        Intent telaAdicao = new Intent(this, telaAdicao.class);
        startActivity(telaAdicao);
    }
    void kill_activity(){
        finish();
    }
}
