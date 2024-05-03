import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 100.0;
        while (mesada>0) {
            Double valorCompras = valorAleatorio();
            if(valorCompras > mesada)
                valorCompras = mesada;

            System.out.println("Valor da compra: " + valorCompras + " Adicionado no carrinho");
            mesada = mesada - valorCompras;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Maria gastou toda a sua mesada nas compras");        

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,30);
    }
}
