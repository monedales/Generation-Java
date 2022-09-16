/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa 
deverá trabalhar com Collection do tipo List do Java para manipular 
os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

package ex01Herança;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03Collections {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		int op;
		
		ArrayList<String> lanchos = new ArrayList();
		
		do
		{
			System.out.println("\n*************************Bem-vinde ao SubUAI******************************");
			System.out.println("\n\tA primeira e única casa de lanchos de pão de queijo!");
			System.out.println("\n\tEscolha uma opção:");
			System.out.println("\n\t(1). Adicionar itens");
			System.out.println("\n\t(2). Remover itens");
			System.out.println("\n\t(3). Atualizar itens");
			System.out.println("\n\t(4). Confira os itens da sua lista");
			System.out.println("\n\t(0). Conclua seu pedido");
			op = escreva.nextInt();
			System.out.println("\n**************************************************************************");
			
			switch(op)
			{
			case 1:
				escreva.nextLine();
				System.out.println("\nDigite o ingrediente que quer adicionar ao seu SubUAI: ");
				String ingrediente = escreva.nextLine();
				lanchos.add(ingrediente);
				System.out.println(lanchos);
				break;
				
			case 2:
				escreva.nextLine();
				System.out.println("\nDigite o ingrediente que quer remover do seu SubUAI: ");
				String ingrediente2 = escreva.nextLine();
				if(lanchos.contains(ingrediente2))
				{
					lanchos.remove(ingrediente2);
				} else
				{
					System.out.println("\nTá doido sô, não tem esse ingrediente adicionado!");
				}
				System.out.println(lanchos);
				break;
			case 3:
				escreva.nextLine();
				System.out.println("\nDigite o ingrediente que quer atualizar no seu SubUAI: ");
				String troca = escreva.nextLine();
				System.out.println("\nDigite o ingrediente que entrará no lugar de "+troca);
				String novo = escreva.nextLine();
				System.out.println("\nConfirma a troca de "+troca+" por "+novo+"?");
				
				if(lanchos.contains(troca))
				{
					lanchos.remove(troca);
					lanchos.add(novo);
				} else
				{
					System.out.println("\nTá doido sô, não tem esse ingrediente adicionado!");
				}
				System.out.println(lanchos);
				break;
				
			case 4:
				System.out.println("\nIngredientes no seu SubUai: ");
				System.out.println(lanchos);
				break;
				
			case 0:
				System.out.println("\nMuito obrigada por escolher o SubUai! Aproveite seu lancho e volte sempre!");
				break;
				default:
					System.out.println("\nOpção inválida!");
			}
			
		} while(op != 0);
		
	}

}
