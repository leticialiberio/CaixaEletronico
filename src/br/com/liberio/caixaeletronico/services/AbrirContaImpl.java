package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta {
private final MemoriaContaRepository repository;

    public AbrirContaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Conta execute() {
        Conta conta;

        conta = new Conta();

        repository.adiciona(conta);

        System.out.printf("O número da sua conta é %d e o saldo atual é de R$%.2f %n %n", conta.getNumeroDaConta(), conta.getSaldo());

        return conta;
    }
}
