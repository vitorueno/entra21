package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número; */

public class ex24 {
    public static void main(String[] args) {
        System.out.println("Verificar se é positivo, negativo ou nulo:\n");

        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.print("\nDigite um número: ");
            float num = leitor.nextFloat();

            if (num > 0)
                System.out.println("Número positivo!");
            else if (num < 0)
                System.out.println("Número negativo!");
            else
                System.out.println("Número nulo (zero)!");

            int continuar = 1;
            while (true) {
                System.out.print("\nDeseja inserir outro número? [1-sim; 2-não]: ");
                continuar = leitor.nextInt();

                if (continuar == 1 || continuar == 2)
                    break;
            }

            if (continuar == 2)
                break;
        }
        leitor.close();
    }
}
