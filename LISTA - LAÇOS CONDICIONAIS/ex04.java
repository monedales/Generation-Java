/*
 Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

package listaLaços;

import java.util.Scanner;
import java.lang.Double;

public class ex04 {

	public static void main(String[] args) {

		double numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();
		
		double restoDiv=numero%2;
		
		if(restoDiv == 0)
		{
			System.out.println("Número par!");
			System.out.printf("Sua raiz quadrada é: "+Math.sqrt(numero));
		} else 
		{
			System.out.println("Número ímpar!");
			System.out.printf("O resultado da potência do seu número é: "+Math.pow(numero, 2));
		}
	}
}
