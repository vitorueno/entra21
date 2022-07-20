import java.util.Scanner;

public class ScannerTeste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite uma frase: ");
        String frase = leitor.nextLine();
        System.out.println(frase);

        System.out.print("digite um número inteiro: ");
        int numInt = leitor.nextInt();
        System.out.println(numInt);

        System.out.print("digite um número float: ");
        float numFloat = leitor.nextFloat();
        System.out.println(numFloat);
    }
}
