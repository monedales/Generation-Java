/*
 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
package listaLaços;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite seu número: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite seu número: ");
		num3 = leia.nextInt();
		
		if (num1 >= num2 && num1 >= num3)
		{
			System.out.printf("\no maior número é: "+ num1);
		} else if (num2 >= num1 && num2 >= num3)
		{
			System.out.printf("\no maior número é: "+ num2);
		} else if (num3 >= num1 && num3 >= num2)
		{
			System.out.printf("\no maior número é: "+ num3);
		}
	}
}
