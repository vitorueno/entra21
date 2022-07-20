package exercicios.exercicios1;

import java.util.Scanner;

/* Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com ousuário; */

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Conversão de dólar para para real\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor em dólar: ");
        float dolar = leitor.nextFloat();
        System.out.print("Digite a cotação do dólar: ");
        float cotacaoDolar = leitor.nextFloat();
        leitor.close();

        float reais = dolar * cotacaoDolar;

        System.out.printf("$%.2f (USD) equivale a R$%.2f (BRL)\n", dolar, reais);
    }
}
