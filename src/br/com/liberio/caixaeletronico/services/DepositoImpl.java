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

        System.out.println("Valor do depósito: R$" + valor);
        System.out.println("Número da conta para crédito: " + numeroDaConta);
        System.out.println();
        System.out.printf("Depósito efetuado com sucesso! %nO saldo atualizado é de R$%.2f %nSaldo sujeito a alteração até o final do dia.%n", conta.getSaldo());
    }
}
