public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Métodos (Funções)
        int resultado = somar(5, 3);
        System.out.println("Resultado: " + resultado);

        // Variáveis
        int idade = 17;
        double altura = 1.82;
        char inicial = 'J';
        boolean ativo = true;
        String nome = "Juninho";

        // Condicional
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Laços de repetição (for)
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // while
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do-while
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    public static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}
