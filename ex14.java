package reforco0403;

import java.util.Scanner;

public class ex14 {
    
    //Faça um programa que receba 2 números do usuário.
    //Faça um método que descubra qual dos números é maior e retorne esse valor.
    //Se os dois números forem iguais, retorne: número iguais.


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int nums[] = new int[2];

        for(int i = 0; i < 2; i++){
            System.out.println("Digite o " + (i+1) + " número :");
            nums[i] = scanner.nextInt();
        }

        if(descobreMaior(nums) == 0){
            System.out.println("Números iguais");
        } else {
            System.out.println("O maior número é: " + descobreMaior(nums));
        }

        scanner.close();
    }

    public static int descobreMaior(int nums[]){

        if(nums[0] > nums[1]){
            return nums[0];
        } else if(nums[0] < nums[1]){
            return nums[1];
        } else {
            return 0;
        }
   
    }

}
