package exercicios.exercicios1;

import java.util.Scanner;

/* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a possuir ovalor da variável B e a variável B passe a possuir o valor da variável A. Apresentar osvalores trocados; */

public class ex6 {
    public static void main(String[] args) {
        System.out.println("Trocar valores de duas variáveis:\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número para a primeira variável (A): ");
        float a = leitor.nextFloat();
        System.out.print("Digite um número para a segunda variável (B): ");
        float b = leitor.nextFloat();
        leitor.close();

        System.out.println("Variáveis antes de trocar os valores: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        float tmp = a;
        a = b;
        b = tmp;

        System.out.println("Variáveis após de trocar os valores: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
