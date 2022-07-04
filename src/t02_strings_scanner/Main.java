package t02_strings_scanner;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        String s1 = "Duke";
        String s2 = "You are " + s1;
        String s3;
        s3 = "You are Duke";
        
        System.out.println("Welcome: " + s2);                   // Concatena com literais usando o símbolo +
        System.out.println("Tamanho: " + s2.length());          // Retrona o tamanho da string
        System.out.println("Sub: " + s2.substring(0, 5));       // Retorna uma substring a partir do 0 até o 4
        System.out.println("Upper: " + s2.toUpperCase());       // Retorna uma string com uppercase
        
        System.out.println(s2 == s3);                           // Símbolo == faz a comparação de referência (local memória)
        System.out.println(s2.equals(s3));                      // Para comparar conteúdo de strings usa-se o método EQUALS
        System.out.println(s2.compareTo("You are Duke"));       // Método compareTo retorna 0 quando o conteúdo é igual
        
        
        // Scanner é uma classe para manipulação de dados no console java.util.Scanner
        Scanner in  = new Scanner(System.in);
        String a1   = in.next();                      // .next lê uma palavra apenas
        String a2   = in.nextLine();                  // .nextLine lê uma frase
        int a3      = in.nextInt();                   // .nextInt lê um número inteiro int
        double a4   = in.nextDouble();                // .nextDouble lê um número de ponto flutuante double
        
        in.close();                                   // Fechando o scanner, é boa prática
    }

}
