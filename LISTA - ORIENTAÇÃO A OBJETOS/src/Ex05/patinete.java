package Ex05;


public class patinete {
	
	private String tipo;
	private String cor;
	private double velocidade;
	
	public patinete(String tipo, String cor, double velocidade) 
	{
		this.tipo = tipo;
		this.cor = cor;
		this.velocidade = velocidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("Meu patinete é "+tipo+" com acabamento em "+cor+", podendo chegar até "+velocidade+" km/h.");
	}

}
