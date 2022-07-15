package br.com.liberio.caixaeletronico.services;

import br.com.liberio.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {
    private final Deposito deposito;
    private final Saque saque;
    private final AbrirConta abrirConta;
    private final Transferencia transferencia;

    public ExecutarComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new DepositoImpl(repository);
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.transferencia = new TransferenciaImpl(repository);
    }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Operação finalizada.");
            resultado = false;

        } else if (comando == 1) {
            System.out.println("Seja bem-vindo! Sua conta foi aberta com sucesso!");
            abrirConta.execute();

        } else if (comando == 2) {
            System.out.println("Digite o número da conta:");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor do saque:");
            double valor = entrada.nextDouble();

            saque.execute(valor, numero);

        } else if (comando == 3) {
            System.out.println("Digite o número da conta:");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor do depósito:");
            double valor = entrada.nextDouble();

            deposito.execute(valor, numero);

        } else if (comando == 4) {
            System.out.println("Digite o número da conta de débito:");
            int numeroContaOrigem = entrada.nextInt();

            System.out.println("Digite o número da conta para crédito:");
            int numeroContaDestino = entrada.nextInt();

            System.out.println("Digite o valor da transferência:");
            double valor = entrada.nextDouble();

            transferencia.execute(valor, numeroContaOrigem, numeroContaDestino);

        } else {
            System.out.println("Opção inválida! Tente novamente!");
        }
        return resultado;
    }
}
