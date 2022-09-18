package ex01Herança;

public class Cavalo extends Animal {
		
	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}
	
	public void imprimirInfo()
	{
		System.out.println("\nO cavalo "+getNome()+" tem "+getIdade()+" anos");
	}

	@Override
	public void som() {
		System.out.println("iiih hihihi");
		
	}

	@Override
	public void movimento() {
		System.out.println("Cavalo relincha e sai em disparada rumo ao por do sol.");
		
	}

}
