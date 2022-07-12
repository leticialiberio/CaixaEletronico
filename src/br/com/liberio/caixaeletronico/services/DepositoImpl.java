package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    } //método para efetuar o depósito, usa a memória para buscar a conta armazenada

    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta; //usa a classe conta modelo

        conta = repository.findById(numeroDaConta); //indica a conta em que o depósito será efetuado através da sua id (número da conta)

        conta.adicionaSaldo(valor); //adiciona o valor depositado ao saldo inicial da conta

        System.out.println("Valor depositado: " + valor);
        System.out.println("Número da conta de depósito: " + numeroDaConta);
        System.out.println();
        System.out.printf("Depósito efetuado com sucesso! %nO saldo atualizado é de R$%.2f %n%n", conta.getSaldo());
    }
}
