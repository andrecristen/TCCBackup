package com.example.andrecristen.tccperguntasseparadas.SeisADez.Raciocinio;

/**
 * Created by Andre Cristen on 14/09/2017.
 */

public class RaciocinioLogico6A10 {
    private String mQuestoes [] = {
        "A área de um quadrado é igual a 20m², sabendo que a área é Base vezes Altura. Quais são essas medidas?", //1
        "Um triangulo tem 3 lados medindo 5 centimetros cada. Qual o seu perímetro?", //2
        "Qual das sequências a seguir apresenta os números: 7, 10, 40, 4, 15, 29, em ordem CRESCENTE?", //3
        "Sabendo que um pato tem 2 patas, quantas patas tem 35 patos ?", //4
        "Sabendo que 1Km tem 1000 metros, quantos quilômetros tem 3500 metros ?\n", //5
        "Um metro corresponde a 100 centímetros. Quanto corresponde um quarto de metro ?\n", //6
        "Qual das sequências a seguir apresenta os números: 1, 3, 20, 12, 7, 19, em ordem DECRESCENTE?\n", //7
        "Quantos números inteiros tem entre o número 1 e o número 45?\n", //8
        "Um quadrado tem 4 lados. Um cubo é composto por 6 quadrados. Quantos lados tem um cubo?", //9
        "Uma caixa de ovos contém 12 ovos. Quantos ovos tenho com 7 caixas ?\n", //10

};


    private String mOpcoes [][] = {
            {"5 e 4", "5 e 5", "4 e 4"},//1
            {"5cm", "10cm", "15cm"},//2
            {"7, 10, 40, 4, 15, 29", "4, 7, 10, 15, 29, 40", "Não é possível ordenar"},//3
            {"70", "35", "110"},//4
            {"1000metros", "3500km", "3,5km"},//5
            {"25cm", "50cm", "100cm"},//6
            {"1, 3, 20, 12, 7, 19", "20, 19, 12, 7, 3, 1", "Não é possível ordenar"},//7
            {"43", "45", "nenhum"},//8
            {"6", "4", "24"},//9
            {"72", "7", "84"},//10

    };



    private String mRespostaCorreta[] = {"5 e 4", "15cm", "4, 7, 10, 15, 29, 40", "70","3,5km","25cm","20, 19, 12, 7, 3, 1","43","6","84"};




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
