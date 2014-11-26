package io.github.danielfs.calculadora.operacao.unaria;

import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;
import io.github.danielfs.calculadora.operacao.binaria.Subtracao;

public class DecrementoUm implements OperacaoUnaria {

    private final OperacaoBinaria subtracao = new Subtracao();
    
    @Override
    public double calcular(double operando) {
        return subtracao.calcular( operando, 1 );
    }
    
}
