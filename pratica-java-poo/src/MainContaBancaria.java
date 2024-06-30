import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double saldoInicial = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorSaque = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

    
        conta.depositar(valorDeposito);


        conta.sacar(valorSaque);

        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque feito.");
        }
        imprimirSaldo();
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }
}


