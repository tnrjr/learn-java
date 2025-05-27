package learning_the_basic.Arrays;

public class PercorrendoArray {
    public static void main(String[] args) {
        String[] cidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Salvador"};

        // Usando for tradicional
        System.out.println("Cidades (for tradicional):");
        for (int i = 0; i < cidades.length; i++) {
            System.out.println("- " + cidades[i]);
        }

        // Usando for-each (enhanced for)
        System.out.println("\nCidades (for-each):");
        for (String cidade : cidades) {
            System.out.println("- " + cidade);
        }
    }
}
