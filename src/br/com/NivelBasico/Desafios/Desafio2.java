package br.com.NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] ninjas = new String[10];
        int proximaPosicaoLivre = 0;

        int opcaoUser;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcaoUser = scan.nextInt();
            scan.nextLine();

            switch (opcaoUser) {
                case 1:
                    if (proximaPosicaoLivre < ninjas.length) {
                        System.out.print("Digite nome do ninja: ");
                        String nomeNinja = scan.nextLine();
                        ninjas[proximaPosicaoLivre] = nomeNinja;
                        System.out.println("Ninja " + ninjas[proximaPosicaoLivre] + " cadastrado!");
                        proximaPosicaoLivre++;
                    } else {
                        System.out.println("O array de ninjas está cheio! Não é possível cadastrar mais.");
                    }
                    break;

                case 2:
                    System.out.println("\n===== Lista de Ninjas =====");
                    if (proximaPosicaoLivre == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        for (int i = 0; i < proximaPosicaoLivre; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("O programa será encerrado. Adeus, ninja!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha um item válido do menu (1, 2 ou 3).");
            }
        } while (opcaoUser != 3);

        scan.close();
    }
}