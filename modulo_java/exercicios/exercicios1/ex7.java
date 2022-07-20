package exercicios.exercicios1;

import java.util.Scanner;

/* Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius; */

public class ex7 {
    public static void main(String[] args) {
        System.out.println("Conversão de celsius para fahrenheit\n");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius: ");
        float tempCelsius = leitor.nextFloat();
        leitor.close();

        float tempFahrenheit = (9 * tempCelsius + 160) / 5;
        System.out.println(tempCelsius + "° em fahrenheit: " + tempFahrenheit + "F");
    }
}
