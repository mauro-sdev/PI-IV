package org.example;

public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /*Função de dividir com exceção a divisão por 0*/
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Erro: divisão por zero.");
        }
        return a / b;
    }
}
