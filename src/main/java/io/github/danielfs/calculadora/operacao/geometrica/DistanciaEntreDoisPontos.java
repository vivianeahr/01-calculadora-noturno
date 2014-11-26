package io.github.danielfs.calculadora.operacao.geometrica;

public class DistanciaEntreDoisPontos implements OperacaoGeometrica {
    
    @Override
    public double calcular(double... valores) {
        double x0 = valores[0];
        double y0 = valores[1];
        double x1 = valores[2];
        double y1 = valores[3];
        
        return Math.sqrt(Math.pow((x0 - x1), 2) + Math.pow((y0 - y1), 2 ));
    }
    
    public double calcular(double x0, double y0, double x1, double y1) {
        return this.calcular(new double[] {x0, y0, x1, y1});
    }
    
}
