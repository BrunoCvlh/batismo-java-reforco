package br.com.NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
