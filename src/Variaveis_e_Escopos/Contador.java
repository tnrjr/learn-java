package Variaveis_e_Escopos;

//C. Variáveis de Classe (estáticas)
//Declaradas com o modificador static.
//
//Pertencem à classe, não a uma instância específica.
//
//Existe apenas uma cópia, compartilhada entre todas as instâncias.

public class Contador {

    static int total = 0;

    public Contador(){
        total++;
    }
}
