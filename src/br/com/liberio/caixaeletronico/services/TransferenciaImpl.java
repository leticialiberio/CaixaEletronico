package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia{
    private final MemoriaContaRepository repository;

    public TransferenciaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroContaDestino, int numeroContaOrigem) {
        Conta contaOrigem;
        Conta contaDestino;
        contaOrigem = repository.findById(numeroContaDestino);
        contaDestino = repository.findById(numeroContaOrigem);
        contaOrigem.retirarSaldo(valor);
        contaDestino.adicionaSaldo(valor);

        System.out.println("Conta de origem:" + numeroContaOrigem);
        System.out.println("Valor da transferência: " + valor);
        System.out.println("Conta de destino:" + numeroContaDestino);
        System.out.println();
        System.out.printf("Transferência efetuada com sucesso! %nO saldo atualizado é de R$%.2f %n%n", contaOrigem.getSaldo());

        System.out.printf("Transferência recebida com sucesso! %nO saldo atualizado é de R$%.2f %n%n", contaDestino.getSaldo());

    }
}
