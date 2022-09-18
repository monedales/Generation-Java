package ex01Herança;

public class Preguiça extends Animal{
	
	public Preguiça(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nO bicho preguiça "+getNome()+" tem "+getIdade()+" anos");
	}

	@Override
	public void som() {
		System.out.println("hahaha");
		
	}

	@Override
	public void movimento() {
		System.out.println("Bicho preguiça escala as árvores tranquilamente enquanto ri dos humanos.");
		
	}

}
