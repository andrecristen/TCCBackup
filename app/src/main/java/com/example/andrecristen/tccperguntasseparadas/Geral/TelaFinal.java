package com.example.andrecristen.tccperguntasseparadas.Geral;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.andrecristen.tccperguntasseparadas.R;

public class TelaFinal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String txt = bundle.getString("1");

        TextView mostrarAcertos = (TextView) findViewById(R.id.mostraAcertos);

        mostrarAcertos.setText(txt);


    }

    public void startTelaMenu(View view) {

        Intent telaMenu = new Intent(this, telaInicial.class);
        startActivity(telaMenu);
    }

    public void sair(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}