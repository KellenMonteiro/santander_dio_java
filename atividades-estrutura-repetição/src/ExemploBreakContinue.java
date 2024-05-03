public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=20; numero ++) {
            if(numero == 5)
                break; //continue

            System.out.println(numero);
        }
    }
}
