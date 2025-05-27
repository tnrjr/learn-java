package learning_the_basic.Strings_and_Methods.principais_metodos_strings;

public class DivisaoString {
    public static void main(String[] args) {
        String lista = "maçã,banana,laranja,uva";

        // Divide a string em um array usando vírgula como delimitador
        String[] frutas = lista.split(",");

        System.out.println("Frutas na lista:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }
}