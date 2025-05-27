package learning_the_basic.Strings_and_Methods.boas_praticas;

// Boas Práticas com Strings em Java
//1 Imutabilidade: Strings em Java são imutáveis. Qualquer operação que "modifica" uma string na verdade cria uma nova string.
//
//2 Comparação: Sempre use equals() em vez de == para comparar conteúdo de strings.
//
//3 StringBuilder: Para muitas concatenações, use StringBuilder para melhor desempenho.
//
//4 Verificação nula: Sempre verifique se a string é null antes de chamar métodos.

public class BoasPraticas {
    public static void main(String[] args) {
        String texto = null;

        // Verificação segura
        if (texto != null && !texto.isEmpty()) {
            System.out.println(texto.toUpperCase());
        } else {
            System.out.println("String é nula ou vazia");
        }

        // Exemplo com StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
