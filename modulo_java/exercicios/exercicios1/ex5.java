package exercicios.exercicios1;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No finalinformar o nome do aluno e a sua média (aritmética);*/

public class ex5 {
    public static void main(String[] args) {
        System.out.println("Média aritmética de três notas:\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Digite a terceira nota do aluno: ");
        float nota3 = leitor.nextFloat();
        leitor.close();

        float mediaAritmetica = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média das três notas: %.2f\n", mediaAritmetica);
    }
}
