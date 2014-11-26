package io.github.danielfs.calculadora.operacao.geometrica;

import io.github.danielfs.calculadora.operacao.binaria.Multiplicacao;
import io.github.danielfs.calculadora.operacao.binaria.OperacaoBinaria;
import io.github.danielfs.calculadora.operacao.unaria.OperacaoUnaria;
import io.github.danielfs.calculadora.operacao.unaria.Quadrado;

public class AreaCirculo implements OperacaoGeometrica {

    private final OperacaoUnaria quadrado = new Quadrado();
    private final OperacaoBinaria multiplicacao = new Multiplicacao();
    
    @Override
    public double calcular(double... valores) {
        double raio = valores[0];
        
        return multiplicacao.calcular(Math.PI, quadrado.calcular(raio));
    }
    
    public double calcular(double raio) {
        return this.calcular(new double[] {raio});
    }
    
}