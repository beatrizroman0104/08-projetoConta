package SubClasses;

import SuperConta.Conta;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public double getSaldoDisponivel() {
        return saldo+limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
