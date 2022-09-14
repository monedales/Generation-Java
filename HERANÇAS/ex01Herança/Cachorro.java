package ex01Herança;

public class Cachorro extends Animal {
	
	private String correr;
	
	public Cachorro(String nome, int idade, String som, String correr) {
		super(nome, idade, som);
		
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfo() {
		System.out.println("\nO dog "+getNome()+" tem "+getIdade()+
				" anos, para se comunicar ele "+getSom()+" e ele também gosta de "+correr);
	}

	
	

	

}
