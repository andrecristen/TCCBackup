package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaComplementos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_complementos);
    }
    public void startTelaComplementos2(View view) {
        kill_activity();
        Intent Complementos2 = new Intent(this, telaComplementos2.class);
        startActivity(Complementos2);
    }
    void kill_activity(){
        finish();
    }
}

