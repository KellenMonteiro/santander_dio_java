

public class Produto {
    public static void main(String[] args) {
        Iphone2007 iphone = new Iphone2007();
        

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Believer ---> Imagine Dragons");

        iphone.ligar("(99) 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://github.com/KellenMonteiro/santander_dio_java");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
