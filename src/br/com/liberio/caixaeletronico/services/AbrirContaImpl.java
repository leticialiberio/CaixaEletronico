package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta {
private final MemoriaContaRepository repository;

    public AbrirContaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    } //método para abertura da conta usando a mémoria para armazenar

    @Override
    public Conta execute() {
        Conta conta; //usa a classe conta modelo

        conta = new Conta(); // construtor para criar uma conta nova

        repository.adiciona(conta); //usa o repositório e adiciona uma nova conta

        System.out.printf("Conta número %d o saldo é de R$ %.2f %n %n", conta.getNumeroDaConta(), conta.getSaldo());

        return conta;
    }
}
