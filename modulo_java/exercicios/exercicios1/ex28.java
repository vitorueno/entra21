package exercicios.exercicios1;

import java.util.Scanner;
// import java.util.Arrays;

/* Escreva um algoritmo para uma empresa que decide dar um reajuste a seus
584 funcionários de acordo com os seguintes critérios: 

a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.

Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
Calcule o seu novo salário reajustado. 
Escrever o nome do funcionário, o reajuste e seu novo salário. 
Calcule quanto à empresa vai aumentar sua folha de pagamento;
*/

public class ex28 {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calcular reajuste salarial:\n");

        // int qntdFuncionarios = 584;
        int qntdFuncionarios = 1;

        System.out.print("Digite o valor do salário mínimo: ");
        float salarioMinimo = leitor.nextFloat();

        System.out.println(salarioMinimo);
        // float[] r = reajustaSalarioFuncionarios(qntdFuncionarios, salarioMinimo);

        // exibeAumentoSalarial(r[0], r[1]);
    }

    public static float realizarAcrescimo(float num, float pct_acresimo) {
        return num * (1 + (pct_acresimo / 100));
    }

    public static float calculaNovoSalario(float salario, float valSalarioMinimo) {
        float qntdSalariosMinimos = salario / valSalarioMinimo;
        float pct_acresimo;

        if (qntdSalariosMinimos < 3)
            pct_acresimo = 50;
        else if (qntdSalariosMinimos <= 10)
            pct_acresimo = 20;
        else if (qntdSalariosMinimos <= 20)
            pct_acresimo = 15;
        else
            pct_acresimo = 10;

        float novoSalario = realizarAcrescimo(salario, pct_acresimo);
        return novoSalario;
    }

    public static void exibeFuncionarioAtualizado(String nome, float novoSalario) {
        System.out.println("\nFuncionário: " + nome);
        System.out.printf("Novo salário: R$%.2f\n", novoSalario);
    }

    public static void exibeAumentoSalarial(float totalAntigaFolha, float totalNovaFolha) {
        System.out.printf("\nNo total, a empresa aumentará o salário dos funcionários em R$%.2f\n",
                (totalNovaFolha - totalAntigaFolha));
    }

    public static float[] reajustaSalarioFuncionarios(int qntdFuncionarios, float salarioMinimo) {
        float totalFolhaAtual = 0;
        float totalNovaFolha = 0;
        for (int i = 1; i <= qntdFuncionarios; i++) {
            System.out.print("\nDigite o nome do funcionário " + i + ": ");
            String nome = leitor.next();

            System.out.print("Digite o salário do funcionário: ");
            float salario = leitor.nextFloat();

            float novoSalario = calculaNovoSalario(salario, salarioMinimo);
            exibeFuncionarioAtualizado(nome, novoSalario);

            totalFolhaAtual += salario;
            totalNovaFolha += novoSalario;
        }

        return new float[] { totalFolhaAtual, totalNovaFolha };
    }

}
