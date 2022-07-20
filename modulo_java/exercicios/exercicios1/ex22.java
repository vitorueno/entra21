package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. 
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
Informe o valor de custo de cada produto, o valor de venda de cada produto, 
a média de preço de custo e do preço de venda; */

public class ex22 {
    public static void main(String[] args) {
        System.out.println("Comparar preço de custo e de venda: \n");

        // int qntdProdutos = 40;
        int qntdProdutos = 4;
        float precoCusto;
        float precoVenda;
        float diferenca;
        float somaPrecoCusto = 0;
        float somaPrecoVenda = 0;

        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= qntdProdutos; i++) {

            System.out.print("Digite o preço de custo do produto " + i + ": ");
            precoCusto = leitor.nextFloat();
            somaPrecoCusto += precoCusto;
            System.out.print("Digite o preço de venda do produto " + i + ": ");
            precoVenda = leitor.nextFloat();
            somaPrecoVenda += precoVenda;

            diferenca = precoVenda - precoCusto;

            System.out.printf("\nPreço de custo do produto %d: R$%.2f \n", i, precoCusto);
            System.out.printf("Preço de venda do produto %d: R$%.2f \n", i, precoVenda);
            if (diferenca > 0) {
                System.out.println("Lucro!\n");
            } else if (diferenca < 0) {
                System.out.println("Prejuízo\n");
            } else {
                System.out.println("Empate\n");
            }
        }
        leitor.close();

        float mediaPrecoCusto = somaPrecoCusto / qntdProdutos;
        float mediaPrecoVenda = somaPrecoVenda / qntdProdutos;
        System.out.printf("\nMédia do preço de custo: R$%.2f\n", mediaPrecoCusto);
        System.out.printf("Média do preço de venda: R$%.2f\n", mediaPrecoVenda);

    }
}
