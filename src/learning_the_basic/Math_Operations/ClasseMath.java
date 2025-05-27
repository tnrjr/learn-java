package learning_the_basic.Math_Operations;

public class ClasseMath {
    public static void main(String[] args) {
        // Potenciação (x elevado a y)
        double potencia = Math.pow(2, 3); // 2³
        System.out.println("2 elevado a 3: " + potencia);

        // Raiz quadrada
        double raiz = Math.sqrt(25);
        System.out.println("Raiz quadrada de 25: " + raiz);

        // Arredondamentos
        double numero = 3.7;
        System.out.println("Arredondamento para cima de 3.7: " + Math.ceil(numero));
        System.out.println("Arredondamento para baixo de 3.7: " + Math.floor(numero));
        System.out.println("Arredondamento normal de 3.7: " + Math.round(numero));

        // Valor absoluto
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));

        // Número aleatório entre 0.0 e 1.0
        double aleatorio = Math.random();
        System.out.println("Número aleatório: " + aleatorio);

        // Número aleatório entre 1 e 100
        int aleatorioInteiro = (int)(Math.random() * 100) + 1;
        System.out.println("Número aleatório entre 1 e 100: " + aleatorioInteiro);
    }
}
