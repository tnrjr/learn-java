package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class ExtrairSubstring {
    public static void main(String[] args) {
        String texto = "Programação Java";

        // Extrai a partir do índice 13 até o final
        String linguagem = texto.substring(13);
        System.out.println("Linguagem: " + linguagem);

        // Extrai do índice 0 (inclusive) até 11 (exclusive)
        String assunto = texto.substring(0, 11);
        System.out.println("Assunto: " + assunto);
    }
}