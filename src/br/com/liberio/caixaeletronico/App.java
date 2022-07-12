package br.com.liberio.caixaeletronico;

import br.com.liberio.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletronico ligado!");
        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {
            System.out.println("Executando um novo comando!");
        }
        System.out.println("Caixa eletronico desligando!");
    }
}
