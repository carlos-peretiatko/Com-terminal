package reforco0403;

import java.util.Scanner;

public class ex11 {
    
    //Faça um programa que calcule o quadrado de um número caso esse número seja par e
    //calcule o dobro desse número caso esse número seja ímpar.
    //Retorne o resultado

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int num;

        System.out.println("Digite um número: ");
        num = scanner.nextInt();

        System.out.println("O resultado é: " + calcula(num));

        scanner.close();

    }

    public static int calcula(int num) {

        int resultado;

        if (num % 2 == 0) {
            resultado = num * num;
            return resultado;
        } else {
            resultado = num * 2;
            return resultado;
        }

    }

}
