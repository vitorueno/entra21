package exercicios.exercicios1;

import java.util.Scanner;

/* A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
clientes; */

public class ex27 {
    public static void main(String[] args) {
        System.out.println("Calcular desconto de veículo (de novo):\n");

        Scanner leitor = new Scanner(System.in);
        float valorVeiculo = -1;
        float totalDesconto = 0;
        float totalPago = 0;
        while (true) {
            System.out.print("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();
            if (valorVeiculo == 0)
                break;

            int tipoCombustivel;
            while (true) {
                System.out.print("Digite o tipo de combustível do carro: [1-álcool; 2-gasolina; 3-diesel]: ");
                tipoCombustivel = leitor.nextInt();

                if (tipoCombustivel >= 1 && tipoCombustivel <= 3)
                    break;
            }

            float pctDesconto;
            switch (tipoCombustivel) {
                case 1:
                    pctDesconto = 25;
                    break;
                case 2:
                    pctDesconto = 21;
                    break;
                case 3:
                    pctDesconto = 14;
                    break;
                default:
                    pctDesconto = 0;
                    break;
            }

            float precoFinal = valorVeiculo * (1 - (pctDesconto / 100));

            System.out.println("\nValor do desconto: " + pctDesconto + "%");
            System.out.printf("Valor do carro com desconto: R$%.2f\n\n", precoFinal);

            totalDesconto += valorVeiculo - precoFinal;
            totalPago += precoFinal;
        }
        leitor.close();
        System.out.printf("\nTotal de desconto do cliente: R$%.2f\n", totalDesconto);
        System.out.printf("Total gasto pelo cliente: R$%.2f\n", totalPago);
    }
}
