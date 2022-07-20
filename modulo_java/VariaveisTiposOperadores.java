class VariaveisTiposOperadores {
    public static void main(String[] args) {

        // tipos primitivos
        int idade = 20;
        float cotacaoDolar = 5.02f;
        double pi = 3.14159265359d;
        char sexo = 'M';
        byte placar = 1;
        boolean estaCadastrado = false;

        System.out.println("int: " + idade);
        System.out.println("float: " + cotacaoDolar);
        System.out.println("double: " + pi);
        System.out.println("char: " + sexo);
        System.out.println("byte: " + placar);
        System.out.println("boolean: " + estaCadastrado);

        // exemplo de tipo não primitivos
        String frase = "oi, como vai você?";
        System.out.println("String: " + frase);

        // operadores
        int soma = 1 + 3;
        int subtracao = 4 - 2;
        int multiplicacao = 4 * 5;
        double divisao = 1 / 2.0f;

        System.out.println("1 + 3: " + soma);
        System.out.println("4 - 2: " + subtracao);
        System.out.println("4 * 5: " + multiplicacao);
        System.out.println("1 / 2: " + divisao);

    }
}