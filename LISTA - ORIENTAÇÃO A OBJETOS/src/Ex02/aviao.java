/*
 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package Ex02;

public class aviao {
	
	private String nomeDoPassageiro;
	private String destino;
	private String poltrona;
	private String horario;
	private int data;
	private int numeroVoo;
	private String modelo;
	
	public aviao(String nomeDoPassageiro, String destino, String poltrona, String horario, int data, int numeroVoo, String modelo) {
		
		this.nomeDoPassageiro = nomeDoPassageiro;
		this.destino = destino;
		this.poltrona = poltrona;
		this.horario = horario;
		this.data = data;
		this.numeroVoo = numeroVoo;
		this.modelo = modelo;
	}


	public String getNomeDoPassageiro() {
		return nomeDoPassageiro;
	}


	public void setNomeDoPassageiro(String nomeDoPassageiro) {
		this.nomeDoPassageiro = nomeDoPassageiro;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getPoltrona() {
		return poltrona;
	}


	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public int getNumeroVoo() {
		return numeroVoo;
	}


	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void imprimirInfo()
	{
		System.out.println(nomeDoPassageiro+" tem voo agendado para: "+destino+", com assento marcado "+poltrona+", saída às "+horario+
				", em "+data+". O código do voo é "+numeroVoo+", da nave  "+modelo+". Boa viagem!");
	}
}
