import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServiçoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServiçoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="FACE"; 
		
		if(appEscolhido.equals("MSN"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("FACE"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("TELE"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}