/*
Questão 6 - Crie uma exceção chamada NumeroNegativoException que herda de
Exception. Escreva um programa que solicite ao usuário inserir um número e, se o
número for negativo, lance a NumeroNegativoException usando throw e
capture-a para exibir uma mensagem amigável ao usuário.
*/

public class NumeroNegativoException extends Exception {
    public NumeroNegativoException() {
        super("Não é possível receber números negativos.");
    }
}