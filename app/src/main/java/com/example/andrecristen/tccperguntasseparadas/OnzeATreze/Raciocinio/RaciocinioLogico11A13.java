package com.example.andrecristen.tccperguntasseparadas.OnzeATreze.Raciocinio;

/**
 * Created by Andre Cristen on 14/09/2017.
 */

public class RaciocinioLogico11A13 {
    private String mQuestoes [] = {
        "Um pica-pau bica X vezes uma árvore por minuto. Passando-se 4 minutos, quantas vezes ele bicou ?", //1
        " 2a+2a+2a = ?", //2
        "5b-6b= ?", //3
        "Sabe-se que uma pizza custa 24 reais. Quanto custa 1/8(Um oitavo) dessa pizza ?", //4
        "Complete a frase: 1/2(Um meio) é _________ que 2/4(Dois quartos)?", //5
        "Lucas foi à feira e comprou 32 frutas. Sendo que 1/2(Um meio) delas eram morangos. Quantos morangos haviam ?", //6
        "Comprei 8 DVD´s, sendo 1/8 deles de Ação e 7/8 de Comédia. Quantos filmes de comédia haviam ?", //7
        "Lucas, Mario e Jackson compraram chocolates. Lucas comei 2/4, Maria 1/8 e Jackson 12/24. Quem comeu mais ?", //8
        "Sabe-se que um cubo possui 8 vértices(Lados). Quantos vértices tem uma esfera ?", //9
        "30÷100 é igual a?(Em porcentagem)", //10
};


    private String mOpcoes [][] = {
            {"4x", "16x", "36x"},//1
            {"4a", "6a", "20"},//2
            {"6b", "5b", "-b"},//3
            {"3 reais", "8 reais", "24 reais"},//4
            {"maior", "menor", "igual"},//5
            {"16", "32", "0"},//6
            {"1", "8", "7"},//7
            {"Jackson", "Lucas", "Mario"},//8
            {"0", "8", "20"},//9
            {"0%", "100%", "30%"},//10
    };



    private String mRespostaCorreta[] = {"4x", "6a", "-b", "3 reais","igual","16","7","Jackson","0","30%"};




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
