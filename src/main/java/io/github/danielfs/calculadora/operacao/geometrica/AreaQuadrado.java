package io.github.danielfs.calculadora.operacao.geometrica;

import io.github.danielfs.calculadora.operacao.binaria.Multiplicacao;
import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;

public class AreaQuadrado implements OperacaoGeometrica {

    private final OperacaoBinaria multiplicacao = new Multiplicacao();
    
    @Override
    public double calcular(double... valores) {
        double lado = valores[0];
        
        return multiplicacao.calcular( lado, lado );
    }
    
    public double calcular(double lado) {
        return this.calcular(new double[] {lado});
    }
    
}
