package exercicios.exercicios1;

import java.util.Scanner;

/* Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais; */

public class ex21 {
    public static void main(String[] args) {
        System.out.println("Verificar quem está apto a servir: \n");

        int total = 0;
        int totalServir = 0;
        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.print("\nDigite o nome da pessoa: ");
            String nome = leitor.next();

            int sexo;
            while (true) {
                System.out.print("Qual o sexo da pessoa? [1-masculino; 2-feminino]: ");
                sexo = leitor.nextInt();
                if (sexo == 1 || sexo == 2)
                    break;
            }

            System.out.print("Digite a idade da pessoa: ");
            int idade = leitor.nextInt();

            int saude;
            while (true) {
                System.out.print("A pessoa é saudável? [1-sim; 2-não]: ");
                saude = leitor.nextInt();
                if (saude == 1 || saude == 2)
                    break;
            }

            if (idade == 18 && sexo == 1 && saude == 1) {
                System.out.println(nome + " está apto a servir!\n");
                totalServir++;
            } else {
                System.out.println(nome + " não está apto(a) a servir!\n");
            }

            total++;

            int continuar;
            while (true) {
                System.out.print("Deseja inserir outra Pessoa? [1-sim; 2-não]: ");
                continuar = leitor.nextInt();
                if (continuar == 1 || continuar == 2)
                    break;
            }

            if (continuar == 2)
                break;
        }
        leitor.close();

        System.out.println("\nTotal de pessoas cadastradas: " + total);
        System.out.println("Total de pessoas aptas a servir: " + totalServir);
    }
}
