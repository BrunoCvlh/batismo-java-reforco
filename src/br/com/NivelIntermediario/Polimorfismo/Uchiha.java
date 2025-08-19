package br.com.NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uchiha() {
        super();
    }

    @Override
    public void JogarShuriken(){
        System.out.printf("\nO ninja %s utilizou Shuriken de fogo!",nome);
    };

    public void SharinganAtivado(){
        System.out.println("Eu tenho sharingan e ativei!");
    };

    @Override
    public void EstrategiaDeCombate(){ //vindo de EspecialNinja
        System.out.printf("Sou %s Uchiha e esta é minha estratégia ninja!\n", nome);
    };

    @Override
    public void EstrategiaDeCombate(int qi){
        System.out.printf("Sou %s Uchiha e para usar minha estratégia de combate, meu QI é %d\n", nome,qi);
    };
}
