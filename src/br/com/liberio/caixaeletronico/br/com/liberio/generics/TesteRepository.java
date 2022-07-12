package br.com.liberio.caixaeletronico.br.com.liberio.generics;

import br.com.liberio.caixaeletronico.model.Conta;
import br.com.liberio.caixaeletronico.repository.BaseRepository;
import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

public class TesteRepository {
    public static void main(String[] args) {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        Conta conta1 = new Conta();
        conta1.adicionaSaldo(100);

        Conta conta2 = new Conta();
        conta1.adicionaSaldo(50);

        repository.adiciona(conta1);
        repository.adiciona(conta2);

        System.out.println(repository.findById(0).getSaldo());
    }
}
