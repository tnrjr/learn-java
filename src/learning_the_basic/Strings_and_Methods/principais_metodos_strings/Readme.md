# Principais Métodos de String

Vamos explorar os métodos mais úteis com exemplos práticos:

### 1. Comprimento da String (length)
```bash
public class MetodosString {
public static void main(String[] args) {
String texto = "Java é poderoso";

        // length() retorna o número de caracteres na string
        int tamanho = texto.length();
        System.out.println("O texto tem " + tamanho + " caracteres.");
    }
}
```
### 2. Converter para Maiúsculas/Minúsculas (toUpperCase, toLowerCase)
```bash
public class ConversaoCase {
public static void main(String[] args) {
String texto = "Java é Sensacional";

        // Convertendo para maiúsculas
        String maiusculas = texto.toUpperCase();
        System.out.println("Maiúsculas: " + maiusculas);
        
        // Convertendo para minúsculas
        String minusculas = texto.toLowerCase();
        System.out.println("Minúsculas: " + minusculas);
    }
}
```
### 3. Concatenar Strings (concat ou +)
```bash
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
```
### 4. Extrair parte da String (substring)
```bash
public class ExtrairSubstring {
    public static void main(String[] args) {
        String texto = "Programação Java";
        
        // Extrai a partir do índice 13 até o final
        String linguagem = texto.substring(13);
        System.out.println("Linguagem: " + linguagem);
        
        // Extrai do índice 0 (inclusive) até 11 (exclusive)
        String assunto = texto.substring(0, 11);
        System.out.println("Assunto: " + assunto);
    }
}
```

### 5. Localizar caracteres ou substrings (indexOf, lastIndexOf)
```bash
public class Localizacao {
    public static void main(String[] args) {
        String texto = "Aprenda Java hoje mesmo!";
        
        // Encontra a primeira ocorrência de 'a'
        int posicao = texto.indexOf('a');
        System.out.println("Primeiro 'a' na posição: " + posicao);
        
        // Encontra a última ocorrência de 'a'
        int ultimaPosicao = texto.lastIndexOf('a');
        System.out.println("Último 'a' na posição: " + ultimaPosicao);
        
        // Procurando por uma substring
        int posJava = texto.indexOf("Java");
        System.out.println("'Java' começa na posição: " + posJava);
    }
}
```

### 6. Substituir caracteres ou substrings (replace)
```bash
public class Substituicao {
    public static void main(String[] args) {
        String texto = "C++ é legal, mas Java é melhor!";
        
        // Substitui todas as ocorrências de "C++" por "Python"
        String novoTexto = texto.replace("C++", "Python");
        System.out.println(novoTexto);
        
        // Substitui caracteres individuais
        String semEspacos = texto.replace(' ', '_');
        System.out.println(semEspacos);
    }
}
```

### 7. Remover espaços em branco (trim)
```bash
public class Espacos {
    public static void main(String[] args) {
        String texto = "   Java é ótimo!   ";
        
        System.out.println("Original: [" + texto + "]");
        
        // Remove espaços no início e no final
        String trimado = texto.trim();
        System.out.println("Trimado: [" + trimado + "]");
    }
}
```

### 8. Dividir strings (split)
```bash
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
```

### 9. Comparação de Strings (equals, equalsIgnoreCase)
```bash
public class Comparacao {
    public static void main(String[] args) {
        String senha = "Seguranca123";
        String tentativa = "seguranca123";
        
        // Comparação exata (case-sensitive)
        if (senha.equals(tentativa)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
        
        // Comparação ignorando maiúsculas/minúsculas
        if (senha.equalsIgnoreCase(tentativa)) {
            System.out.println("Senha quase correta - verifique as maiúsculas!");
        }
    }
}
```