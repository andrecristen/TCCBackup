package com.example.andrecristen.tccperguntasseparadas.Desafios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class desafio_7_cores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio_7_cores);
    }
    public void startTelaDesafios8(View view) {
        kill_activity();
        Intent telaDesafios8 = new Intent(this, desafio_8_cores.class);
        startActivity(telaDesafios8);
    }


    public void startTelaInicial(View view) {
        kill_activity();
        Intent telaInicial = new Intent(this, desafio_errou.class);
        startActivity(telaInicial);
    }
    void kill_activity(){
        finish();
    }
}
