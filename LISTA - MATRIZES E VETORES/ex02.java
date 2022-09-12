/*
 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
 */

package matrizVetor;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int x, somaPar=0, contImpar=0;
		
		Scanner receba = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nDigite um número: ");
			numeros[x] = receba.nextInt();
			
			if(numeros[x] % 2 == 0)
			{
				System.out.println("\nNúmero par! "+numeros[x]);
				somaPar += numeros[x];
			} else {
				System.out.println("\nNúmero ímpar! "+numeros[x]);
				contImpar++;
			}
		}
		System.out.println("\nSoma dos números pares: "+somaPar);
		System.out.println("\nQuantidade de números ímpares: "+contImpar);
	}
}
