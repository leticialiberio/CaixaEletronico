package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta;

        conta = repository.findById(numeroDaConta);

        conta.retirarSaldo(valor);

        System.out.printf("Valor do saque: R$%.2f%n", valor);
        System.out.println("Número da conta para débito: " + numeroDaConta);
        System.out.println();
        System.out.printf("Saque efetuado com sucesso! %nO saldo atualizado é de R$%.2f. %nSujeito a alteração até o final do dia.%n%n", conta.getSaldo());
    }
}

