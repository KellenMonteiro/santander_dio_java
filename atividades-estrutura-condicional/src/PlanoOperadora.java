public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "Basic";

        switch (plano) {
            case "Basic":{
                System.out.println("100 minutos de ligações");
                break;
            }

            case "Midia":{
                System.out.println("100 minutos de ligações");
                System.out.println("Whatsapp e Instagram Grátis");
                break;
            }

            case "Turbo":{
                System.out.println("100 minutos de ligações");
                System.out.println("Whatsapp e Instagram Grátis");
                System.out.println("5Gb Youtube");
                break;
            }
        
            default:
                System.out.println("Sem opção de plano");
                break;
        }
    }
}
