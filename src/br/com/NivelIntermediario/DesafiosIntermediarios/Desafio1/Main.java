package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcaoUsuario = 0;
        Ninja ninja = new Ninja();
        String[] guardaNinjas = new String[5];

        do{
            System.out.println("------Bem vindo ao menu------");
            System.out.println("1. Adicione um novo ninja");
            System.out.println("2. Mostre todos os ninjas");
            System.out.println("3. Fechar");
            opcaoUsuario = scan.nextInt();

            switch (opcaoUsuario){
                case 1:
                    System.out.println("Nome do ninja:");
                    ninja.nome = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Idade do ninja:");
                    ninja.idade = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Missão do ninja:");
                    ninja.missao = scan.nextLine();
                    System.out.println("Dificuldade da Missão");
                    ninja.nivelDeDificuldade = scan.nextLine();
                    System.out.println("Status da Missão");
                    ninja.statusMissao = scan.nextLine();
                    String informacoesNinja = "\n"+ninja.nome + ninja.idade +"\n"+ ninja.missao +"\n"+ ninja.nivelDeDificuldade +"\n"+ ninja.statusMissao;
                    guardaNinjas[0] = informacoesNinja;
                    break;
                case 2:
                    for (int i = 0; i < guardaNinjas.length; i++) {
                        System.out.println(guardaNinjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Fechando a aplicação");
                    break;
                default:
                    System.out.println("Escolha uma opção do menu");
                    break;
            }
        } while (opcaoUsuario != 3);


       /*
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 15;
        sasuke.missao = "Derrotar o Itachi";
        sasuke.nivelDeDificuldade = "S";
        sasuke.statusMissao = "Em progresso";
        */
    }
}
