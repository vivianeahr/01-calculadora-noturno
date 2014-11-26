package io.github.danielfs.calculadora.operacao.unaria;

import io.github.danielfs.calculadora.operacao.binaria.Multiplicacao;
import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;

public class ValorAbsoluto implements OperacaoUnaria {

    private final OperacaoBinaria multiplicacao = new Multiplicacao();
    
    @Override
    public double calcular(double operando) {
        if( operando < 0 ) {
            return multiplicacao.calcular( operando, -1 );
        }
        
        return operando;
    }
    
}
