package io.github.danielfs.calculadora.operacao.algebrica;

public class Fatorial implements OperacaoAlgebrica {

    @Override
    public int calcular(int valor) {
        int resultado = 1;
        
        while(valor > 1)
            resultado *= valor--;
        
        return resultado;
    }
    
}