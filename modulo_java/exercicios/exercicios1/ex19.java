package exercicios.exercicios1;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres; */

public class ex19 {
    public static void main(String[] args) {
        System.out.println("Verificar se é homem ou mulher: \n");

        // int qntdPessoas = 56;
        int qntdPessoas = 5;
        int qntdHomem = 0;
        int qntdMulher = 0;

        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= qntdPessoas; i++) {
            System.out.print(i + " - informe o nome da pessoa: ");
            String nome = leitor.next();
            int sexo = 0;
            while (sexo < 1 || sexo > 3) {
                System.out.print("Informe o sexo da pessoa (1- homem; 2- mulher; 3-outro): ");
                sexo = leitor.nextInt();
            }
            String denSexo;
            switch (sexo) {
                case 1:
                    denSexo = "homem";
                    qntdHomem++;
                    break;
                case 2:
                    denSexo = "mulher";
                    qntdMulher++;
                    break;
                default:
                    denSexo = "outro";
                    break;
            }

            System.out.println(nome + " - sexo: " + denSexo + "\n");
        }
        leitor.close();

        System.out.println("Total de homens: " + qntdHomem);
        System.out.println("Total de mulheres: " + qntdMulher);
        System.out.println("Outros: " + (qntdPessoas - qntdHomem - qntdMulher));
    }
}
