package br.com.liberio.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Para continuar escolha uma das operações abaixo: ");
        System.out.println();
        System.out.println("Digite 0 para Sair");
        System.out.println("Digite 1 para abrir nova conta");
        System.out.println("Digite 2 para efetuar um saque");
        System.out.println("Digite 3 para efetuar um depósito");
        System.out.println("Digite 4 para efetuar uma transferência");
        System.out.println();
    }
}
