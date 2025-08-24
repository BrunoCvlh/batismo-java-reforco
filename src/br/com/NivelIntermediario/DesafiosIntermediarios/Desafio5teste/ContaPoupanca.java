package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5teste;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String nomeNinjaConta, double valorSaldo) {
        super(nomeNinjaConta, valorSaldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("O valor da CONTA POUPANÇA do ninja %s é de %.2f\n", nomeNinjaConta, valorSaldo);
    }

    @Override
    public void depositar(double valorDeposito) {
        double valorAposTaxa = valorDeposito * 0.99;
        double valorTaxa = valorDeposito * 0.01;
        valorSaldo += valorAposTaxa;
        System.out.printf("O valor de %.2f (taxa de %.2f) foi depositado na CONTA POUPANÇA do ninja %s\n", valorAposTaxa, valorTaxa, nomeNinjaConta);
    }
}
