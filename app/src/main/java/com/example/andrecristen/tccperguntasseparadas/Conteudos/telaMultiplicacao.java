package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaMultiplicacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_multiplicacao);
    }
    public void startTelaMultiplicacao2(View view) {
        kill_activity();
        Intent telaMultiplicacao2 = new Intent(this, telaMultiplicacao2.class);
        startActivity(telaMultiplicacao2);
    }
    void kill_activity(){
        finish();
    }
}
