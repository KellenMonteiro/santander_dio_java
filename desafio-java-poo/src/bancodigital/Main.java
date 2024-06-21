package bancodigital;

public class Main {
    public static void main(String[] args) {

        Cliente Kellen = new Cliente();
        Kellen.setNome("Kellen");

        Conta corrente = new ContaCorrente(Kellen);
        corrente.depositar(100);
        corrente.sacar(50);
        

        Conta poupanca = new ContaPoupanca(Kellen);
        corrente.tranferir(100, poupanca);
        poupanca.sacar(250);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}