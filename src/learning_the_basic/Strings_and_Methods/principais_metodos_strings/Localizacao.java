package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class Localizacao {
    public static void main(String[] args) {
        String texto = "Aprenda Java hoje mesmo!";

        // Encontra a primeira ocorrência de 'a'
        int posicao = texto.indexOf('a');
        System.out.println("Primeiro 'a' na posição: " + posicao);

        // Encontra a última ocorrência de 'a'
        int ultimaPosicao = texto.lastIndexOf('a');
        System.out.println("Último 'a' na posição: " + ultimaPosicao);

        // Procurando por uma substring
        int posJava = texto.indexOf("Java");
        System.out.println("'Java' começa na posição: " + posJava);
    }
}
