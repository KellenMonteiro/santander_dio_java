import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, Digite o Número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, Digite o Número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o Nome do Cliente:");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, Digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Criando uma instância da conta
        ContaTerminal contaTerminal = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);

        // Exibindo a mensagem de saudação
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo
                + " já está disponível para saque.");

    }
}
