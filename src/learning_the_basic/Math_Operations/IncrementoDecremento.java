package learning_the_basic.Math_Operations;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int x = 5;

        // Pós-incremento (usa o valor e depois incrementa)
        System.out.println("x++: " + x++); // Imprime 5, depois x vira 6
        System.out.println("x após incremento: " + x);

        // Pré-incremento (incrementa e depois usa o valor)
        System.out.println("++x: " + ++x); // x vira 7 e imprime 7

        // Pós-decremento
        System.out.println("x--: " + x--); // Imprime 7, depois x vira 6
        System.out.println("x após decremento: " + x);

        // Pré-decremento
        System.out.println("--x: " + --x); // x vira 5 e imprime 5
    }
}
