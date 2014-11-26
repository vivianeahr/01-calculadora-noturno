package io.github.danielfs.calculadora.operacao.unaria;

public class RaizQuadrada implements OperacaoUnaria {

    @Override
    public double calcular(double operando) {
        return Math.sqrt( operando );
    }
    
}
