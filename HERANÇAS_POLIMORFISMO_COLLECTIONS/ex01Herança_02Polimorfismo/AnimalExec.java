package ex01Herança;

public class AnimalExec {

	public static void main(String[] args) {
		
		Cavalo cavalo = new Cavalo("Garanhão",13);
		Cachorro doguinho = new Cachorro("Asmodeus", 6);
		Preguiça preguica = new Preguiça("Geraldo",43);
		
		Animal animal = null;
		
		cavalo.imprimirInfo();
		cavalo.som();
		cavalo.movimento();
		
		doguinho.imprimirInfo();
		doguinho.som();
		doguinho.movimento();
		
		preguica.imprimirInfo();
		preguica.som();
		preguica.movimento();
		
	}

}
