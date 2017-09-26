package com.example.andrecristen.tccperguntasseparadas.Geral;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.Conteudos.escolherConteudos;
import com.example.andrecristen.tccperguntasseparadas.Desafios.desafio_1;
import com.example.andrecristen.tccperguntasseparadas.R;

public class telaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }

    public void startTelaEscolherConteudos(View view) {

        Intent telaConteudos = new Intent(this, escolherConteudos.class);
        startActivity(telaConteudos);
    }
    public void startTelaIdades(View view) {

        Intent telaIdades = new Intent(this, com.example.andrecristen.tccperguntasseparadas.Geral.telaIdades.class);
        startActivity(telaIdades);
    }
    public void startTelaDesafios(View view) {

        Intent telaDeafios = new Intent(this, desafio_1.class);
        startActivity(telaDeafios);
    }
}
