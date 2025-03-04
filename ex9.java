package reforco0403;

import java.util.Scanner;

public class ex9 {
    
    //Faça um método que receba 4 números como parâmetros, some os 4 números.
    //Retorne a soma.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int nums[] = new int[4];

        for(int i = 0; i < 4; i++){
            System.out.println("Digite o " + (i+1) + " número :");
            nums[i] = scanner.nextInt();
        }

        System.out.println("A soma dos números é: " + soma(nums));

        scanner.close();

    }

    public static int soma(int nums[]){
        int resultado = 0;

        for(int i = 0; i < 4; i++){
            resultado += nums[i];
        }

        return resultado;
    }

}
