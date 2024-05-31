import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada para o limite diário de saque
        double limiteDiario = scanner.nextDouble();

        while (true) {
            // Entrada para o valor do saque
            double valorSaque = scanner.nextDouble();

            // Se o valor do saque for 0, encerrar as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verifica se o saque excede o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            // Subtrai o valor do saque do limite diário
            limiteDiario -= valorSaque;

            // Imprime a mensagem de saque realizado e o limite restante
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }

        scanner.close();
    }
}
