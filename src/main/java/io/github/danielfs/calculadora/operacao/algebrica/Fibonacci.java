package io.github.danielfs.calculadora.operacao.algebrica;

public class Fibonacci implements OperacaoAlgebrica {
    
    @Override
    public int calcular(int posicao) {
        int a = 0;
        int b = 1;
        
        for(int i = 2; i <= posicao; i++) {
            a = a + b;
            b = a - b;
        }
        
        return a;
    }
    
}
