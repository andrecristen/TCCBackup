package com.example.andrecristen.tccperguntasseparadas.Geral;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.CatorzeADezesseis.categoriasCatorzeADezesseis;
import com.example.andrecristen.tccperguntasseparadas.OnzeATreze.categoriasOnzeATreze;
import com.example.andrecristen.tccperguntasseparadas.R;
import com.example.andrecristen.tccperguntasseparadas.SeisADez.categoriasSeisADez;

public class telaIdades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_idades);
    }
    public void startTelaSeisaDez(View view) {

        Intent telaIdades = new Intent(this, categoriasSeisADez.class);
        startActivity(telaIdades);
    }
    public void startTelaOnzeaTreze(View view) {

        Intent telaIdades = new Intent(this, categoriasOnzeATreze.class);
        startActivity(telaIdades);

    }
        public void startTelaCatorzeaDezesseis(View view) {

        Intent telaIdades = new Intent(this, categoriasCatorzeADezesseis.class);
        startActivity(telaIdades);
    }
}


