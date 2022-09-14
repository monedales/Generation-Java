package Ex02;

public class aviaoExec {


	public static void main(String[] args) {
		
		aviao embarque1 = new aviao("Letícia", "Florença", "A13","23h58",29012023, 136931, "Boeing 707-100");
		
		embarque1.imprimirInfo();
		System.out.println("*********Alterações no voo!**********");
		embarque1.setHorario("00h51");
		embarque1.imprimirInfo();
		
	}
}
