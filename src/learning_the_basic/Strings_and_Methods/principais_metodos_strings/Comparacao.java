package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class Comparacao {
    public static void main(String[] args) {
        String senha = "Seguranca123";
        String tentativa = "seguranca123";

        // Comparação exata (case-sensitive)
        if (senha.equals(tentativa)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }

        // Comparação ignorando maiúsculas/minúsculas
        if (senha.equalsIgnoreCase(tentativa)) {
            System.out.println("Senha quase correta - verifique as maiúsculas!");
        }
    }
}
