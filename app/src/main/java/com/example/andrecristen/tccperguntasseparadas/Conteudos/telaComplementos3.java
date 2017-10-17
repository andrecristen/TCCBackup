package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaComplementos3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_complementos3);
    }
    public void startTelaInicial(View view) {
        kill_activity();
        Intent telaAdicao = new Intent(this, escolherConteudos.class);
        startActivity(telaAdicao);
    }
    public void startTelaComplementos2(View view) {
        kill_activity();
        Intent telaComplementos2 = new Intent(this, telaComplementos2.class);
        startActivity(telaComplementos2);
    }
    void kill_activity(){
        finish();
    }
}

