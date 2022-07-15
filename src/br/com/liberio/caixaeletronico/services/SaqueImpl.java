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

        System.out.println("Valor do saque: R$" + valor);
        System.out.println("Número da conta para débito: " + numeroDaConta);
        System.out.println();
        System.out.printf("Saque efetuado com sucesso! %nO saldo atualizado é de R$%.2f %nSaldo sujeito a alteração até o final do dia.%n", conta.getSaldo());
    }
}

