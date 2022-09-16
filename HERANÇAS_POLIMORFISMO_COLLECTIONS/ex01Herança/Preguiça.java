package ex01Herança;

public class Preguiça extends Animal{

	private String escala;
	
	public Preguiça(String nome, int idade, String som, String escala) {
		super(nome, idade, som);
		
		this.escala = escala;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nO bicho preguiça "+getNome()+" tem "+getIdade()+
				" anos, para se comunicar ele "+getSom()+" e ele é muito bom em "+escala);
	}

}
