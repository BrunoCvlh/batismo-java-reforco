package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5teste;

public abstract class ContaBancaria implements Conta{
    String nomeNinjaConta;
    double valorSaldo;
    double valorDeposito;

    public ContaBancaria(String nomeNinjaConta, double valorSaldo) {
        this.nomeNinjaConta = nomeNinjaConta;
        this.valorSaldo = valorSaldo;
        this.valorDeposito = valorDeposito;
    }

    public void consultarSaldo(){
        System.out.printf("O saldo do %s é %.2f", nomeNinjaConta, valorSaldo);
    };

    public void depositar(double valorDeposito) {
        valorSaldo += valorDeposito;
        System.out.printf("Foi depositado %.2f na conta do ninja %s.", valorDeposito, nomeNinjaConta);
    }
}
