package learning_the_basic.Math_Operations;

public class ConversaoAutomatica {
    public static void main(String[] args) {
        // int + double resulta em double
        int inteiro = 5;
        double real = 2.5;
        double resultado = inteiro + real;
        System.out.println("int + double = double: " + resultado);

        // byte + short resulta em int
        byte b = 10;
        short s = 20;
        int soma = b + s; // Promovido para int
        System.out.println("byte + short = int: " + soma);

        // Cuidado com divisão inteira
        System.out.println("Divisão 5/2: " + 5/2); // 2 (divisão inteira)
        System.out.println("Divisão 5.0/2: " + 5.0/2); // 2.5 (divisão real)
    }
}
