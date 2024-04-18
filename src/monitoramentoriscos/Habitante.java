package monitoramentoriscos;

public class Habitante implements Observer {

	private String email;

	public Habitante(String email) {
		super();
		this.email = email;
	}

	@Override
	public void update(String mensagem) {
		System.out.println("Enviando mensagem para " + this.email + ":\n" + mensagem);

	}

}
