package monitoramentoriscos;

public class Main {

	public static void main(String[] args) {
		Observable sensorPluviometrico = new SensorPluviometrico("Itapuã");
		Observer renato = new Habitante("renato@email.com");
		
		sensorPluviometrico.inscrever(renato);
		
		sensorPluviometrico.notificar("Alerta de chuva 8/10");

	}

}
