package br.com.NivelBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        String ninja1 = "Naruto";
        int idadeNinja1 = 14;
        String nomeDaMissao1 = "Capturar Gaara";
        String nivelMissao = "C";
        String statusMissao1;

        if (nivelMissao == "C" && idadeNinja1 >= 15) {
            statusMissao1 = "concluída";
        } else {
            statusMissao1 = "não concluída";
        }
        System.out.printf("O ninja %s teve a missão %s %s\n", ninja1, nomeDaMissao1, statusMissao1);


        String ninja2 = "Sasuke";
        int idadeNinja2 = 14;
        String nomeDaMissao2 = "Capturar Gaara";
        String nivelMissao2 = "B";
        String statusMissao2;

        if (nivelMissao2 == "B" && idadeNinja2 >= 15) {
            statusMissao2 = "concluída";
        } else {
            statusMissao2 = "não concluída";
        }
        System.out.printf("O ninja %s teve a missão %s %s\n", ninja2, nomeDaMissao2, statusMissao2);


        String ninja3 = "Gaara";
        int idadeNinja3 = 15;
        String nomeDaMissao3 = "fugir do Sasuke e Naruto";
        String nivelMissao3 = "B";
        String statusMissao3;

        if (nivelMissao3 == "B" && idadeNinja3 >= 15) {
            statusMissao3 = "concluída";
        } else {
            statusMissao3 = "não concluída";
        }
        System.out.printf("O ninja %s teve a missão %s %s", ninja3, nomeDaMissao3, statusMissao3);


    }
}
