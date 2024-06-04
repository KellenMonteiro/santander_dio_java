package apps;

public class Telegram extends ServiçoMensagemInstantanea {
    
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

	@Override
	public void salvarHistoricoMensagem() {
		throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
	}
}