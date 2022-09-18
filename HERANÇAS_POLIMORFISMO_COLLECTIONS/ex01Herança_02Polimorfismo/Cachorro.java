package ex01Herança;

public class Cachorro extends Animal {
		
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
		
	public void imprimirInfo() {
		System.out.println("\nO dog "+getNome()+" tem "+getIdade()+" anos");
	}

	@Override
	public void som() {
		System.out.println("AuAuAu");
		
	}

	@Override
	public void movimento() {
		System.out.println("Cachorro correndo atrás de uma borboleta.");
		
	}

	
	

	

}
