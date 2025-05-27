package learning_the_basic.Arrays;

public class MediaArray {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};
        double soma = 0;

        // Calculando a soma
        for (double nota : notas) {
            soma += nota;
        }

        // Calculando a média
        double media = soma / notas.length;

        System.out.printf("Média das notas: %.2f\n", media);

        // Encontrando a maior nota
        double maior = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        System.out.println("Maior nota: " + maior);
    }
}
