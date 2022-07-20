public class If {
    public static void main(String[] args) {
        // > maior que
        // >= maior ou igual que
        // < menor que
        // <= menor ou igual a
        // == igual
        // != diferente

        // && e lógico
        // || ou lógico
        // ! negação lógica

        double media = 6;

        if (media >= 7) {
            if (media == 10)
                System.out.println("Parabéns, você foi aprovado com média máxima!");
            else
                System.out.println("Você foi aprovado.");
        } else
            System.out.println("Você foi reprovado");
    }
}
