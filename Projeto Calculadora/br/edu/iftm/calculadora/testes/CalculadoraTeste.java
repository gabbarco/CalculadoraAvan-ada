package br.edu.iftm.calculadora.testes;

import br.edu.iftm.calculadora.classes.regraNegocio;

public class CalculadoraTeste {

    regraNegocio regraNegocio;

    public CalculadoraTeste(){
        this.regraNegocio = new regraNegocio();
    }

    public void iniciar(){
        int operacao = this.regraNegocio.escolherOperacao();
        this.regraNegocio.realizaOperacao(operacao);
    }

    public static void main(String[] args) {
        CalculadoraTeste c = new CalculadoraTeste();
        c.iniciar();
    }
    
}