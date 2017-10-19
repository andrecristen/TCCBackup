package com.example.andrecristen.tccperguntasseparadas.CatorzeADezesseis.Logica;

/**
 * Created by Andre Cristen on 14/09/2017.
 */

public class LogicaMatematica14A16 {
    private String mQuestoes [] = {
            "5 ×(4+5)= ?", //1
            "3 ×(4 ×3)= ?", //2
            "(81÷9)÷3= ?", //3
            "1 ×2 ×3 ×4 ×5= ?", //4
            "2 x 2 - ( - 2 ) = ?", //5
            "(-5-40)+1= ?", //6
            "(-7-3)+100= ?", //7
            "Quanto é PI(aproximadamente)? = ?", //8
            "{(5 ×0)-5-4+1}= ?", //9
            "(4 ×(30÷5))(721 ×0)= ?", //10
    };


    private String mOpcoes [][] = {
            {"45", "40", "35"},//1
            {"36", "24", "20"},//2
            {"3", "4", "0"},//3
            {"81", "120", "500"},//4
            {"4", "6", "2"},//5
            {"-45", "-44", "-41"},//6
            {"100", "9", "90"},//7
            {"1,14", "2,14", "3,14"},//8
            {"-10", "40", "-8"},//9
            {"893", "103", "24"},//10
    };



    private String mRespostaCorreta[] = {"45", "36", "3", "120","6","-44","90","3,14","-8","24"};




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
