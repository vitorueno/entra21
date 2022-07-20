package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;*/

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Operações entre dois números:\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = leitor.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = leitor.nextFloat();

        leitor.close();

        float soma = num1 + num2;
        float subtracao = num1 - num2;
        float multiplicacao = num1 * num2;
        float divisao = num1 / num2;

        System.out.printf("\n" + num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + subtracao);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
        System.out.print(num1 + " / " + num2 + " = " + divisao);
    }
}
