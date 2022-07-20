package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10; */

public class ex13 {
    public static void main(String[] args) {
        System.out.println("Verificar se número é maior que 10\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = leitor.nextFloat();
        leitor.close();

        if (num > 10) {
            System.out.printf("\n%.1f é maior que 10\n", num);
        }
    }
}
