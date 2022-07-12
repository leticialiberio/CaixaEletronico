package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {
    private final Deposito deposito;
    private final Saque saque;
    private final AbrirConta abrirConta;

    public ExecutarComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new DepositoImpl(repository);
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
    }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Encerrando a operação");
            resultado = false;

        } else if (comando == 1) {
            System.out.println("Digite o número da conta:");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor do saque:");
            double valor = entrada.nextDouble();

            saque.execute(valor, numero);

        } else if (comando == 2) {
            System.out.println("Digite o número da conta:");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor do depósito:");
            double valor = entrada.nextDouble();

            deposito.execute (valor, numero);

        } else if (comando == 3) {
            abrirConta.execute();

        } else {
            System.out.println("Opção inválida! Tente novamente!");
        }
        return resultado;
    }
}
