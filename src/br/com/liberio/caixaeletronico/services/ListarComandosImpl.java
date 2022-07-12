package br.com.liberio.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Escolha uma das operações abaixo: ");
        System.out.println("Digite 0 para Sair");
        System.out.println("Digite 1 para Saque");
        System.out.println("Digite 2 para Depósito");
        System.out.println("Digite 3 para Abrir Nova Conta");
//        System.out.println("Digite 4 para Transferência");
        System.out.println();
    }
}
