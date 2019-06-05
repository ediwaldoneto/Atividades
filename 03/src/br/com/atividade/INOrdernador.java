package br.com.atividade;

import java.util.Collection;

public interface INOrdernador {
	
	public void inserirColecao(Collection<String> pColecao);
	public void informarValor(String pValor);
	public double getMenorValor();
	public double getMaiorValor();
	public double getValorMedio();
	public double getValorMediano();	
}
