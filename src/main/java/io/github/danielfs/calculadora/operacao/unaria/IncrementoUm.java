package io.github.danielfs.calculadora.operacao.unaria;

import io.github.danielfs.calculadora.operacao.binaria.Adicao;
import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;

public class IncrementoUm implements OperacaoUnaria {
    
    private final OperacaoBinaria adicao = new Adicao();
    
    @Override
    public double calcular(double operando) {
        return adicao.calcular( operando, 1 );
    }
    
}
