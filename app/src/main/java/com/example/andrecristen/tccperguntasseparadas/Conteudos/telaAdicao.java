package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaAdicao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adicao);
    }
    public void startTelaAdicao2(View view) {
        kill_activity();
        Intent telaAdicao = new Intent(this, telaAdicao2.class);
        startActivity(telaAdicao);
    }
    void kill_activity(){
        finish();
    }
}
