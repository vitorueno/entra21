package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
maior, e uma mensagem que são diferentes; */

public class ex25 {
    public static void main(String[] args) {
        System.out.println("Comparar o valor de dois números\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro número: ");
        float a = leitor.nextFloat();
        System.out.print("Digite o valor do segundo número: ");
        float b = leitor.nextFloat();
        leitor.close();

        if (a == b) {
            System.out.println("Números iguais!");
        } else {
            float maior = (a > b) ? a : b;
            float menor = (a + b) - maior;
            System.out.printf("Números diferentes e o maior foi o %.2f (em comparação com %.2f) \n", maior, menor);
        }
    }
}
