/*
 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */

package laços;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		int num=0,x,contPar=0, contImpar=0;
		
		Scanner leia = new Scanner(System.in);
			
		for(x=0;x<10;x++)
		{	
			if(num % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
		}
		System.out.println("\nTotal de "+contPar+" números pares.");
		System.out.println("\nTotal de "+contImpar+" números ímpares.");
	}
}
