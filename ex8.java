package reforco0403;

import java.util.Scanner;

public class ex8 {

	//Faça um programa em que o usuário entra com um número de 1 a 4
	//Com o número 1 sendo verão, 2 sendo outono...
	//Dependendo de o que o usuário informa, retorne:
	//É verão
	//E o tempo está quente.
	//Ou
	//É inverno
	//E está frio.
	//Faça um método para cada estação do ano

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int estacao;

		System.out.println("Digite um número de 1 a 4");
		estacao = scanner.nextInt();

		estacao(estacao);

		scanner.close();

	}

	public static void estacao(int estacao){

		switch (estacao) {
			case 1: { 
				System.out.println("É verão");
				System.out.println("O tempo está quente");
				break;
			}
			case 2: {
				System.out.println("É outono");
				System.out.println("O tempo não está nem quente nem frio");
				break;
			}
			case 3: {
				System.out.println("É inverno");
				System.out.println("O tempo está frio");
				break;
			}
			case 4: {
				System.out.println("É primavera");
				System.out.println("O tempo não está nem quente nem frio");
				break;
			} default: {
				System.out.println("Estação inválida");
			}

		}

	}

}
