package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class Substituicao {
    public static void main(String[] args) {
        String texto = "C++ é legal, mas Java é melhor!";

        // Substitui todas as ocorrências de "C++" por "Python"
        String novoTexto = texto.replace("C++", "Python");
        System.out.println(novoTexto);

        // Substitui caracteres individuais
        String semEspacos = texto.replace(' ', '_');
        System.out.println(semEspacos);
    }
}
