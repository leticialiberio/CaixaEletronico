package br.com.liberio.caixaeletronico;

import br.com.liberio.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletronico ligado. Seja bem-vindo!");
        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {
            System.out.println("Deseja continuar?");
        }
        System.out.println("Até logo!");
    }
}
