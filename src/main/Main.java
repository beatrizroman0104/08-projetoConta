package main;

import SubClasses.ContaCorrente;
import SubClasses.ContaPoupanca;
import SuperConta.Conta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //variavel com comportamento polimórfico -> objeto que pode se comportar de 2 ou mais jeitos diferentes
        //vantagem de ter apenas 1 lista
        ArrayList<Conta> lista = new ArrayList<>();

        lista.add(new ContaCorrente(1, 5000, 80000));
        lista.add(new ContaPoupanca(2, 10000, 10));

        System.out.println("Sem rendimento: ");
        for (Conta conta : lista){
            conta.depositar(2000);
            System.out.println(conta.getSaldoDisponivel());
            System.out.println("******");
        }

        //aplicar rendimento apenas na poupança
        System.out.println("Com rendimento: ");
        for (Conta conta : lista){
            if (conta instanceof ContaPoupanca){
                ((ContaPoupanca) conta).aplicarRendimento();
            }
            System.out.println("*******");
            System.out.println(conta.getSaldoDisponivel());
        }


    }
}
