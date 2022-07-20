package exercicios.exercicios1;

import java.util.Scanner;

/* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral; */

public class ex20 {
    public static void main(String[] args) {
        System.out.println("Desconto na venda de Carros: \n");

        int totalCarros = 0;
        int totalAntigos = 0;
        int anoCarro = 0;
        float valorCarro = 0.0f;
        float pct_desconto = 0.0f;
        float precoFinal = 0.0f;
        float valorDesconto = 0.0f;

        Scanner leitor = new Scanner(System.in);
        char opcao = ' ';
        while (true) {
            System.out.print("Digite o valor do carro: ");
            valorCarro = leitor.nextFloat();
            System.out.print("Digite o ano do carro: ");
            anoCarro = leitor.nextInt();

            if (anoCarro <= 2000) {
                pct_desconto = 12;
                totalAntigos++;
            } else
                pct_desconto = 7;

            totalCarros++;

            valorDesconto = valorCarro * pct_desconto / 100;
            precoFinal = valorCarro - valorDesconto;

            System.out.printf("Valor do desconto: R$%.2f\n", valorDesconto);
            System.out.printf("Preço do carro após desconto: R$%.2f\n\n", precoFinal);

            System.out.print("Deseja inserir outro carro? [s/n]: ");
            opcao = leitor.next().charAt(0);

            if ((opcao == 'N') || (opcao == 'n'))
                break;
        }

        leitor.close();

        System.out.println("\nTotal de carros: " + totalCarros);
        System.out.println("Total de carros antigos: " + totalAntigos);
    }
}
