package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5;

public abstract class ContaBancaria implements Conta{

    String nomeNinjaConta;
    double saldo;
    double valorDeDepositoOuSaque;
    TipoConta tipoConta;

    public ContaBancaria(String nomeNinjaConta, double saldo) {
        this.nomeNinjaConta = nomeNinjaConta;
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        saldo += valorDeDepositoOuSaque;
        System.out.printf("O saldo do %s é: %.2f", nomeNinjaConta, saldo);
    };

    public void depositarDouble(double valorDeDepositoOuSaque){
         saldo += valorDeDepositoOuSaque;
        System.out.printf("O ninja %s depositou %.2f\n", nomeNinjaConta, valorDeDepositoOuSaque);
    };
}
