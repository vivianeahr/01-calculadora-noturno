package io.github.danielfs.calculadora.operacao.binaria;

public class Maior implements OperacaoBinaria {

    @Override
    public double calcular(double operando1, double operando2) {
        if( operando1 > operando2 ) {
            return operando1;
        }
        
        return operando2;
    }
    
}
