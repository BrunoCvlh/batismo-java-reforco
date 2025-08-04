package br.com.NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        System.out.println("Escolha seu ninja");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Minato Namikaze");

        Scanner scan = new Scanner(System.in);
        int escolhaDoNinja = scan.nextInt();


        switch (escolhaDoNinja) {
            case 1:
                System.out.println("Você escolheu o Naruto");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke");
                break;
            case 3:
                System.out.println("Você escolheu o Minato");
                break;
            default:
                System.out.println("Você não escolheu um ninja do menu");
                break;
        }
    }
}
