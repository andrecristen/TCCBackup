package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaComplementos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_complementos2);
    }
    public void startTelaComplementos3(View view) {
        kill_activity();
        Intent telaComplementos3 = new Intent(this, telaComplementos3.class);
        startActivity(telaComplementos3);
    }
    public void startTelaComplementos(View view) {
        kill_activity();
        Intent telaComplementos = new Intent(this, telaComplementos.class);
        startActivity(telaComplementos);
    }
    void kill_activity(){
        finish();
    }
}
