package br.com.liberio.caixaeletronico.services;

/**
 * Transferir um valor entre a conta de origem para a conta de destido.
 */
public interface Transferencia {

    /**
     * Método usado para transferir
     *
     * @param valor         Valor que eu quero transferir
     * @param numeroContaDestino  Número da conta que vai receber o dinheiro
     * @param numeroContaOrigem        Conta de onde vai partir a transação
     */
    void execute(double valor, int numeroContaDestino, int numeroContaOrigem);
}

