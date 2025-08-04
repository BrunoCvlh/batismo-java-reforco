package br.com.NivelBasico.Condicoes;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {

        int qtdClones = 10;
        int qtdMaximaDeClones = 15;

        for (int i = 10; i <= qtdMaximaDeClones ; i++) {
            System.out.println("O Naruto criou um clone. ");
            System.out.printf("Quantidade atual: %d\n", i);
            qtdClones = i;
        }

        System.out.printf("Clones criados: %d", qtdClones);
    }
}
