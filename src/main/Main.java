package main;

import SubClasses.ContaCorrente;
import SubClasses.ContaPoupanca;
import SuperConta.Conta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        lista.add(new ContaCorrente(1, 5000, 80000));
        lista.add(new ContaPoupanca(2, 10000, 10));

        for (Conta conta : lista){
            conta.depositar(2000);
            System.out.println(conta.getSaldoDisponivel());
            System.out.println("******");
        }
    }
}
