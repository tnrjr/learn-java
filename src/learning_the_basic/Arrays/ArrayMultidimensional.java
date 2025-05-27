package learning_the_basic.Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        // Matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Acessando elementos
        System.out.println("Elemento [1][2]: " + matriz[1][2]); // 6

        // Percorrendo a matriz
        System.out.println("\nMatriz completa:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
