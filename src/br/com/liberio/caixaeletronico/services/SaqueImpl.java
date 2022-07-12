package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    } //método para efetuar o saque, usa a memória para buscar a conta armazenada

    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta; //usa a classe conta modelo

        conta = repository.findById(numeroDaConta); //indica a conta em que o saque será efetuado através da sua id (número da conta)

        conta.retirarSaldo(valor); //diminui o valor depositado ao saldo inicial da conta

        System.out.println("Valor sacado: " + valor);
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println();
        System.out.printf("Saque efetuado com sucesso! %nO saldo atualizado é de R$%.2f %n%n", conta.getSaldo());
    }
}

