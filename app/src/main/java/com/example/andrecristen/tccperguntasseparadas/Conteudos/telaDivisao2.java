package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaDivisao2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_divisao2);
    }
    public void startTelaInicial(View view) {
        kill_activity();
        Intent telafinal = new Intent(this, escolherConteudos.class);
        startActivity(telafinal);
    }
    public void startTelaDivisao(View view) {
        kill_activity();
        Intent telaDivisao = new Intent(this, telaDivisao.class);
        startActivity(telaDivisao);
    }
    void kill_activity(){
        finish();
    }
}
