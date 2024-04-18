package monitoramentoriscos;

import java.util.ArrayList;
import java.util.List;

public class SensorPluviometrico implements Observable {

	private String localizacao;
	private List<Observer> inscritos;

	public SensorPluviometrico(String localizacao) {
		super();
		this.localizacao = localizacao;
		this.inscritos = new ArrayList<Observer>();
	}

	@Override
	public void inscrever(Observer observer) {
		this.inscritos.add(observer);

	}

	@Override
	public void desincrever(Observer observer) {
		this.inscritos.remove(observer);

	}

	@Override
	public void notificar(String mensagem) {
		mensagem += " " + this.localizacao;
		for (Observer observer : inscritos) {
			observer.update(mensagem);
		}

	}

}
