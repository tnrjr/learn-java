package learning_the_basic.Arrays;

public class ArrayBasico {
    public static void main(String[] args) {
        // Declaração de um array de inteiros
        int[] numeros;

        // Inicialização com tamanho 5
        numeros = new int[5];

        // Atribuindo valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando elementos
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Terceiro elemento: " + numeros[2]);
    }
}
