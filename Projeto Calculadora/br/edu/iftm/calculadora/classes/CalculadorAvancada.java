package br.edu.iftm.calculadora.classes;

public class CalculadorAvancada extends Calculadora {
    
    @Override
    public double somar(double valorA, double valorB){
        double resultado= valorA+valorB;
        return resultado;
    }
    
    @Override
    public double subtrair(double valorA, double valorB){
        double resultado= valorA-valorB;
        return resultado;
    }

    @Override
    public double dividir(double valorA, double valorB){
        //Não  usado
        double resultado=1;
        return resultado;
    }

    @Override
    public double multiplicar(double valorA, double valorB){
        double resultado= valorA*valorB;
        return resultado;
    }

    public double fatorial(double valorA) {
        double resultado=valorA;
        while (valorA > 1){ 
            resultado = resultado*(valorA-1);
            valorA--;
        }
        return resultado;
    }
}
