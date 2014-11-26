package io.github.danielfs.calculadora.operacao.binaria;

public class Divisao implements OperacaoBinaria {

    @Override
    public double calcular(double operando1, double operando2) {
        return operando1 / operando2;
    }
    
}