package br.com.NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EspecialNinja {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chounnin, Jounnin, Kage (criar enum)
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    //TODO: Sobrecarga do construtor chamando os novos atributos
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public Ninja() {
    }

    public void UsarHabilidadeNinja(){ //vindo de EspecialNinja
        System.out.println("Esta é minha habilidade ninja!\n");
    };

    public void EstrategiaDeCombate(){ //vindo de EspecialNinja
        System.out.println("Esta é minha estratégia ninja!\n");
    };

    public void EstrategiaDeCombate(int qi){
        System.out.printf("Para usar minha estratégia de combate, meu QI é %d\n", qi);
    };

    public void JogarShuriken(){
        System.out.printf("\nO ninja %s jogou uma Shuriken\n", nome);
    };

    @Override
    public String toString() {
        return "Meu nome é " + nome;
    }
}
