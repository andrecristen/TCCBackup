package com.example.andrecristen.tccperguntasseparadas.Desafios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class desafio_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio_1);
    }

    public void startTelaDesafios2(View view) {
        kill_activity();
        Intent telaDesafios2 = new Intent(this, desafio_2.class);
        startActivity(telaDesafios2);

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
