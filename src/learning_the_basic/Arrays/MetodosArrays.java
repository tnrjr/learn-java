package learning_the_basic.Arrays;

import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9};

        // Ordenação
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // Busca binária (array deve estar ordenado)
        int posicao = Arrays.binarySearch(numeros, 8);
        System.out.println("Número 8 encontrado na posição: " + posicao);

        // Preenchimento
        int[] vazado = new int[5];
        Arrays.fill(vazado, 10);
        System.out.println("Array preenchido: " + Arrays.toString(vazado));

        // Comparação de arrays
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("Arrays são iguais? " + Arrays.equals(a, b));

        // Cópia de array
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Cópia do array: " + Arrays.toString(copia));
    }
}