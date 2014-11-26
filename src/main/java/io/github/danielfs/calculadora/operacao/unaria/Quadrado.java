package io.github.danielfs.calculadora.operacao.unaria;

import io.github.danielfs.calculadora.operacao.binaria.Multiplicacao;
import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;

public class Quadrado implements OperacaoUnaria {

    private final OperacaoBinaria multiplicacao = new Multiplicacao();
    
    @Override
    public double calcular(double operando) {
        return multiplicacao.calcular( operando, operando );
    }
    
}