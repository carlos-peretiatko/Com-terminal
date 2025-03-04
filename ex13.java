package reforco0403;

import java.util.Scanner;

public class ex13 {
    
    //Faça um programa que receba 3 notas do usuário e informe a média dessas notas.
    //Retorne a média

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite a " + (i+1) + " nota: ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("A média das notas é: " + calculaMedia(notas));

        scanner.close();
    }

    public static double calculaMedia(double notas[]){

        double media = 0.0;

        for(int i = 0; i < 3; i++){
            media += notas[i];
        }

        return media / 3;

    }

}
