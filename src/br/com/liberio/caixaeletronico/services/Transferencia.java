package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.model.Conta;
/**
 * Transferir um valor entre a conta de origem para a conta de destido.
 */
public interface Transferencia {

    /**
     * Método usado para transferir
     *
     * @param valor         Valor que eu quero transferir
     * @param numeroContaDestino  Número da conta que vai receber o dinheiro
     * @param origem        Conta de onde vai partir a transação
     */
    void transferir(double valor, Conta numeroContaDestino, Conta origem);
}

