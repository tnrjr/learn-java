package learning_the_basic.Math_Operations;

public class OperacoesBasicas {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Adição
        int soma = a + b;
        System.out.println("Adição: " + a + " + " + b + " = " + soma);

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + a + " - " + b + " = " + subtracao);

        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + a + " * " + b + " = " + multiplicacao);

        // Divisão inteira (quando ambos são inteiros)
        int divisaoInteira = a / b;
        System.out.println("Divisão inteira: " + a + " / " + b + " = " + divisaoInteira);

        // Divisão real (precisa de pelo menos um número real)
        double divisaoReal = (double)a / b;
        System.out.println("Divisão real: " + a + " / " + b + " = " + divisaoReal);

        // Módulo (resto da divisão)
        int resto = a % b;
        System.out.println("Resto da divisão: " + a + " % " + b + " = " + resto);
    }
}