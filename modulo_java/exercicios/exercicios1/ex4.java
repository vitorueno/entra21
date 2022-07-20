package exercicios.exercicios1;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês; */

public class ex4 {
    public static void main(String[] args) {
        System.out.println("Calcular salário de vendedor:\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        String nome = leitor.nextLine();
        System.out.print("Digite o salário fixo do vendedor: ");
        float salario = leitor.nextFloat();
        System.out.print("Informe o total vendido pelo vendedor neste mês: ");
        float totalVenda = leitor.nextFloat();
        leitor.close();

        float comissao = 15; // 15% de comissao
        float multiplicadorSalario = 1 + comissao / 100; // adicional do salário
        float salarioFinal = salario + multiplicadorSalario * totalVenda;

        LimpaTela();

        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário fixo: R$%.2f\n", salario);
        System.out.printf("Total de vendas: R$%.2f\n", totalVenda);
        System.out.println("Comissão: " + comissao + "%");
        System.out.printf("Salário final: R$%.2f\n", salarioFinal);
    }

    public static void LimpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
