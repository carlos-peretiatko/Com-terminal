package reforco0403;

import java.util.Scanner;

public class ex10 {
    
    //Faça um método booleano que 
    //retorne true se o número passado como parâmetro seja par.
    //Retorne false caso seja ímpar.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = scanner.nextInt();

        if(par(num) == true){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        scanner.close();

    }

    public static boolean par(int num){

        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }

    }

}
