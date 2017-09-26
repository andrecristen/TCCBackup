package com.example.andrecristen.tccperguntasseparadas.SeisADez.Logica;

/**
 * Created by Andre Cristen on 14/09/2017.
 */

public class LogicaMatematica6A10 {
    private String mQuestoes [] = {
            "15+15= ?", //1
            "15-15= ?", //2
            "7+8= ?", //3
            "100-50 = 100-100 = ?", //4
            "72+8-0+20= ?", //5
            "5 × 5 = ?", //6
            "7 × 9 = ?", //7
            "9 × 0 = ?", //8
            "5÷5 = ?", //9
            "100÷10 = ?", //10
            "", //11
            "", //12
            "", //13
            "",//14
            "",//15
            "",//16
            "",//17
            "",//18
            "",//19
            "",//20
            "",//21
            "",//22
            "",//23
            "",//24
            "",//25





    };


    private String mOpcoes [][] = {
            {"15", "0", "30"},//1
            {"15", "-15", "0"},//2
            {"17", "18", "19"},//3
            {"50", "100", "150"},//4
            {"100", "102", "98"},//5
            {"5", "10", "25"},//6
            {"63", "73", "82"},//7
            {"1", "9", "0"},//8
            {"5", "1", "0"},//9
            {"10", "100", "1"},//10
            {"", "", ""},//11
            {"", "", ""},//12
            {"", "", ""},//13
            {"", "", ""},//14
            {"", "", ""},//15
            {"", "", ""},//16
            {"", "", ""},//17
            {"", "", ""},//18
            {"", "", ""},//19
            {"", "", ""},//20
            {"", "", ""},//21
            {"", "", ""},//22
            {"", "", ""},//23
            {"", "", ""},//24
            {"", "", ""},//25

    };



    private String mRespostaCorreta[] = {"30", "0", "17", "50","100","25","63","0","1","10","","","","","","","","","","","","8","","","",""};




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
