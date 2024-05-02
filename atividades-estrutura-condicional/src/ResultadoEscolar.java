public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if (nota >= 7)
        System.out.println("Aprovado - Sua nota foi " + nota);

        else if (nota >= 5 && nota < 7)
        System.out.println("Recuperação - Sua nota foi " + nota);

        else
        System.out.println("Reprovado - Sua nota foi " + nota);
    }
}
