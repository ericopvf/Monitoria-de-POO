/*
Questão 5 - Implemente um programa que peça ao usuário dois números inteiros e
calcule a divisão entre eles. Considere os seguintes cenários:
1. Se algum valor não for numérico, trate a exceção
(InputMismatchException) e imprima a mensagem “Os valores informados
devem ser inteiros”.
2. Caso o divisor seja zero, trate a exceção (ArithmeticException) e imprima a
mensagem “O divisor não pode ser zero”.
3. Adicione um bloco finally para imprimir a mensagem “FIM!” após qualquer
execução, seja ela bem-sucedida ou não.
*/

/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número 1:");
        int n1 = s.nextInt();
        s.nextLine();
        System.out.println("Digite o número 2: (número 1 será dividido pelo número 2)");
        int n2 = s.nextInt();
        try {
            int divisao = n1 / n2;
            System.out.printf("%nA divisão de %d por %d é: %d.%n", n1, n2, divisao);
        } catch (InputMismatchException e) {
            System.out.println("Os valores informados devem ser inteiros.");
        }
        catch (ArithmeticException e1) {
            System.out.println("O divisor não pode ser zero.");
        }
        finally {
            System.out.println("FIM!");
        }
        s.close();
    }
}
*/

/*
Questão 6 - Crie uma exceção chamada NumeroNegativoException que herda de
Exception. Escreva um programa que solicite ao usuário inserir um número e, se o
número for negativo, lance a NumeroNegativoException usando throw e
capture-a para exibir uma mensagem amigável ao usuário.
*/

/* 
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int a = s.nextInt();
        try {
            if (a < 0) {
            s.close();
            throw new NumeroNegativoException();
        }
    } 
    catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/

/*
Questão 7 - Crie um programa que receba n números e some esses números
enquanto a soma não for superior a 100. O programa deverá imprimir o valor
somado (antes de atingir o número maior que 100) e deverá informar quantos
números foram somados e qual a média. Refaça seu programa utilizando as
seguintes regras:
1. Utilize os tratamentos de exceção para lidar com a entrada de dados.
2. Se a soma ultrapassar 100, lance uma exceção personalizada chamada
ExcecaoAcimaDeCem usando a palavra-chave throw.
*/


import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        s.close();
    }
}

