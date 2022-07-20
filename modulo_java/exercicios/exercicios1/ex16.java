package exercicios.exercicios1;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9); */

public class ex16 {
    public static void main(String[] args) {
        System.out.println("Verificar estado do aluno baseado em média: \n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.print("Informe a nota 1 do aluno: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Informe a nota 2 do aluno: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Informe a nota 2 do aluno: ");
        float nota3 = leitor.nextFloat();
        leitor.close();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7)
            System.out.println(nome + " foi aprovado com média " + media);
        else if (media >= 5.1f)
            System.out.println(nome + " está de recuperação com média " + media);
        else
            System.out.println(nome + " está reprovado com média " + media);

    }
}
