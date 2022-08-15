package br.edu.iftm.calculadora.classes;

public class CalculadoraCientifica extends CalculadoraBasica {
    @Override
    public double somar(double valorA, double valorB) {
        double resultado= valorA+valorB;
        return resultado;
    }

    @Override
    public double subtrair(double valorA, double valorB) {
        double resultado= valorA-valorB;
        return resultado;
    }

    @Override
    public double dividir(double valorA, double valorB) {
        double resultado= valorA/valorB;
        return resultado;
    }

    @Override
    public double multiplicar(double valorA, double valorB) {
        double resultado= valorA*valorB;
        return resultado;
    }
    
    @Override
    public double porcentagem(double valorA, double valorB) {
        double resultado=(valorA/100)*valorB;
        return resultado;
    }

    public double modulo(double valorA, double valorB) {
        double resultado= valorA%valorB;
        return resultado;
    }

    @Override
    public double potencia(double valorA, double valorB) {
        double resultado= Math.pow(valorA, valorB);
        return resultado;
    }
}
