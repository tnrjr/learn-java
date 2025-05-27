package learning_the_basic.tipos_dados_e_variaveis;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // Números inteiros
        byte idadeByte = 25;
        short idadeShort = 32000;
        int idadeInt = 100000;
        long idadeLong = 10000000000L;

        // Números decimais
        float altura = 1.75f;
        double peso = 70.5;


        // Caracteres
        char Letra = 'A';

        // Booleanos
        boolean ativo = true;

        // Exibindo valores no console
        System.out.println("byte: " + idadeByte);
        System.out.println("short: " + idadeShort);
        System.out.println("int: " + idadeInt);
        System.out.println("long: " + idadeLong);
        System.out.println("float: " + altura);
        System.out.println("double: " + peso);
        System.out.println("char: " + Letra);
        System.out.println("boolean: " + ativo);
    }
}
