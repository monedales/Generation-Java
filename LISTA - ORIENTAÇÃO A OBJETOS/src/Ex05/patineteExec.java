package Ex05;

public class patineteExec {

	public static void main(String[] args) {
		
		patinete modelo1 = new patinete("elétrico", "azul turquesa", 30);
		
		modelo1.imprimirInfo();
		modelo1.setCor("lilás");
		modelo1.setVelocidade(35);
		modelo1.imprimirInfo();

	}

}
