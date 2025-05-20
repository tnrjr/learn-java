package Fundicao_de_Tipos;

public class FundicaoTipos {
    public static void main(String[] args) {
        // Casting implícito
        int a = 10;
        double b = a;  // int -> double (OK)
        System.out.println("b = " + b);

        // Casting explícito
        double x = 10.75;
        int y = (int) x;  // double -> int (precisa de cast)
        System.out.println("y = " + y);  // saída: 10
    }
}
