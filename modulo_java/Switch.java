public class Switch {
    public static void main(String[] args) {
        int codigoProduto = 4;
        // int codigoProduto = 9;

        switch (codigoProduto) {
            case 1:
                System.out.println("refrigerante");
                break;

            case 2:
                System.out.println("batata chips");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("bolacha");
                break;

            default:
                System.err.println("código inválido");
                break;
        }
    }
}
