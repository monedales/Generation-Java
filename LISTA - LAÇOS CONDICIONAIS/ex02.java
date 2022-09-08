/*
 2- Faça um programa que entre com três números e coloque em ordem crescente.
 MAIOR		MEIO		MENOR
 num1		num2		num3
 num1		num3		num2
 num2		num1		num3
 num2		num3		num1
 num3		num1		num2
 num3		num2		num1
 */
package listaLaços;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		int num1, num2, num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite seu número: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite seu número: ");
		num3 = leia.nextInt();
		
		if(num1<=num2 && num2<=num3)
		{
			System.out.println("\nA ordem crescente é: "+num1+", "+num2+", "+num3+".");
		} else if (num1<=num3 && num3<=num2)
		{
			System.out.println("\nA ordem crescente é: "+num1+", "+num3+", "+num2+".");
		} else if (num2<=num1 && num2<=num3)
		{
			System.out.println("\nA ordem crescente é: "+num2+", "+num1+", "+num3+".");
		} else if (num2<=num3 && num2<=num1)
		{
			System.out.println("\nA ordem crescente é: "+num2+", "+num3+", "+num1+".");
		} else if (num3<=num1 && num2<=num2)
		{
			System.out.println("\nA ordem crescente é: "+num3+", "+num1+", "+num2+".");
		} else 
		{
			System.out.println("\nA ordem crescente é: "+num3+", "+num2+", "+num1+".");
		}
	}
}
