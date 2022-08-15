package br.edu.iftm.calculadora.classes;

import javax.swing.JOptionPane;

public class regraNegocio {

    CalculadoraCientifica calculadoraCient = new CalculadoraCientifica();
    CalculadorAvancada calculadoraAvanc = new CalculadorAvancada();

    public void somar(double valorA, double valorB){
        double resultado = calculadoraCient.somar(valorA, valorB);
        System.out.println(resultado);
    }
    public void subtrair(double valorA, double valorB){
        double resultado = calculadoraCient.subtrair(valorA, valorB);
        System.out.println(resultado);
    }
    public void dividir(double valorA,double valorB){
        double resultado = calculadoraCient.dividir(valorA, valorB);
        System.out.println(resultado);
    }
    public void multiplicar(double valorA, double valorB) {
        double resultado = calculadoraCient.multiplicar(valorA, valorB);
        System.out.println(resultado);
    }
    public void porcentagem(double valorA, double valorB) {
        double resultado= calculadoraCient.porcentagem(valorA, valorB);
        System.out.println(resultado);
    }
    public void potencia(double valorA, double valorB) {
        double resultado= calculadoraCient.potencia(valorA, valorB);
        System.out.println(resultado);
    }
    public void modulo(double valorA,double valorB) {
        double resultado= calculadoraCient.modulo(valorA, valorB);
        System.out.println(resultado);
    }
    public void fatorial(double valorA) {
        double resultado= calculadoraAvanc.fatorial(valorA);
        System.out.println(resultado);
    }
    public void somaAvancada(double valorA, double valorB) {
        String numeroVar = JOptionPane.showInputDialog(null, "Digite o número de variáveis restantes");
        int n = Integer.parseInt(numeroVar);
        double resultado= calculadoraAvanc.somar(valorA, valorB);
        for (int i=3;i<=2+n;i++) {
            String numeroA = JOptionPane.showInputDialog(null, "Digite o "+i+"º valor");
            double valorx = Integer.parseInt(numeroA);
            resultado=resultado+valorx;
        }
        System.out.println(resultado);
    }
    public void subtracaoAvancada(double valorA, double valorB) {
        String numeroVar = JOptionPane.showInputDialog(null, "Digite o número de variáveis restantes");
        int n = Integer.parseInt(numeroVar);
        double resultado= calculadoraAvanc.subtrair(valorA, valorB);
        for (int i=3;i<=2+n;i++) {
            String numeroA = JOptionPane.showInputDialog(null, "Digite o "+i+"º valor");
            double valorx = Integer.parseInt(numeroA);
            resultado=resultado-valorx;
        }
        System.out.println(resultado);
    }
    public void multiplicacaoAvancada(double valorA, double valorB) {
        String numeroVar = JOptionPane.showInputDialog(null, "Digite o número de variáveis restantes");
        int n = Integer.parseInt(numeroVar);
        double resultado= calculadoraAvanc.multiplicar(valorA, valorB);
        for (int i=3;i<=2+n;i++) {
            String numeroA = JOptionPane.showInputDialog(null, "Digite o "+i+"º valor");
            double valorx = Integer.parseInt(numeroA);
            resultado=resultado*valorx;
        }
        System.out.println(resultado);
    }

    public int escolherOperacao(){
        int opcao = 0;
        String escolha = "";
        do{
            System.out.println(" Menu Calculadora");
            System.out.println(" 1 - Somar");
            System.out.println(" 2 - Subtarir");
            System.out.println(" 3 - Dividir");        
            System.out.println(" 4 - Multiplicar");   
            System.out.println(" 5 - Porcentagem");
            System.out.println(" 6 - Potenciação");
            System.out.println(" 7 - Módulo");
            System.out.println(" 8 - Soma avançada");
            System.out.println(" 9 - Subtração avançada");
            System.out.println(" 10 - Multiplicação avançada");
            System.out.println(" 11 - Fatorial");
        escolha= JOptionPane.showInputDialog(null, "Escolha a opção que deseja executar: ");
        opcao = Integer.parseInt(escolha);
        }while(opcao == 0);
        return opcao;
    }

    public void realizaOperacao(int operacao){
        int valorA=0;
        int valorB=0;
        if (operacao<=11) {
            String numeroA = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
            String numeroB = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
            valorA = Integer.parseInt(numeroA);
            valorB = Integer.parseInt(numeroB);
        }
        else {
            String numeroA = JOptionPane.showInputDialog(null, "Digite o valor: ");
            valorA = Integer.parseInt(numeroA);
        }
        switch (operacao) {
            case 1:
                this.somar(valorA, valorB);
                break;
            case 2:
                this.subtrair(valorA, valorB);
                break;
            case 3:
                this.dividir(valorA, valorB);
                break;
            case 4:
                this.multiplicar(valorA, valorB);
                break;
            case 5:
                this.porcentagem(valorA, valorB);
                break;
            case 6:
                this.potencia(valorA, valorB);
                break;
            case 7:
                this.modulo(valorA, valorB);
                break;
            case 8:
                this.somaAvancada(valorA, valorB);
                break;
            case 9:
                this.subtracaoAvancada(valorA, valorB);
                break; 
            case 10:
                this.multiplicacaoAvancada(valorA, valorB);
                break;           
            case 11:
                this.fatorial(valorA);
                break;
            }       
    }
    
}