package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class Concatenacao {
    public static void main(String[] args) {
        String parte1 = "Java";
        String parte2 = " é incrível";

        // Método 1: usando o operador +
        String resultado1 = parte1 + parte2;
        System.out.println(resultado1);

        // Método 2: usando o método concat()
        String resultado2 = parte1.concat(parte2);
        System.out.println(resultado2);
    }
}
