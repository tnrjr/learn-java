package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class Espacos {
    public static void main(String[] args) {
        String texto = "   Java é ótimo!   ";

        System.out.println("Original: [" + texto + "]");

        // Remove espaços no início e no final
        String trimado = texto.trim();
        System.out.println("Trimado: [" + trimado + "]");
    }
}
