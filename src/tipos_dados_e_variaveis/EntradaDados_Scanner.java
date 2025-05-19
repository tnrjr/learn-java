package tipos_dados_e_variaveis;

import java.util.Scanner;

public class EntradaDados_Scanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Olá, " + nome + ". Você tem " + idade + " anos." );

        entrada.close();
    }
}
