package reforco0403;

import java.util.Scanner;

public class ex16 {
    
    //Faça um programa que descubra:
    //a) O maior elemento de um vetor.
    //b) O menor elemento.
    //c) A média dos valores
    //Retorne esses valores


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + " número :");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("O maior número é: " + descobreMaior(vetor));
        System.out.println("O menor número é: " + descobreMenor(vetor));
        System.out.println("A média dos números é: " + media(vetor));

        scanner.close();
    }

    public static int descobreMaior(int vetor[]){
        int maior = vetor[0];

        for(int i = 0; i < vetor.length; i ++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int descobreMenor(int vetor[]){
        int menor = vetor[0];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static double media(int vetor[]){
        double media = 0.0;

        for(int i = 0; i < vetor.length; i++){
            media += vetor[i];
        }

        return media/vetor.length;
    }

}
