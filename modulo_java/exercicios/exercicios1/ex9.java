package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 0,07% a. m;*/

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Cálculo de rendimento de poupança após um mês\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite quanto dinheiro você depositou: ");
        float dinheiroDepositado = leitor.nextFloat();
        leitor.close();

        float pctRendimentoAoMes = 0.07f; // rendimendo de 0,07% a.m.
        float valorComRendimento = dinheiroDepositado * (1 + pctRendimentoAoMes);
        System.out.printf("R$%.2f após render na poupança por um mês: R$%.2f\n", dinheiroDepositado,
                valorComRendimento);
    }
}
