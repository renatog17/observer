package monitoramentoriscos;

public interface Observable {

	void inscrever(Observer observer);
	void desincrever(Observer observer);
	void notificar(String mensagem);
}
