package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class ConversaoCase {
    public static void main(String[] args) {
        String texto = "Java é Sensacional";

        // Convertendo para maiúsculas
        String maiusculas = texto.toUpperCase();
        System.out.println("Maiúsculas: " + maiusculas);

        // Convertendo para minúsculas
        String minusculas = texto.toLowerCase();
        System.out.println("Minúsculas: " + minusculas);
    }
}