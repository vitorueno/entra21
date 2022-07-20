package exercicios.exercicios1;

import java.util.Scanner;

/* O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo; */

public class ex12 {
    public static void main(String[] args) {
        System.out.println("Calcular preço final de um carro:\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o preço de fábrica do carro: ");
        float precoFabricaCarro = leitor.nextFloat();
        leitor.close();

        float pctDistribuidor = 28;
        float pctImposto = 45;

        float precoComImposto = precoFabricaCarro * (1 + (pctImposto / 100));
        float precoFinalCarro = precoComImposto * (1 + (pctDistribuidor / 100));
        System.out.printf("Preço inicial: R$%.2f\n", precoFabricaCarro);
        System.out.printf("Preço após aplicar impostos: R$%.2f\n", precoComImposto);
        System.out.printf("Preço final do carro: R$%.2f\n", precoFinalCarro);
    }
}
