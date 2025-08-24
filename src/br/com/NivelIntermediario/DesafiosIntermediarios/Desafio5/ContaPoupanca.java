package br.com.NivelIntermediario.DesafiosIntermediarios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String nomeNinjaConta, double saldo) {
        super(nomeNinjaConta, saldo);
    }

    @Override
    public void consultarSaldo(){
        saldo += valorDeDepositoOuSaque;
        System.out.printf("O saldo do %s em CONTA POUPANÇA é: %.2f\n", nomeNinjaConta, saldo);
    };

    @Override
    public void depositarDouble(double valorDeDepositoOuSaque){
        valorDeDepositoOuSaque = valorDeDepositoOuSaque * 0.99;
        System.out.printf("Este é o valor de depósito depois da taxa: %.2f\n",valorDeDepositoOuSaque);
        saldo += valorDeDepositoOuSaque;
        System.out.printf("O ninja %s depositou %.2f em CONTA POUPANÇA\n", nomeNinjaConta, valorDeDepositoOuSaque);
    };
}

