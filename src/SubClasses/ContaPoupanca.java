package SubClasses;

import SuperConta.Conta;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, double saldoInicial, double taxaRendimento) {
        super(numero, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        saldo += saldo*taxaRendimento / 100;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
