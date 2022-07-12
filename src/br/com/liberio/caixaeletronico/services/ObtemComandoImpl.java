package br.com.liberio.caixaeletronico.services;

import java.util.Scanner;

public class ObtemComandoImpl implements ObtemComando{

    @Override
    public int execute() {
        System.out.println("Informe a operação desejada: ");
        Scanner entrada = new Scanner(System.in);
        int comando = entrada.nextInt();
        return comando;
    }
}
