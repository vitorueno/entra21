package exercicios.exercicios1;

import java.util.Scanner;

/* Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior; */

public class ex14 {
    public static void main(String[] args) {
        System.out.println("Verificar qual dos dois número é maior: \n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        leitor.close();

        int maior = (num1 > num2) ? num1 : num2;
        int menor = (num1 + num2) - maior;

        System.out.printf("Maior: %d\nMenor: %d\n", maior, menor);
    }
}
