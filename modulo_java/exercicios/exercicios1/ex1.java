package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba dois números e exiba o resultado da sua soma; */

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Somar dois números:\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = leitor.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = leitor.nextFloat();

        leitor.close();

        float soma = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + soma);

    }
}
