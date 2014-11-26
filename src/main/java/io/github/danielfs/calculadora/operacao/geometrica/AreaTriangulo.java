package io.github.danielfs.calculadora.operacao.geometrica;

import io.github.danielfs.calculadora.operacao.binaria.Divisao;
import io.github.danielfs.calculadora.operacao.binaria.Multiplicacao;
import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;

public class AreaTriangulo implements OperacaoGeometrica {

    private final OperacaoBinaria multiplicacao = new Multiplicacao();
    private final OperacaoBinaria divisao = new Divisao();
    
    @Override
    public double calcular(double... valores) {
        double base = valores[0];
        double altura = valores[1];
        
        return divisao.calcular(multiplicacao.calcular(base, altura), 2);
    }
    
    public double calcular(double base, double altura) {
        return this.calcular(new double[] {base, altura});
    }
    
}
