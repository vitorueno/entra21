package exercicios.exercicios1;

import java.util.Scanner;

/* A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações; */

public class ex10 {
    public static void main(String[] args) {
        System.out.println("Calcular valor de prestações: \n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        float valorCompra = leitor.nextFloat();
        leitor.close();

        int qntdPrestacao = 5;
        float valorPrestacao = valorCompra / qntdPrestacao;
        System.out.printf("A compra de R$%.2f resultará em %d prestações de R$%.2f\n", valorCompra, qntdPrestacao,
                valorPrestacao);
    }
}
