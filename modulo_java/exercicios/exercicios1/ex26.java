package exercicios.exercicios1;

import java.util.Scanner;

/* Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido; */

public class ex26 {
    public static void main(String[] args) {
        System.out.println("Digitar números por extenso\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 5: ");
        int num = leitor.nextInt();
        leitor.close();

        String numPorExtenso;

        switch (num) {
            case 1:
                numPorExtenso = "um";
                break;
            case 2:
                numPorExtenso = "dois";
                break;
            case 3:
                numPorExtenso = "três";
                break;
            case 4:
                numPorExtenso = "quatro";
                break;
            case 5:
                numPorExtenso = "cinco";
                break;

            default:
                numPorExtenso = "número inválido";
                break;
        }

        System.out.println(numPorExtenso);
    }
}
