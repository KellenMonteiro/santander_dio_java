package apps;
public class MSNMessenger extends ServiçoMensagemInstantanea{
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}

	@Override
	public void salvarHistoricoMensagem() {
		throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
	}
}