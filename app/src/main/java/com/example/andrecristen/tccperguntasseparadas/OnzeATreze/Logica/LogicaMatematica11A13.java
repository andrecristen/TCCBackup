package com.example.andrecristen.tccperguntasseparadas.OnzeATreze.Logica;

/**
 * Created by Andre Cristen on 14/09/2017.
 */

public class LogicaMatematica11A13 {
    private String mQuestoes [] = {
            "5-10 = ?", //1
            "5 × 3 - 5 = ?", //2
            " -2 - 2 - 2 - 2 - 2 × 10 = ?", //3
            "100 - 200 = ?", //4
            " 500 + 7 × 0 = ?", //5
            " 8-9+1 = ?", //6
            "7 ÷ 7 - 10 + 10 = ?", //7
            "25 ÷ 5 + 4 = ?", //8
            "8 + 2 - 15 = ?", //9
            "49 ÷ 7 + 7 × 7= ?", //10
    };


    private String mOpcoes [][] = {
            {"-5", "5", "10"},//1
            {"5", "15", "10"},//2
            {"-100", "200", "0"},//3
            {"200", "-100", "100"},//4
            {"0", "500", "507"},//5
            {"8", "-1", "0"},//6
            {"1", "7", "10"},//7
            {"5", "9", "25"},//8
            {"-5", "10", "8"},//9
            {"49", "0", "56"},//10

    };



    private String mRespostaCorreta[] = {"-5", "10", "-100", "-100","500","0","1","9","-5","56"};




    public String getQuestao(int a) {
        String questao = mQuestoes[a];
        return questao;
    }



    public String getOpcao1(int a) {
        String Opcao0 = mOpcoes[a][0];
        return Opcao0;
    }


    public String getOpcao2(int a) {
        String Opcao1 = mOpcoes[a][1];
        return Opcao1;
    }

    public String getOpcao3(int a) {
        String Opcao2 = mOpcoes[a][2];
        return Opcao2;
    }

    public String getRespostaCorreta(int a) {
        String Resposta = mRespostaCorreta[a];
        return Resposta;
    }

}
