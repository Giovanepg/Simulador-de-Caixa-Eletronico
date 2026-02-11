import java.util.Scanner;  // Importa a classe Scanner para permitir ler dados digitados pelo usuário

public class Atividade {

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in); // Cria o Scanner para ler o teclado
        double saldo = 1000.0;                  // Saldo inicial da conta (começa com R$1000)
        int opcao;                              // Guarda a opção escolhida no menu

        // Laço principal do programa
        // Ele garante que o menu apareça pelo menos uma vez
        // e continue aparecendo até o usuário escolher a opção 4 (sair)
        do {
            System.out.println("\n ==== CAIXA ELETRONICO ====");
            System.out.println("1 - CONSULTAR SALDO ");
            System.out.println("2 - DEPOSITAR VALOR ");
            System.out.println("3 - SACAR VALOR ");
            System.out.println("4 - SAIR ");

            System.out.print("Escolha uma opcao: ");
            opcao = texto.nextInt(); // Lê a opção digitada pelo usuário

            // O switch decide o que fazer de acordo com a opção escolhida
            switch (opcao) {

                case 1:
                    // Mostra o saldo atual da conta
                    System.out.printf("Saldo Atual: R$%.2f\n", saldo);
                    break;

                case 2:
                    // Opção para depósito
                    System.out.print("Digite o valor do deposito: ");
                    double deposito = texto.nextDouble(); // Lê o valor do depósito

                    // Verifica se o valor digitado é válido
                    if (deposito <= 0) {
                        System.out.println("Nao sao permitidos valores negativos");
                    } else {
                        // Soma o valor do depósito ao saldo
                        saldo += deposito;
                        System.out.printf("Deposito realizado. Novo saldo: R$%.2f\n", saldo);
                    }
                    break;

                case 3:
                    // Opção para saque
                    System.out.print("Digite o valor do saque: ");
                    double saque = texto.nextDouble(); // Lê o valor do saque

                    // Verifica se o saque é válido
                    if (saque <= 0) {
                        System.out.println("Nao sao permitidos valores negativos");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        // Subtrai o valor do saque do saldo
                        saldo -= saque;
                        System.out.printf("Saque realizado. Novo saldo: R$%.2f\n", saldo);
                    }
                    break;

                case 4:
                    // Opção escolhida para encerrar o programa
                    System.out.println("Finalizando...");
                    break;

                default:
                    // Caso o usuário digite uma opção que não existe no menu
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 4); // Enquanto a opção for diferente de 4, o menu continua

        texto.close(); // Fecha o Scanner e libera os recursos do sistema
    }
}
