package io.github.danielfs.calculadora.operacao.binaria;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AdicaoTest
{
    private Adicao adicao;
    
    @Before
    public void inicializar()
    {
      adicao = new adicao();
    }
    
    @Test
    public void deveriaRetornar5QuandoPassa2e3()
   {
      double valorEsperado = 5;
      double valorRetornado = adicao.calcular(2, 3);
      
      assetEquals(valorEsperado, valorRetornado, 0);
    }
}
