package learning_the_basic.basic_sintax;

public class BasicSintax {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Métodos (Funções)
        int resultado = somar(5, 3);
        System.out.println("Resultado da soma: " + resultado);

        // Variáveis
        int idade = 17;
        double altura = 1.82;
        char inicial = 'J';
        boolean ativo = true;
        String nome = "Juninho";

        // Imprimir variáveis
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ativo: " + ativo);

        // Condicional
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Laço for
        System.out.println("Laço for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Laço while
        System.out.println("Laço while:");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Laço do-while
        System.out.println("Laço do-while:");
        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}
