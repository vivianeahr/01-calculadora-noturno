package io.github.danielfs.calculadora.operacao.binaria;

public class Exponenciacao implements OperacaoBinaria {

    @Override
    public double calcular(double operando1, double operando2) {
        return Math.pow( operando1, operando2 );
    }
    
}
