package com.example.andrecristen.tccperguntasseparadas.Conteudos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andrecristen.tccperguntasseparadas.R;

public class telaDivisao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_divisao);
    }
    public void startTelaDivisao2(View view) {
        kill_activity();
        Intent telaDivisao2 = new Intent(this, telaDivisao2.class);
        startActivity(telaDivisao2);
    }
    void kill_activity(){
        finish();
    }
}
