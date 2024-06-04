package sistema.carro;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("878664");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("647488");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
    
}