package Variaveis_e_Escopos;

public class ExemploEscopo {

    static int variavelClasse = 100; // variável de classe
    int variavelInstancia = 50;      // variável de instância

    public void metodo() {
        int variavelLocal = 10;      // variável local
        System.out.println(variavelLocal);
        System.out.println(variavelInstancia);
        System.out.println(variavelClasse);
    }

    public static void main(String[] args) {
        ExemploEscopo exemplo = new ExemploEscopo();
        exemplo.metodo();
    }
}

