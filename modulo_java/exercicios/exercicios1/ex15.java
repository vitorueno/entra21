package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200; */

public class ex15 {
    public static void main(String[] args) {
        System.out.println("Verificar se num está entre 100 e 200: \n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = leitor.nextFloat();
        leitor.close();

        if (num >= 100 && num <= 200)
            System.out.printf("%.2f está no intervalo (aberto) entre 100 e 200\n", num);
        else
            System.out.printf("%.2f não está no intervalo (aberto) entre 100 e 200\n", num);

    }
}
