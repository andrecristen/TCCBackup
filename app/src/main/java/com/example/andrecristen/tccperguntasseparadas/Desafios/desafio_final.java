package com.example.andrecristen.tccperguntasseparadas.Desafios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.Geral.telaInicial;
import com.example.andrecristen.tccperguntasseparadas.R;

public class desafio_final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio_final);
    }
    public void startTelaMenu(View view) {
        kill_activity();
        Intent telaMenu = new Intent(this, telaInicial.class);
        startActivity(telaMenu);
    }

    public void sair(View view) {
        kill_activity();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    void kill_activity(){
        finish();
    }
}
