package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário; */

public class ex11 {
    public static void main(String[] args) {
        System.out.println("Calcular preço de venda de um produto: \n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o preço de custo do produto: ");
        float precoCusto = leitor.nextFloat();
        System.out.print("Informe o percentual de acréscimo do produto: ");
        float pctAcrescimo = leitor.nextFloat();
        leitor.close();

        float precoVenda = precoCusto * (1 + (pctAcrescimo / 100));

        System.out.printf("\nPreço de custo R$%.2f\n", precoCusto);
        System.out.println("Percentual de acréscimo: " + pctAcrescimo + "%");
        System.out.printf("Preço de venda R$%.2f\n", precoVenda);
    }
}
