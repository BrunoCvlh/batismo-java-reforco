package br.com.NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        short qtdMissoesNinja = 11;

        String condicaoNinja = (qtdMissoesNinja >= 10) ? "O ninja tem mais de 10 missões" : "O ninja tem menos de 10 missoes";
        System.out.println(condicaoNinja);
    }
}
