package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5teste;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String nomeNinjaConta, double valorSaldo) {
        super(nomeNinjaConta, valorSaldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("O saldo da CONTA CORRENTE do ninja %s é %.2f reais\n", nomeNinjaConta, valorSaldo);;
    }

    @Override
    public void depositar(double valorDeposito) {
        valorSaldo += valorDeposito;
        System.out.printf("O valor de %.2f reais foi depositado na CONTA CORRENTE do ninja %s.\n", valorDeposito, nomeNinjaConta);
    }

}
