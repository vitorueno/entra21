package exercicios.exercicios1;

import java.util.Scanner;

/* Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto; */

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Consumo médio de combustível:\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a distância percorrida pelo automóvel em quilômetros: ");
        float distancia = leitor.nextFloat();
        System.out.print("Digite o gasto de combustível da viagem em litros: ");
        float gastoCombustivel = leitor.nextFloat();
        leitor.close();

        float mediaConsumo = distancia / gastoCombustivel;
        System.out.printf("O consumo médio do automóvel foi de %.2f KM/L\n", mediaConsumo);
    }
}
