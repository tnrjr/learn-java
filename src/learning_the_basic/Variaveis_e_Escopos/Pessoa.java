package learning_the_basic.Variaveis_e_Escopos;

//    B. Variáveis de Instância (atributos de objeto)
//    Declaradas fora dos métodos, mas dentro da classe.
//
//    Acessíveis por todos os métodos da classe (não estáticos).
//
//    Cada instância da classe tem sua própria cópia.


public class Pessoa {
    String nome; // variável de instância

    public void dizerNome() {
        System.out.println(nome);
    }
}

