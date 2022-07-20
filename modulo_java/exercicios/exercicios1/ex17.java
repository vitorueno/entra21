package exercicios.exercicios1;

import java.util.Scanner;

/* Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive); */

public class ex17 {
    public static void main(String[] args) {
        System.out.println("Verificar quantos números estão dentro do intervalo:\n");

        int min = 10;
        int max = 150;
        int qntdNoIntervalo = 0;
        int qntdTotal = 80;

        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= qntdTotal; i++) {
            System.out.print(i + "- Digite um número: ");
            float num = leitor.nextFloat();
            if (num >= min && num <= max)
                qntdNoIntervalo++;
        }
        leitor.close();

        System.out.println(
                qntdNoIntervalo + " números estão dentro do intervalo entre " + min + " e " + max + " (inclusive)");
    }
}
