package io.github.danielfs.calculadora.operacao.geometrica;

import io.github.danielfs.calculadora.operacao.binaria.Adicao;
import io.github.danielfs.calculadora.operacao.binaria.Divisao;
import io.github.danielfs.calculadora.operacao.binaria.Multiplicacao;
import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;

public class AreaTrapezio implements OperacaoGeometrica {

    private final OperacaoBinaria adicao = new Adicao();
    private final OperacaoBinaria divisao = new Divisao();
    private final OperacaoBinaria multiplicacao = new Multiplicacao();
    
    @Override
    public double calcular(double... valores) {
        double base1 = valores[0];
        double base2 = valores[1];
        double altura = valores[2];
        
        return multiplicacao.calcular(divisao.calcular(adicao.calcular( base1, base2 ), 2), altura);
    }
    
    public double calcular(double base1, double base2, double altura) {
        return this.calcular(new double[] {base1, base2, altura});
    }
    
}
