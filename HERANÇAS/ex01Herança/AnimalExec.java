package ex01Herança;

public class AnimalExec {

	public static void main(String[] args) {
		
		Cavalo cavalo = new Cavalo("Garanhão",13,"relincha","correr");
		Cachorro doguinho = new Cachorro("Asmodeus", 6, "late","correr");
		Preguiça preguica = new Preguiça("Geraldo",43,"dá risada","subir árvores");
		
		cavalo.imprimirInfo();
		doguinho.imprimirInfo();
		preguica.imprimirInfo();
		
	}

}
