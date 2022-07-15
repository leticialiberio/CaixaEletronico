package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia {
    private final MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroContaOrigem, int numeroContaDestino) {
        Conta contaOrigem;
        Conta contaDestino;
        contaOrigem = repository.findById(numeroContaOrigem);
        contaDestino = repository.findById(numeroContaDestino);
        contaOrigem.retirarSaldo(valor);
        contaDestino.adicionaSaldo(valor);

        System.out.println("Conta de débito: " + numeroContaOrigem);
        System.out.printf("Valor da transferência: R$%.2f%n", valor);
        System.out.println("Conta para crédito: " + numeroContaDestino);
        System.out.println();
        System.out.printf("Transferência efetuada com sucesso! %nO saldo atualizado é de R$%.2f. %nSujeito a alteração até o final do dia.%n%n", contaOrigem.getSaldo());
        System.out.printf("Transferência recebida com sucesso! %nO saldo atualizado é de R$%.2f. %nSujeito a alteração até o final do dia.%n%n", contaDestino.getSaldo());
    }
}
