/*
 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */

package laços;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		
		int idade, genero,psi,contPc=0,contMn=0,contHa=0,contNdc=0,contPn40=0,contPc18=0, pessoas=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(pessoas<=150)
		{
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nDigite seu gênero: \n(1)Fem\n(2)Masc\n(3)Não Declarado");
			genero = leia.nextInt();
			System.out.println("\nDigite seu fator psicológico: \n(1)Calma\n(2)Nervosa\n(3)Agressiva");
			psi = leia.nextInt();
			
			if(psi == 1) 
			{
				contPc++;
			}
			
			if(genero == 1 && psi == 2)
			{
				contMn++;
			}
			
			if(genero == 2 && psi == 3)
			{
				contHa++;
			}
			
			if(genero == 3 && psi == 1)
			{
				contNdc++;
			}
			
			if(idade > 40 && psi == 2)
			{
				contPn40++;
			}
			
			if(idade < 18 && psi == 1)
			{
				contPc18++;
			}
			
			pessoas++;
		}
		System.out.println("\nNúmero de pessoas calmas: "+contPc);
		System.out.println("\nNúmero de mulheres nervosas: "+contMn);
		System.out.println("\nNúmero de homens agressivos: "+contHa);
		System.out.println("\nNúmero de pessoas calmas não declaradas: "+contNdc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+contPn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contPc18);
	}
}
