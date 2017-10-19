package com.example.andrecristen.tccperguntasseparadas.CatorzeADezesseis.Raciocinio;

/**
 * Created by Andre Cristen on 14/09/2017.
 */

public class RaciocinioLogico14A16 {
    private String mQuestoes [] = {
        "Uma caixa de ovos é composta por 12 ovos. Quantas caixas necessito para ter 84 ovos ?", //1
        "Fui à uma loja e comprei 300 balas. Comi 173 e deu 94 para meu irmão. Quantas balas me restaram ?", //2
        "Meu pai me comprou um violão de 300 reais, 8 CD's de 10 reais e uma camiseta de 30 reais. Entregando 500 reais ao caixa, quanto lhe restou de troco ?", //3
        "André tem três notas em provas de matemática. Na primeira tirou 8, na segunda 6 e na terceira 4. Determine a média de André no bimestre!", //4
        "Adrian nasceu no ano de 1997, quando estivermos no ano 2060, qual será sua idade?", //5
        "O que representa uma dízima periódica. Ex: 5,5444 ?", //6
        "Considerando um mês de 30 dias, 15 dias representam quanto por cento de 1 bimestre? Sabe-se que 1 bimestre é igual a 2 meses.", //7
        "Rosa tem 30 rosas para distribuir em 5 vasos. Sabendo que todos os vasos devem ter a mesma quantia de rosas, quantas rosas cada vaso deve ter ?", //8
        "Continue a sequência a seguir até chegar ao número 32: 4-8-12-16", //9
        "Lucas tem 410 reais, Jaspion tem 100 reais e Lúcio tem 315 reais, e querem alcançar 1000 reais para comprar seu videogame novo. Quanto eles ainda precisam ?", //10
};


    private String mOpcoes [][] = {
            {"7", "8", "9"},//1
            {"33", "34", "35"},//2
            {"30", "10", "80"},//3
            {"7", "6", "5"},//4
            {"60", "63", "61"},//5
            {"Número que só pode ser multiplicado por zero", "Quando um número após a vírgula repete infinitamente", "Quando um número após a vírgula se repete apenas uma vez"},//6
            {"50%", "25%", "15%"},//7
            {"4", "5", "6"},//8
            {"4-8-12-16-32", "4-8-12-16-20-29-31-32", "4-8-12-16-20-24-28-32"},//9
            {"100", "145", "175"},//10

    };



    private String mRespostaCorreta[] = {"7", "33", "30", "6","63","Quando um número após a vírgula repete infinitamente","25%","6","4-8-12-16-20-24-28-32","175"};




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
