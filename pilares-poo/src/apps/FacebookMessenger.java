package apps;
public class FacebookMessenger extends ServiçoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}

	@Override
	public void salvarHistoricoMensagem() {
		throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
	}
}