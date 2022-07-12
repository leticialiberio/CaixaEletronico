package br.com.liberio.caixaeletronico.br.com.liberio.generics;

import br.com.liberio.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {
    public static void main(String[] args) {
//        List lista = new ArrayList();
//        lista.add("Elemento 1");
//        lista.add(1);
//        lista.add(new Conta());
//        System.out.println(lista);

        List<Integer> primos = new ArrayList<>();
        primos.add(1);
        primos.add(2);
        primos.add(3);

        int numero = 0;
        numero = numero + primos.get(0);

        System.out.println(numero);
    }
}
