package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta;

        conta = repository.findById(numeroDaConta);

        conta.adicionaSaldo(valor);

        System.out.printf("Valor do depósito: R$%.2f%n", valor);
        System.out.println("Número da conta para crédito: " + numeroDaConta);
        System.out.println();
        System.out.printf("Depósito efetuado com sucesso! %nO saldo atualizado é de R$%.2f. %nSujeito a alteração até o final do dia.%n%n", conta.getSaldo());
    }
}
