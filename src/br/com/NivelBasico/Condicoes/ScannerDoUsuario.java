package br.com.NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner boxDeTexto = new Scanner(System.in);

        System.out.println("Escreva o nome do ninja:");
        String nomeNinja = boxDeTexto.nextLine();

        System.out.printf("O nome do ninja é %s\n", nomeNinja);

        System.out.println("Escreva a idade do ninja:");
        int idadeNinja = boxDeTexto.nextInt();

        System.out.printf("O ninja %s possui %d anos\n", nomeNinja, idadeNinja);

        if (idadeNinja >= 18) {
            System.out.println("O ninja já pode sair para missões fora da vila");
        }else{
            System.out.println("O ninja ainda não tem idade para sair da vila");
        }
    }
}
