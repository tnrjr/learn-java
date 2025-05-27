package learning_the_basic.Strings_and_Methods;

public class ExemploString {
        public static void main(String[] args) {
            // Criando strings de duas formas diferentes
            String saudacao1 = "Olá, mundo!"; // Forma literal (mais comum)
            String saudacao2 = new String("Olá, mundo!"); // Usando construtor

            // Comparando strings (importante: não use == para comparar conteúdo)
            System.out.println("As strings são iguais? " + saudacao1.equals(saudacao2));
        }


}

