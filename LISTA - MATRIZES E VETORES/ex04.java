/*
 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante 
deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 */

package matrizVetor;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		float[][] mat1 = new float[2][2];
		float[][] mat2 = new float[2][2];
		float[][] mat3 = new float[2][2];
		int  valor, linha, coluna, op;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nDigite o valor da matriz: ");
				mat1[linha][coluna] = leia.nextFloat();
				System.out.println("\nDigite o valor da matriz: ");
				mat2[linha][coluna] = leia.nextFloat();
			}
		}
		
		do
		{
			System.out.println("\n\t\tMenu de opções:");
			System.out.println("\n1.Somar as duas matrizes");
			System.out.println("\n2.subtrair a primeira matriz da segunda");
			System.out.println("\n3.adicionar uma constante as duas matrizes");
			System.out.println("\n4.imprimir as matrizes");
			System.out.println("\n0.Sair do programa");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						
						mat3[linha][coluna] = mat1[linha][coluna] + mat2[linha][coluna];
						System.out.println("\nSoma: "+mat3[linha][coluna]);
					}
				}
				break;
			case 2:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						mat3[linha][coluna] = mat1[linha][coluna] - mat2[linha][coluna];
						System.out.println("\nSoma: "+mat3[linha][coluna]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com um valor:");
				valor = leia.nextInt();
				
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						mat1[linha][coluna] += valor;
						mat2[linha][coluna] += valor;
						System.out.println("\nMatriz1: "+mat1[linha][coluna]);
						System.out.println("\nMatriz2: "+mat2[linha][coluna]);
					}
				}
				break;
			case 4:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.println("\nMatriz1: "+mat1[linha][coluna]);
						System.out.println("\nMatriz2: "+mat2[linha][coluna]);
					}
				}
				break;
			case 0:
				System.out.println("\nMuito obrigada!");
				break;
				default:
					System.out.println("\nOpção inválida!");
			}			
			
		} while(op != 0);
	}
}
