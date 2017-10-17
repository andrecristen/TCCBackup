package com.example.andrecristen.tccperguntasseparadas.Desafios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaCategoriaDesafios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_categoria_desafios);
    }

    public void startTelaDesafios1(View view) {
        kill_activity();
        Intent telaDesafios1 = new Intent(this, desafio_1_formas.class);
        startActivity(telaDesafios1);
    }
    public void startTelaDesafios2(View view) {
        kill_activity();
        Intent telaDesafios2 = new Intent(this, desafio_6_cores.class);
        startActivity(telaDesafios2);
    }

    void kill_activity(){
        finish();
    }

}

