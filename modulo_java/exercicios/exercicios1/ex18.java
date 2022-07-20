package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade; */

public class ex18 {
    public static void main(String[] args) {
        System.out.println("Verificar se é maior ou menor de idade: \n");

        int qntdPessoas = 75;
        // int qntdPessoas = 5;

        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= qntdPessoas; i++) {
            System.out.print(i + " - Digite a sua idade: ");
            int idade = leitor.nextInt();

            if (idade >= 18)
                System.out.println("maior de idade");
            else
                System.out.println("menor de idade");
        }
        leitor.close();
    }
}
