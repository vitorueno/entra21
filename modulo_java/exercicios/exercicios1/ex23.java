package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80,
menor que 25 ou igual a 40; */

public class ex23 {
    public static void main(String[] args) {
        System.out.println("Verificar se número atende requisitos\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = leitor.nextFloat();
        leitor.close();

        if (num > 80)
            System.out.printf("%.2f é maior que 80\n", num);

        if (num < 25)
            System.out.printf("%.2f é menor que 25\n", num);

        if (num == 40)
            System.out.printf("%.2f é igual a 40\n", num);
    }
}
